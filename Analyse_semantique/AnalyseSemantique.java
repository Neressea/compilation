import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


/**
 * 
 * Cette classe va créer et parcourir l'AST du code source. 
 * Il enverra les noeuds aux contrôles sémantiques correspondants.
 * Les TDS sont crées et enrichies dans les contrôles sémantiques.
 *
 */
public class AnalyseSemantique {
	
	private CommonTree tree;
	private boolean is_ok;
	private String err_messages;
	
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
	}
	
	/**
	 * Méthode pour lancer la récursion
	 */
	public void analyze(){
		CommonTree current = tree;	
	}
	
	/**
	 * Méthode récursive pour l'analyse d'un arbre
	 * @param tree AST à analyser
	 */
	public void loop(CommonTree current){
		try {
			checkNode(current);
		} catch (ErreurSemantique e) {
			err_messages+=e.getMessage();;
			is_ok = false;
		}
		
		for(int i = 0; i<current.getChildCount(); i++){
			loop((CommonTree) current.getChild(i));
		}
	}
	
	/**
	 * Appelle les contrôles sémantiques pour le noeud en cours d'analyse
	 * @param node Noeud à vérifier
	 * @throws ErreurSemantique
	 */
	public void checkNode(CommonTree node) throws ErreurSemantique{
		//En fonction du type du noeud, on appelle différents contrôles sémantiques
		switch(node.getToken().getText()){
			//Déclaration d'une variable
			case "var":
				break;
				
			//Déclaration d'un type
			case "type":
				break;
				
			//Déclaration d'une fonction
			case "FUNC_DECL":
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
				break;
			
			//L'une des quatre opérations binaires
			case "+":
			case "-":
			case "*":
			case "/":
				break;
				
			//Accès à une case d'un tableau
			case "CELL":
				break;
			
			//Définition dela taille d'un tableau
			case "SIZE":
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
			
			//On vérifie qu'on a bien le chemin du fichier en paramètre
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
				System.out.println("L'analyse sémantique n'a détecté aucun problème !");
			}else{
				System.err.println(analyzer.getErrors());
			}
		}
		
	}
