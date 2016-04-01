package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

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

	public SupaHackaGenerator(CommonTree tree, ArrayList<TDS> TDSs) {
		this.tree = tree;
		this.TDSs = TDSs;
	}
	
	/**
	 * Génère le code correspondant à l'arbre passé au constructeur.
	 */
	public void genererCode() {
		// PLUS TARD
	}

}
