package generator;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import com.sun.org.apache.xpath.internal.functions.Function;

import analyse.FieldType;
import analyse.TDS;

/**
 * 
 * Classe qui va reparcourir l'AST et recr�er virtuellement la pile des TDS � partir de la liste compl�te des TDS.
 * Elle va cr�er une pile virtuelle des environnements ouverts � partir de la liste compl�te.
 * Et elle va cr�er une pile d'instructions et g�n�rer leur code.
 *
 */
public class SupaHackaGenerator {
	/**
	 * Arbre du programme
	 */
	private CommonTree tree;
	
	/**
	 * Liste de toutes les TDS
	 */
	private ArrayList<TDS> TDSs;
	
	/**
	 * Pile des environnements ouverts
	 */
	private ArrayList<TDS> pile;
	
	/**
	 * Curseur sur la derniere TDS ajoutee a la pile
	 */
	private int liste_cursor;

	public SupaHackaGenerator(CommonTree tree, ArrayList<TDS> TDSs) {
		this.tree = tree;
		this.TDSs = TDSs;
		this.pile = new ArrayList<TDS>();
		this.liste_cursor = 0;
		// On ajoute print et read des fonctions de qualite
		pile.add(TDSs.get(0));
	}
	
	
	
	/**
	 * G�n�re le code correspondant � l'arbre pass� au constructeur.
	 * @param path chemin d acces au fichier dest
	 * @throws IOException 
	 */
	public void genererCode(String path) throws IOException {
		genererNode(tree);
		CodeAss.getCodeSingleton().write(path);
	}



	public void genererNode(CommonTree node) {
		
		//En fonction du type du noeud, on appelle diff�rents contr�les s�mantiques
				TDS current = null;
				
				if(pile.size()>0) current = top();
				
				switch(node.getToken().getText()){
					//D�claration d'une variable
					case "var":
						
						//On a un tableau
						if(node.getChild(1).getChildCount() == 2 && node.getChild(1).getChild(0).getText().equals("SIZE")){
							
							//On a une variable
						}else if((node.getChildCount() == 2 && TDS.findIn(pile, node.getChild(1).getText(), FieldType.FieldTypeDefStructure)==null) || (node.getChildCount() == 3)){	
							Declaration decl = new Declaration(node);
							decl.genererCode(pile);
						//On a une structure
						}else {
							
						}
						
						break;
						
					//Declaration d'un type
					case "type":
						
						genererChild(node);
						break;
						
					//D�claration d'une fonction
					case "FUNC_DECL":
						openTDS();
						FonctionDeclaration fd = new FonctionDeclaration(node, this);
						fd.genererCode(pile);
						closeTDS();
						break;
					
					case "BLOCK":
						//Quand on entre dans un bloc on augmente l'imbrication
						genererChild(node);
						break;
					
					//Appel d'une fonction
					case "FUNC_CALL":
						Fonction func = new Fonction(node);
						func.genererCode(pile);
						break;
						
					//Affectation
					case ":=":
						Affectation aff = new Affectation(node, this);
						aff.genererCode(pile);
						break;
						
					//Condition
					case "COND":
						Condition cond = new Condition(node);
						cond.genererCode(pile);
						break;
						
					case "let":
						openTDS();
						genererChild(node);	
						closeTDS();
						break;
						
					// Boucle for
					case "for":			
						openTDS();
						For f = new For(node, this);
						f.genererCode(pile);
						closeTDS();
						break;
						
					case "if":
						If if_gen = new If(node, this); 
						if_gen.genererCode(pile);
						break;
					
					case "then":
						genererChild(node);
						break;
						
					case "else":
						genererChild(node);
						break;
						
					case "while":
						While while_gen = new While(node, this);
						while_gen.genererCode(pile);
						break;
					
					//L'une des quatre op�rations binaires
					case "+":
					case "-":
					case "*":
					case "/":
					case "NEG":
						ExpressionArithmetique ea = new ExpressionArithmetique(node);
						ea.genererCode(pile);
						break;
						
					//Acc�s � une case d'un tableau
					case "CELL":
						genererChild(node);
						break;
					
					//D�finition dela taille d'un tableau
					case "SIZE":
						genererChild(node);
						break;
						
					case "PARAMSFORM":
						System.out.println("COUCOU");
						genererChild(node);
						break;
						
					default:
						
						boolean is_numb = node.getText().equals("NEG"), is_string = node.getText().matches("\".*\"");
						
						if(!is_string && !is_numb){
							try{
								Integer.parseInt(node.getText());
								is_numb = true;
							}catch(Exception e){
								is_numb = false;
							}
						}
						
						if(is_string || is_numb){
							OperandeSimple os = new OperandeSimple(node);
							os.genererCode(pile);
						}else{
							genererChild(node);
						}
				}
		
	}
	
	private void closeTDS() {
		this.pile.remove(this.pile.size()-1);
	}



	private void openTDS() {
		liste_cursor++;
		TDS tmp = TDSs.get(liste_cursor);
		pile.add(tmp);
	}



	private TDS top() {
		return pile.get(pile.size()-1);
	}



	public void genererChild(CommonTree node) {
		for(int i = 0; i<node.getChildCount(); i++){
			genererNode((CommonTree) node.getChild(i));
		}
	}
	

}
