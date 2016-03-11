import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


/**
 * 
 * Cette classe va crï¿½er et parcourir l'AST du code source. 
 * Il enverra les noeuds aux contrï¿½les sï¿½mantiques correspondants.
 * Les TDS sont crï¿½es et enrichies dans les contrï¿½les sï¿½mantiques.
 *
 */
public class AnalyseSemantique {
	
	private CommonTree tree;
	private boolean is_ok;
	private String err_messages;
	private ArrayList<TDS> TDSs;
	private ControleSemantique taille_tableau;
	
	public AnalyseSemantique(String file_path) throws IOException, RecognitionException{
		tree = null;
		ANTLRFileStream input = new ANTLRFileStream(file_path);
		Tiger3Lexer lexer = new Tiger3Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Tiger3Parser parser = new Tiger3Parser(tokens);
		Tiger3Parser.tiger3_return r = parser.tiger3();
		tree = (CommonTree)r.getTree();
		is_ok = true;
		err_messages = "";
		TDSs = new ArrayList<TDS>();
		
		taille_tableau = new ControleTableau();
	}
	
	public void analyze(){
		loop(tree);
	}
	
	/**
	 * Mï¿½thode rï¿½cursive pour l'analyse d'un arbre
	 * @param tree AST ï¿½ analyser
	 */
	public void loop(CommonTree current){
		try {
			checkNode(current);
		} catch (ErreurSemantique e) {
			err_messages+=e.getMessage()+"\n";
			is_ok = false;
		}
		
		for(int i = 0; i<current.getChildCount(); i++){
			loop((CommonTree) current.getChild(i));
		}
	}
	
	/**
	 * Appelle les contrï¿½les sï¿½mantiques pour le noeud en cours d'analyse
	 * @param node Noeud ï¿½ vï¿½rifier
	 * @throws ErreurSemantique
	 */
	public void checkNode(CommonTree node) throws ErreurSemantique{
		//En fonction du type du noeud, on appelle diffï¿½rents contrï¿½les sï¿½mantiques
		switch(node.getToken().getText()){
			//Déclaration d'une variable
			case "var":
				//alimenter la TDS
				Field newfield = new Field(node.getChild(0).getText(), "Variable", null, null, 0, 0, 0);
				break;
				
			//Dï¿½claration d'un type
			case "type":
				break;
				
			//Dï¿½claration d'une fonction
			case "FUNC_DECL":
				break;
				
			case "BLOCK":
				//Quand on entre dans un bloc on augmente l'imbrication
				TDS.NB_IMBR++;
				break;
				
			//Appel d'une fonction
			case "FUNC_CALL":
				break;
				
			//Affectation
			case ":=":
				break;
				
			//Condition
			case "COND":
				break;
				
			// Boucle for
			case "for":
				//on incrémente le for en plus de son bloc (les vars déclarées dans le for sont dans un
				//bloc supérieur au bloc lui-même
				TDS.NB_IMBR++;
				break;
				
			case "if":
				TDS.NB_IMBR++;
				break;
			
			case "then":
				//Les vars du if sont accessibles depuis le then et le else
				TDS.NB_IMBR++;
				break;
				
			case "else":
				TDS.NB_IMBR++;
				break;
				
			case "while":
				TDS.NB_IMBR++;
				break;
			
			//L'une des quatre opï¿½rations binaires
			case "+":
			case "-":
			case "*":
			case "/":
				break;
				
			//Accï¿½s ï¿½ une case d'un tableau
			case "CELL":
				break;
			
			//Dï¿½finition dela taille d'un tableau
			case "SIZE":
					taille_tableau.check(node, TDSs);
				break;
		}
	}
	
	public boolean isOK(){
		return is_ok;
	}
	
	public String getErrors(){
		return err_messages;
	}
	
	public static void main(String[] args){
			
			//On vï¿½rifie qu'on a bien le chemin du fichier en paramï¿½tre
			if(args.length != 1){
				System.err.println("Usage : java -cp ./Analyse_lexicale_et_syntaxique/antlr-3.3-complete.jar AnalyseAnalyseSemantique file_name");
				System.exit(1);
			}
			
			AnalyseSemantique analyzer = null;
			try {
				analyzer = new AnalyseSemantique(args[0]);
			} catch (IOException | RecognitionException e) {
				System.err.println("Erreur lors de la lecture de l'AST : "+e.getMessage());
				System.exit(2);
			}
						
			analyzer.analyze();
			
			if(analyzer.isOK()){
				System.out.println("L'analyse sï¿½mantique n'a dï¿½tectï¿½ aucun problï¿½me !");
			}else{
				System.err.println(analyzer.getErrors());
			}
		}
		
	}
