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
	private ArrayList<TDS> pile;
	private ControleSemantique taille_tableau;
	
	private static final int SIZE_PRIMITIF = 8;
	
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
		TDS current = null;
		
		if(pile.size()>0) current = pile.get(pile.size()-1);
		
		switch(node.getToken().getText()){
			//Déclaration d'une variable
			case "var":
				//On a un tableau
				if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("SIZE")){
					
					current.add(new FieldTableau(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText(), (CommonTree) node.getChild(1).getChild(0)));
					
				//On a une variable
				}else if(node.getChildCount() >= 2 && node.getChild(1).getChildCount() == 0){	
					
					//Le type n'est pas indiqué
					if(node.getChildCount() == 2){
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizePrimitif(node.getChild(1).getText()), (isInteger(node.getChild(1).getText())?"int":"string")));
						
					//Le type est indiqué
					}else{
						ControleExistenceType cet = new ControleExistenceType(node);
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText()));
					}	
					
				//On a une structure
				}else if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("STRUCT")){
					
					FieldStructure fs = new FieldStructure(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()));
					
					for(int i=0; i<node.getChild(1).getChildCount();i++){
						CommonTree ct = (CommonTree) node.getChild(1).getChild(i);
						fs.addChamp(ct.getChild(0).getText(), ct.getChild(1).getText());
					}
					
					current.add(fs);
				}
					
				analyseChild(node);
				break;
				
			//Déclaration d'un type
			case "type":
				FieldType type = null;
				int taille=0;
				
				switch (node.getChild(1).getText()) {
					case "PRIMITIF":
						//Variable indique que c'est un type primitif
						type = FieldType.FieldVariable;
						taille = computeSizeType(node.getChild(1).getChild(0).getText());
						break;
						
					case "TAB":
						type = FieldType.FieldTableau;
						
						//@ du premier élément du tableau + taille d'un entier pour la borne sup du tableau
						taille = SIZE_PRIMITIF * 2;
						break;
						
					case "STRUCT":
						type = FieldType.FieldStructure;
						for(int i=0; i<node.getChild(1).getChildCount(); i++){
							taille+=computeSizeType(node.getChild(1).getChild(i).getChild(1).getText());
						}
						
						break;
				}

				current.add(new FieldTypeDef(node.getChild(0).getText(), current.getCurrentSize(), taille, type));
				analyseChild(node);
				break;
				
			//Dï¿½claration d'une fonction
			case "FUNC_DECL":
				FieldFonction ff = null;
								
				//Si on a le type qui est précisé
				if(node.getChildCount() == 4){
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), node.getChild(2).getText());
				
					//On ajoute les paramètres formels
					for (int i = 0; i < node.getChild(2).getChildCount(); i++) {
						ff.addParam(node.getChild(2).getChild(i).getChild(0).getText(), node.getChild(2).getChild(i).getChild(1).getText());
					}
					
				}else if(node.getChildCount() == 3){
					//Deux cas avec les 3 fils : soit params, soit type. On vérifie par ternaire et si c'est type on envoie le type sinon UNDEFINED
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), (node.getChild(1).getText().equals("TYPE"))?node.getChild(1).getText():"UNDEFINED");
				
					if (node.getChild(1).getText().equals("TYPE")){
						for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
							ff.addParam(node.getChild(1).getChild(i).getChild(0).getText(), node.getChild(1).getChild(i).getChild(1).getText());
						}
					}
				}else
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), "UNDEFINED");
				
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
				pile.get(pile.size()-1).add(new FieldVariable(node.getChild(0).getText(), pile.get(pile.size()-1).getCurrentSize(), SIZE_PRIMITIF, "int"));
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
				taille_tableau = new ControleTableau(node);
				taille_tableau.check(pile);
				analyseChild(node);
				break;
				
			case "PARAMSFORM":
				analyseChild(node);
				break;
				
			default:
				analyseChild(node);
		}		
	}
	
	private void analyseChild(CommonTree node){
		for(int i = 0; i<node.getChildCount(); i++){
			loop((CommonTree) node.getChild(i));
		}
	}
	
	private void createTDSFor(CommonTree node){
		TDS newTDS = new TDSFor(pile.size());
		openTDS(newTDS);
	}
	
	private void createTDSFunc(CommonTree node){
		TDS newTDS = new TDSFunc(pile.size());
		openTDS(newTDS);
	}
	
	private void createTDSLet(CommonTree node){
		TDS newTDS = new TDSLet(pile.size());
		openTDS(newTDS);
	}
	
	private void openTDS(TDS tds){
		this.TDSs.add(tds);
		this.pile.add(tds);
	}
	
	private void closeTDS(){
		this.pile.remove(this.pile.size()-1);
	}
	
	private int computeSizeType(String id){
		
		int size;
		switch (id) {
			case "int":
			case "string":
				size = SIZE_PRIMITIF;
				break;
			default:
				FieldTypeDef ftd = null;
				
				for(int i=pile.size()-1; i>=0;i--){
					ftd = (FieldTypeDef) pile.get(i).existIn(id, FieldType.FieldTypeDef);
					if(ftd != null) break;
				}
											
				size = ftd.getTaille();
				break;
		}
				
		return size;
	}
	
	private int computeSizePrimitif(String primit){
		int size=0;
		try{
			//Si le cast marche, alors c'est un int et la taille est celle d'un élément primitif
			Integer.parseInt(primit);
			size = SIZE_PRIMITIF;
		}catch(Exception e){
			//On ne prend pas en compte les deux ""
			size = SIZE_PRIMITIF * (primit.length()-2);
		}
		
		return size;
	}
	
	private boolean isInteger(String primit){
		boolean is_int = true;
		try{
			//Si le cast marche, alors c'est un int et la taille est celle d'un élément primitif
			Integer.parseInt(primit);
		}catch(Exception e){
			is_int = false;
		}
		
		return is_int;
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
			
			int i=1;
			for(TDS tds : analyzer.TDSs){
				System.out.println("--------- TDS n° "+i+++" ---------");
				System.out.println(tds);
				System.out.println("----------------------------");
			}
			
			if(analyzer.isOK()){
				System.out.println("L'analyse sï¿½mantique n'a dï¿½tectï¿½ aucun problï¿½me !");
			}else{
				System.err.println(analyzer.getErrors());
			}
		}
		
	}
