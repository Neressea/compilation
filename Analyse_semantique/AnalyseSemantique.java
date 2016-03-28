import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


/**
 * 
 * Cette classe va cr�er et parcourir l'AST du code source. 
 * Il enverra les noeuds aux contr�les s�mantiques correspondants.
 * Les TDS sont cr�es et enrichies dans les contr�les s�mantiques.
 *
 */
public class AnalyseSemantique {
	
	private CommonTree tree;
	private boolean is_ok;
	private String err_messages;
	private ArrayList<TDS> TDSs;
	private ArrayList<TDS> pile;
	private ControleSemantique taille_tableau, retour_fonction, nbparams, existencefonction, existencetype, type_params_func_call, doubledecl, typage;
	
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
		
		//On cr�e une TDS qui contient les fonctions de base du langage : print et read
		TDS base = new TDSLet(0);
		
		FieldFonction fprint = new FieldFonction("print", 0, "UNDEFINED");
		fprint.addParam("s", "string");
		base.add(fprint);
		
		FieldFonction fread = new FieldFonction("read", base.getCurrentSize(), "int");
		base.add(fread);
		
		openTDS(base);
	}
	
	public void fire(ControleSemantique cs) {
		try {
			cs.check(pile);
		} catch (ErreurSemantique e2) {
			err_messages+=e2.getMessage()+"\n";
			is_ok=false;
		}
	}
	
	public void analyze(){
		loop(tree);
	}
	
	/**
	 * M�thode r�cursive pour l'analyse d'un arbre
	 * @param tree AST � analyser
	 */
	public void loop(CommonTree current){
			checkNode(current);	
	}
	
	/**
	 * Appelle les contr�les s�mantiques pour le noeud en cours d'analyse
	 * @param node Noeud � v�rifier
	 * @throws ErreurSemantique
	 */
	public void checkNode(CommonTree node) {
		//En fonction du type du noeud, on appelle diff�rents contr�les s�mantiques
		TDS current = null;
		
		if(pile.size()>0) current = top();
		
		switch(node.getToken().getText()){
			//D�claration d'une variable
			case "var":
				doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(doubledecl);
				//On a un tableau
				if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("SIZE")){
				
					existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
					fire(existencetype);
					
					ExpressionArithmetique ea_init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0));
					ExpressionArithmetique ea_taille = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(0).getChild(0));
					
					try {
						ea_init.computeType(pile);
						ea_taille.computeType(pile);
					} catch (ErreurSemantique e) {
						err_messages+=e.getMessage()+"\n";
						is_ok=false;
					}
					
					current.add(new FieldTableau(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText(), (CommonTree) node.getChild(1).getChild(0).getChild(0), (CommonTree) node.getChild(1).getChild(1).getChild(0)));
					
				//On a une variable
				}else if((node.getChildCount() == 2 && !node.getChild(1).getText().equals("STRUCT")) || (node.getChildCount() == 3)){	
					
					ExpressionArithmetique ea;
					
					//Le type n'est pas indiqu�
					if(node.getChildCount() == 2){
						ea = new ExpressionArithmetique((CommonTree) node.getChild(1));
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizePrimitif(node.getChild(1).getText()), (isInteger(node.getChild(1).getText())?"int":"string")));
						//Le type est indiqu�
					}else{
					
						existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
						fire(existencetype);
						
						ea = new ExpressionArithmetique((CommonTree) node.getChild(2));
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText()));
					}	
					
					//Vérifie existence des variales aupassage
					try {
						ea.computeType(pile);
					} catch (ErreurSemantique e) {
						err_messages+=e.getMessage()+"\n";
						is_ok=false;
					}
					
				//On a une structure
				}else {
				
					existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
					fire(existencetype);
				
										
					FieldStructure fs = new FieldStructure(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText());
					ExpressionArithmetique ea;
					for(int i=0; i<node.getChild(1).getChildCount();i++){
						CommonTree ct = (CommonTree) node.getChild(1).getChild(i);
						ea = new ExpressionArithmetique((CommonTree) ct.getChild(0));
						try {
							ea.computeType(pile);
						} catch (ErreurSemantique e) {
							err_messages+=e.getMessage()+"\n";
							is_ok=false;
						}
						fs.addChamp(ct.getText(), ct.getChild(0).getText());
					}
					
					current.add(fs);
				}
					
				analyseChild(node);
				break;
				
			//D�claration d'un type
			case "type":
				String type = null;
				FieldTypeDef definition = null;
				int taille=0;
				type = node.getChild(1).getChild(0).getText();
				doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(doubledecl);
				
				switch (node.getChild(1).getText()) {
					case "PRIMITIF":
						//Variable indique que c'est un type primitif
						taille = computeSizeType(node.getChild(1).getChild(0).getText());
						definition = new FieldTypeDefSimple(node.getChild(0).getText(), current.getCurrentSize(), taille, type);
						existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(existencetype);
						break;
						
					case "TAB":
						//@ du premier �l�ment du tableau + taille d'un entier pour la borne sup du tableau
						taille = SIZE_PRIMITIF * 2;
						definition = new FieldTypeDefTableau(node.getChild(0).getText(), current.getCurrentSize(), taille, type);
						existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(existencetype);
						break;
						
					case "STRUCT":	
						
						for(int i=0; i<node.getChild(1).getChildCount(); i++){
							System.out.println("AA : "+i);
							
							existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(i).getChild(1));
							fire(existencetype);
							taille+=computeSizeType(node.getChild(1).getChild(i).getChild(1).getText());
							
						}
						
						definition = new FieldTypeDefStructure(node.getChild(0).getText(), current.getCurrentSize(), taille);
						
						for(int i=0; i<node.getChild(1).getChildCount(); i++){
							CommonTree ct = (CommonTree) node.getChild(1).getChild(i);
							((FieldTypeDefStructure) definition).addChampType(ct.getChild(0).getText(), ct.getChild(1).getText());
						}
						
						break;
				}

				current.add(definition);
				analyseChild(node);
				break;
				
			//D�claration d'une fonction
			case "FUNC_DECL":
				FieldFonction ff = null;
				
				doubledecl = new ControleDoubleDeclaration(node);
				fire(doubledecl);
			
								
				//Si on a le type qui est pr�cis�
				if(node.getChildCount() == 4){
					existencetype = new ControleExistenceType((CommonTree) node.getChild(2).getChild(0));
					fire(existencetype);
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), node.getChild(2).getChild(0).getText());
				
					//On ajoute les param�tres formels
					for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
						
						doubledecl = new ControleDoubleDeclaration((CommonTree) node.getChild(1).getChild(i));
						fire(doubledecl);
						
						ff.addParam(node.getChild(1).getChild(i).getChild(0).getText(), node.getChild(1).getChild(i).getChild(1).getText());
					}
					
				}else if(node.getChildCount() == 3){
					//Deux cas avec les 3 fils : soit params, soit type. On v�rifie par ternaire et si c'est type on envoie le type sinon UNDEFINED
					if((node.getChild(1).getText().equals("TYPE"))){
						existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(existencetype);
						ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), node.getChild(1).getChild(0).getText());
					}else{
						ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), "UNDEFINED");
					}
					
					if (node.getChild(1).getText().equals("PARAMSFORM")){
						for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
					
							doubledecl = new ControleDoubleDeclaration((CommonTree) node.getChild(1).getChild(i));
							fire(doubledecl);
						
							ff.addParam(node.getChild(1).getChild(i).getChild(0).getText(), node.getChild(1).getChild(i).getChild(1).getText());
						}
					}
					
				}else
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), "UNDEFINED");
				
				current.add(ff);
				createTDSFunc(node);
				
				
				
				analyseChild(node);
				closeTDS();
				//On contr�le le type de retour de la fonction
				retour_fonction = new ControleRetourFonction(node);
				fire(retour_fonction);
				break;
			
			case "BLOCK":
				//Quand on entre dans un bloc on augmente l'imbrication
				analyseChild(node);
				break;
			
			//Appel d'une fonction
			case "FUNC_CALL":
				existencefonction = new ControleExistenceFonction(node);
				fire(existencefonction);
				nbparams = new ControleNbParamFonction(node);
				fire(nbparams);
				type_params_func_call = new ControleTypeParamFonction(node);
				fire(type_params_func_call);
				
				analyseChild(node);
				break;
				
			//Affectation
			case ":=":
				typage = new ControleTypage((CommonTree) node.getChild(1), (CommonTree) node.getChild(0));
				fire(typage);
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
				//on incr�mente le for en plus de son bloc (les vars d�clar�es dans le for sont dans un
				//bloc sup�rieur au bloc lui-m�me
				createTDSFor(node);
				analyseChild(node);
				closeTDS();
				typage = new ControleTypage((CommonTree) node.getChild(0).getChild(0), (CommonTree) node.getChild(0));
				fire(typage);
				
				typage = new ControleTypage((CommonTree) node.getChild(0).getChild(1), (CommonTree) node.getChild(0));
				fire(typage);
				doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(doubledecl);
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
			
			//L'une des quatre op�rations binaires
			case "+":
			case "-":
			case "*":
			case "/":
			case "NEG":
				//on cr�e une expression correspondant au noeud en cours.
				ExpressionArithmetique ea2 = new ExpressionArithmetique(node);
				try {
					ea2.computeType(pile);
				} catch (ErreurSemantique e) {
					err_messages+=e.getMessage()+"\n";
					is_ok=false;
				}
				break;
				
			//Acc�s � une case d'un tableau
			case "CELL":
				analyseChild(node);
				break;
			
			//D�finition dela taille d'un tableau
			case "SIZE":
				taille_tableau = new ControleTableau(node);
				fire(taille_tableau);
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
		newTDS.add(new FieldVariable(node.getChild(0).getText(), top().getCurrentSize(), SIZE_PRIMITIF, "int"));
	}
	
	/**
	 * Retourne le sommet de la pile des TDSs
	 * @return
	 */
	private TDS top(){
		return pile.get(pile.size()-1);
	}
	
	private void createTDSFunc(CommonTree node){
		TDS newTDS = new TDSFunc(pile.size());
		
		//On ajoute la TDS � la pile
		openTDS(newTDS);
		
		//Si on a le type et les param�tres qui sont pr�cis�s
		if(node.getChildCount() == 4){
			
			//On ajoute les param�tres formels � la TDS de la fonction
			FieldVariable fv;
			for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
				CommonTree p = (CommonTree) node.getChild(1).getChild(i);
				fv = new FieldVariable(p.getChild(0).getText(), top().getCurrentSize(), computeSizeType(p.getChild(1).getText()), p.getChild(1).getText());
				newTDS.add(fv);
			}
			
		//Si on a que les param�tres qui sont pr�cis�s
		}else if(node.getChildCount() == 3 && node.getChild(1).getText().equals("PARAMSFORM")){

			//On ajoute les param�tres formels � la TDS de la fonction
			FieldVariable fv;
			for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
				fv = new FieldVariable(node.getChild(1).getChild(i).getChild(0).getText(), top().getCurrentSize(), computeSizeType(node.getChild(1).getChild(i).getChild(1).getText()), node.getChild(1).getChild(i).getChild(1).getText());
				newTDS.add(fv);
			}
		}
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
				FieldTypeDef ftd = (FieldTypeDef) TDS.findIn(pile, id, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
				size = ftd.getTaille();
				break;
		}
				
		return size;
	}
	
	private int computeSizePrimitif(String primit){
		int size=0;
		try{
			//Si le cast marche, alors c'est un int et la taille est celle d'un �l�ment primitif
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
			//Si le cast marche, alors c'est un int et la taille est celle d'un �l�ment primitif
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
			
			//On v�rifie qu'on a bien le chemin du fichier en param�tre
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
				System.out.println("--------- TDS n� "+i+++" ---------");
				System.out.println(tds);
				System.out.println("----------------------------");
			}
			
			if(analyzer.isOK()){
				System.out.println("L'analyse semantique n'a detecte aucun probleme !");
			}else{
				System.err.println(analyzer.getErrors());
			}
		}
		
	}
