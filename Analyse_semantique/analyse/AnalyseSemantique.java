package analyse;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import analyse.Tiger3Parser.tiger3_return;


/**
 * 
 * Cette classe va crï¿½er et parcourir l'AST du code source. 
 * Il enverra les noeuds aux contrï¿½les sï¿½mantiques correspondants.
 * Les TDS sont crï¿½es et enrichies dans les contrï¿½les sï¿½mantiques.
 *
 */
public class AnalyseSemantique {
	
	private String type_block;
	private CommonTree tree;
	private boolean is_ok;
	private String err_messages;
	private ArrayList<TDS> TDSs;
	private ArrayList<TDS> pile;
	private ControleSemantique ctrl_taille_tableau, ctrl_retour_fonction, ctrl_nbparams, ctrl_existencefonction, ctrl_existencetype, ctrl_type_params_func_call, ctrl_doubledecl, ctrl_typage, ctrl_bool, ctrl_acces;
	
	private static final int SIZE_PRIMITIF = 8;
	
	public AnalyseSemantique(String file_path) throws IOException, RecognitionException{
		tree = null;
		ANTLRFileStream input = new ANTLRFileStream(file_path);
		Tiger3Lexer lexer = new Tiger3Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Tiger3Parser parser = new Tiger3Parser(tokens);
		Tiger3Parser.tiger3_return r = parser.tiger3();
		tree = (CommonTree)r.getTree();
		if(parser.getNumberOfSyntaxErrors()>0){
			throw new IOException("Une erreur syntaxique est survenue");
		}
		is_ok = true;
		err_messages = "";
		TDSs = new ArrayList<TDS>();
		pile = new ArrayList<TDS>();
		
		//On crï¿½e une TDS qui contient les fonctions de base du langage : print et read
		TDS base = new TDSLet(0);
		
		FieldFonction fprint = new FieldFonction("print", 0, "UNDEFINED");
		fprint.addParam("s", "string");
		base.add(fprint);
		
		FieldFonction fread = new FieldFonction("read", base.getCurrentSize(), "int");
		base.add(fread);
		
		openTDS(base);
	}
	
	public AnalyseSemantique(CommonTree node){
		tree=node;
		
		is_ok = true;
		err_messages = "";
		TDSs = new ArrayList<TDS>();
		pile = new ArrayList<TDS>();
		
		//On crï¿½e une TDS qui contient les fonctions de base du langage : print et read
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
	
	public void analyze(ArrayList<TDS> Pile){
		this.pile = Pile;
		loop(tree);
	}
	
	/**
	 * Mï¿½thode rï¿½cursive pour l'analyse d'un arbre
	 * @param tree AST ï¿½ analyser
	 */
	public void loop(CommonTree current){
			checkNode(current);	
	}
	
	/**
	 * Appelle les contrï¿½les sï¿½mantiques pour le noeud en cours d'analyse
	 * @param node Noeud ï¿½ vï¿½rifier
	 * @throws ErreurSemantique
	 */
	public void checkNode(CommonTree node) {
		//En fonction du type du noeud, on appelle diffï¿½rents contrï¿½les sï¿½mantiques
		TDS current = null;
		
		if(pile.size()>0) current = top();
		
		switch(node.getToken().getText()){
			//Dï¿½claration d'une variable
			case "var":
				ctrl_doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(ctrl_doubledecl);
				
				//On a un tableau
				if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("SIZE")){
				
					ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
					fire(ctrl_existencetype);
					
					Expression ea_init = new Expression((CommonTree) node.getChild(1).getChild(1).getChild(0));
					Expression ea_taille = new Expression((CommonTree) node.getChild(1).getChild(0).getChild(0));
					
					current.add(new FieldTableau(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText(), (CommonTree) node.getChild(1).getChild(0).getChild(0), (CommonTree) node.getChild(1).getChild(1).getChild(0)));
					
				//On a une variable
				}else if((node.getChildCount() == 2 && TDS.findIn(pile, node.getChild(1).getText(), FieldType.FieldTypeDefStructure)==null) || (node.getChildCount() == 3)){	
					
					Expression ea;
					
					//Le type n'est pas indiquï¿½
					if(node.getChildCount() == 2){
						ea = new Expression((CommonTree) node.getChild(1));
						String type_primitif=null;
							try {
								type_primitif = ea.computeType(pile);
								current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizePrimitif(node.getChild(1).getText()), type_primitif));
							} catch (ErreurSemantique e) {}
						}else{
					
						ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
						fire(ctrl_existencetype);
						
						ea = new Expression((CommonTree) node.getChild(2));
						current.add(new FieldVariable(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText()));
					}	
					
					//VÃ©rifie existence des variales aupassage
					try {
						ea.computeType(pile);
					} catch (ErreurSemantique e) {
						err_messages+=e.getMessage()+"\n";
						is_ok=false;
					}
					
				//On a une structure
				}else {
				
					ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1));
					fire(ctrl_existencetype);
				
										
					FieldStructure fs = new FieldStructure(node.getChild(0).getText(), current.getCurrentSize(), computeSizeType(node.getChild(1).getText()), node.getChild(1).getText());
					Expression ea;
					for(int i=0; i<node.getChild(1).getChildCount();i++){
						CommonTree ct = (CommonTree) node.getChild(1).getChild(i);
						ea = new Expression((CommonTree) ct.getChild(0));
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
				
				ctrl_typage = new ControleTypageDeclaration(node);
				fire(ctrl_typage);
					
				analyseChild(node);
				break;
				
			//Declaration d'un type
			case "type":
				String type = null;
				FieldTypeDef definition = null;
				int taille=0;
				type = node.getChild(1).getChild(0).getText();
				ctrl_doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(ctrl_doubledecl);
				
				switch (node.getChild(1).getText()) {
					case "PRIMITIF":
						//Variable indique que c'est un type primitif
						taille = computeSizeType(node.getChild(1).getChild(0).getText());
						definition = new FieldTypeDefSimple(node.getChild(0).getText(), current.getCurrentSize(), taille, type);
						ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(ctrl_existencetype);
						break;
						
					case "TAB":
						//@ du premier ï¿½lï¿½ment du tableau + taille d'un entier pour la borne sup du tableau
						taille = SIZE_PRIMITIF * 2;
						definition = new FieldTypeDefTableau(node.getChild(0).getText(), current.getCurrentSize(), taille, type);
						ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(ctrl_existencetype);
						break;
						
					case "STRUCT":	
						
						for(int i=0; i<node.getChild(1).getChildCount(); i++){							
							ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(i).getChild(1));
							fire(ctrl_existencetype);
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
				
			//Dï¿½claration d'une fonction
			case "FUNC_DECL":
				FieldFonction ff = null;
				
				ctrl_doubledecl = new ControleDoubleDeclaration(node);
				fire(ctrl_doubledecl);
			
								
				//Si on a le type qui est prï¿½cisï¿½
				if(node.getChildCount() == 4){
					ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(2).getChild(0));
					fire(ctrl_existencetype);
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), node.getChild(2).getChild(0).getText());
				
					//On ajoute les paramï¿½tres formels
					for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
						
						ctrl_doubledecl = new ControleDoubleDeclaration((CommonTree) node.getChild(1).getChild(i));
						fire(ctrl_doubledecl);
						
						ff.addParam(node.getChild(1).getChild(i).getChild(0).getText(), node.getChild(1).getChild(i).getChild(1).getText());
					}
					
				}else if(node.getChildCount() == 3){
					//Deux cas avec les 3 fils : soit params, soit type. On vï¿½rifie par ternaire et si c'est type on envoie le type sinon UNDEFINED
					if((node.getChild(1).getText().equals("TYPE"))){
						ctrl_existencetype = new ControleExistenceType((CommonTree) node.getChild(1).getChild(0));
						fire(ctrl_existencetype);
						ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), node.getChild(1).getChild(0).getText());
					}else{
						ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), "UNDEFINED");
					}
					
					if (node.getChild(1).getText().equals("PARAMSFORM")){
						for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
					
							ctrl_doubledecl = new ControleDoubleDeclaration((CommonTree) node.getChild(1).getChild(i));
							fire(ctrl_doubledecl);
						
							ff.addParam(node.getChild(1).getChild(i).getChild(0).getText(), node.getChild(1).getChild(i).getChild(1).getText());
						}
					}
					
				}else
					ff = new FieldFonction(node.getChild(0).getText(), current.getCurrentSize(), "UNDEFINED");
				
				current.add(ff);
				createTDSFunc(node);
				
				//On contrï¿½le le type de retour de la fonction
				ctrl_retour_fonction = new ControleRetourFonction(node);
				fire(ctrl_retour_fonction);
				
				analyseChild(node);
				closeTDS();
				
				break;
			
			case "BLOCK":
				//Quand on entre dans un bloc on augmente l'imbrication
				analyseChild(node);
				break;
			
			//Appel d'une fonction
			case "FUNC_CALL":
				ctrl_existencefonction = new ControleExistenceFonction(node);
				fire(ctrl_existencefonction);
				ctrl_nbparams = new ControleNbParamFonction(node);
				fire(ctrl_nbparams);
				ctrl_type_params_func_call = new ControleTypeParamFonction(node);
				fire(ctrl_type_params_func_call);
				
				analyseChild(node);
				break;
				
			//Affectation
			case ":=":
				ctrl_typage = new ControleTypageAffect(node);
				fire(ctrl_typage);
				analyseChild(node);
				break;
				
			//Condition
			case "COND":
				analyseChild(node);
				break;
				
			case "let":
				createTDSLet(node);
				analyseChild(node);
				type_block="UNDEFINED";
				if(node.getChildCount() == 2){
					CommonTree last = (CommonTree) node.getChild(1).getChild(node.getChild(1).getChildCount()-1);
					try {
						type_block = new Expression(last).computeType(pile);
					} catch (ErreurSemantique e1) {
						err_messages+="Erreur à la ligne "+last.getLine()+" : "+e1.getMessage();
					}
				}
				closeTDS();
				break;
				
			// Boucle for
			case "for":
				//on incrï¿½mente le for en plus de son bloc (les vars dï¿½clarï¿½es dans le for sont dans un
				//bloc supï¿½rieur au bloc lui-mï¿½me
				createTDSFor(node);
				
				ctrl_typage = new ControleTypageFor(node);
				fire(ctrl_typage);
				analyseChild(node);
				
				closeTDS();
				
				ctrl_doubledecl = new ControleDoubleDeclaration((CommonTree) node);
				fire(ctrl_doubledecl);
				
				break;
				
			case "if":
				ctrl_bool = new ControleBool((CommonTree) node.getChild(0).getChild(0));
				fire(ctrl_bool);
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
				ctrl_bool = new ControleBool((CommonTree) node.getChild(0).getChild(0));
				fire(ctrl_bool);
				analyseChild(node);
				break;
			
			//L'une des quatre opï¿½rations binaires
			case "+":
			case "-":
			case "*":
			case "/":
			case "NEG":
				//on crï¿½e une expression correspondant au noeud en cours.
				Expression ea2 = new Expression(node);
				try {
					ea2.computeType(pile);
				} catch (ErreurSemantique e) {
					err_messages+=e.getMessage()+"\n";
					is_ok=false;
				}
				analyseChild(node);
				break;
				
			//Accï¿½s ï¿½ une case d'un tableau
			case "CELL":
				ctrl_acces = new ControleAccesTableau(node);
				fire(ctrl_acces);
				analyseChild(node);
				break;
			
			//Dï¿½finition dela taille d'un tableau
			case "SIZE":
				ctrl_taille_tableau = new ControleTableau(node);
				fire(ctrl_taille_tableau);
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
		
		//On ajoute la TDS ï¿½ la pile
		openTDS(newTDS);
		
		//Si on a le type et les paramï¿½tres qui sont prï¿½cisï¿½s
		if(node.getChildCount() == 4){
			
			//On ajoute les paramï¿½tres formels ï¿½ la TDS de la fonction
			FieldVariable fv;
			for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
				CommonTree p = (CommonTree) node.getChild(1).getChild(i);
				fv = new FieldVariable(p.getChild(0).getText(), top().getCurrentSize(), computeSizeType(p.getChild(1).getText()), p.getChild(1).getText());
				newTDS.add(fv);
			}
			
		//Si on a que les paramï¿½tres qui sont prï¿½cisï¿½s
		}else if(node.getChildCount() == 3 && node.getChild(1).getText().equals("PARAMSFORM")){

			//On ajoute les paramï¿½tres formels ï¿½ la TDS de la fonction
			FieldVariable fv;
			for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
				fv = new FieldVariable(node.getChild(1).getChild(i).getChild(0).getText(), top().getCurrentSize(), computeSizeType(node.getChild(1).getChild(i).getChild(1).getText()), node.getChild(1).getChild(i).getChild(1).getText());
				newTDS.add(fv);
			}
		}
	}
	
	public String getType(){
		return type_block;
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
				if(ftd == null) return 0;
				size = ftd.getTaille();
				break;
		}
				
		return size;
	}
	
	private int computeSizePrimitif(String primit){
		int size=0;
		try{
			//Si le cast marche, alors c'est un int et la taille est celle d'un ï¿½lï¿½ment primitif
			Integer.parseInt(primit);
			size = SIZE_PRIMITIF;
		}catch(Exception e){
			//On ne prend pas en compte les deux ""
			size = SIZE_PRIMITIF * (primit.length()-2);
		}
		
		return size;
	}
	
	public boolean isOK(){
		return is_ok;
	}
	
	public String getErrors(){
		return err_messages;
	}
	
	public ArrayList<TDS> getTDS(){
		return TDSs;
	}
}
