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
	public static ArrayList<TDS> pile;
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
		pile = new ArrayList<TDS>();
		
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
	}
	
	/**
	 * Appelle les contrï¿½les sï¿½mantiques pour le noeud en cours d'analyse
	 * @param node Noeud ï¿½ vï¿½rifier
	 * @throws ErreurSemantique
	 */
	public void checkNode(CommonTree node) throws ErreurSemantique{
		//En fonction du type du noeud, on appelle diffï¿½rents contrï¿½les sï¿½mantiques
		TDS current = pile.get(pile.size()-1);
		switch(node.getToken().getText()){
			//D"claration d'une variable
			case "var":
				if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("SIZE")){
					//On a un tableau
					current.add(new FieldTableau(node.getChild(0).getText(), current.getCurrentSize(), taille, FieldType.FieldTableau));
				}else if(node.getChild(1).getChildCount() >= 2 && node.getChild(1).getChildCount() == 0){
					//On a une variable
					if(node.getChild(1).getChildCount() == 2){
						//current.add(new FieldVariable(node.getChild(0).getText(), taille_du_saut, taille_min, type));
					}else{
						ControleExistenceType cet = new ControleExistenceType(node);
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), cet.computeSize(), node.getChild(1).getText()));
					}	
				}else if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("STRUCT")){
					FieldStructure fs = new FieldStructure(node.getChild(0).getText(), current.getCurrentSize(), taille);
					
					for(int i=0; i<node.getChild(1).getChildCount();i++){
						CommonTree ct = (CommonTree) node.getChild(1).getChild(i);
						fs.addChamp(ct.getChild(0).getText(), ct.getChild(1).getText());
					}
					
					current.add(fs);
				}
					
				analyseChild(node);
				break;
				
			//Dï¿½claration d'un type
			case "type":
				analyseChild(node);
				break;
				
			//Dï¿½claration d'une fonction
			case "FUNC_DECL":
				FieldFonction ff = null;
				
				//Si on a le type qui est précisé
				if(node.getChildCount() == 4){
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), taille, node.getChild(2).getText());
				
					//On ajoute 
				}else if(node.getChildCount() == 3){
					//Deux cas avec les 3 fils : soit params, soit type. On vérifie par ternaire et si c'est type on envoie le type sinon UNDEFINED
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), taille, (node.getChild(1).getText().equals("TYPE"))?node.getChild(1).getText():"UNDEFINED");
				}else
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), taille, "UNDEFINED");
				
				current.add(ff);
				createTDSFunc(node);
				analyseChild(node);
				closeTDS();
				break;
			
			case "BLOCK":
				//Quand on entre dans un bloc on augmente l'imbrication
				analyseChild(node);
				break;
			
				
			//Appel d'une fonction
			case "FUNC_CALL":
				analyseChild(node);
				break;
				
			//Affectation
			case ":=":
				analyseChild(node);
				break;
				
			//Condition
			case "COND":
				analyseChild(node);
				break;
				
			case "let":
				createTDSLet(node);
				analyseChild(node);
				closeTDS();
				break;
				
			// Boucle for
			case "for":
				//on incrï¿½mente le for en plus de son bloc (les vars dï¿½clarï¿½es dans le for sont dans un
				//bloc supï¿½rieur au bloc lui-mï¿½me
				createTDSFor(node);
				analyseChild(node);
				closeTDS();
				break;
				
			case "if":
				analyseChild(node);
				break;
			
			case "then":
				analyseChild(node);
				//Les vars du if sont accessibles depuis le then et le else
				break;
				
			case "else":
				analyseChild(node);
				break;
				
			case "while":
				analyseChild(node);
				break;
			
			//L'une des quatre opï¿½rations binaires
			case "+":
			case "-":
			case "*":
			case "/":
				break;
				
			//Accï¿½s ï¿½ une case d'un tableau
			case "CELL":
				analyseChild(node);
				break;
			
			//Dï¿½finition dela taille d'un tableau
			case "SIZE":
				taille_tableau.check(node, pile);
				analyseChild(node);
				break;
				
			case "PARAMSFORM":
				analyseChild(node);
				break;
		}
		
		
		// provisoire! A enlever par la suite et ajouter a certains cas superieurs
	}
	
	private void analyseChild(CommonTree node){
		for(int i = 0; i<node.getChildCount(); i++){
			loop((CommonTree) node.getChild(i));
		}
	}
	
	private void createTDSFor(CommonTree node){
		TDS newTDS = new TDSFor();
		openTDS(newTDS);
	}
	
	private void createTDSFunc(CommonTree node){
		TDS newTDS = new TDSFunc();
		openTDS(newTDS);
	}
	
	private void createTDSLet(CommonTree node){
		TDS newTDS = new TDSLet();
		openTDS(newTDS);
	}
	
	private void openTDS(TDS tds){
		this.TDSs.add(tds);
		this.pile.add(tds);
		TDS.NB_IMBR++;
	}
	
	private void closeTDS(){
		this.pile.remove(this.pile.size()-1);
		TDS.NB_IMBR--;
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
