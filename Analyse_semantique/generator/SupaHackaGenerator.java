package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

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

	public SupaHackaGenerator(CommonTree tree, ArrayList<TDS> TDSs) {
		this.tree = tree;
		this.TDSs = TDSs;
	}
	
	/**
	 * G�n�re le code correspondant � l'arbre pass� au constructeur.
	 */
	public void genererCode() {
		// PLUS TARD
	}

}
