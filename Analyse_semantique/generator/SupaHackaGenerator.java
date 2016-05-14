package generator;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import com.sun.org.apache.xpath.internal.functions.Function;

import analyse.FieldType;
import analyse.TDS;

/**
 * 
 * Classe qui va reparcourir l'AST et recréer virtuellement la pile des TDS à partir de la liste complète des TDS.
 * Elle va créer une pile virtuelle des environnements ouverts à partir de la liste complète.
 * Et elle va créer une pile d'instructions et générer leur code.
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
	 * Génère le code correspondant à l'arbre passé au constructeur.
	 * @param path chemin d acces au fichier dest
	 * @throws IOException 
	 */
	public void genererCode(String path) throws IOException {
		genererNode(tree);
		CodeAss.getCodeSingleton().write(path);
	}



	public void genererNode(CommonTree node) {
		
		//En fonction du type du noeud, on appelle diffï¿½rents contrï¿½les sï¿½mantiques
				TDS current = null;
				
				if(pile.size()>0) current = top();
				
				switch(node.getToken().getText()){
					//Dï¿½claration d'une variable
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
						
					//Dï¿½claration d'une fonction
					case "FUNC_DECL":
						
						openTDS();
						genererChild(node);
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
						genererChild(node);
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
						genererChild(node);
						break;
					
					case "then":
						genererChild(node);
						break;
						
					case "else":
						genererChild(node);
						break;
						
					case "while":
						genererChild(node);
						break;
					
					//L'une des quatre opï¿½rations binaires
					case "+":
					case "-":
					case "*":
					case "/":
					case "NEG":
						ExpressionArithmetique ea = new ExpressionArithmetique(node);
						ea.genererCode(pile);
						break;
						
					//Accï¿½s ï¿½ une case d'un tableau
					case "CELL":
						genererChild(node);
						break;
					
					//Dï¿½finition dela taille d'un tableau
					case "SIZE":
						genererChild(node);
						break;
						
					case "PARAMSFORM":
						genererChild(node);
						break;
						
					default:
						genererChild(node);
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
