package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

/**
 * 
 * Utilisation des registres :
 * R0 = registre pour les param�tres des fonctions de l'assembleur
 * R1 = adresse des variables � charger
 * R2 = op�rande pour op�ration
 * R3 = op�rande pour op�ration & r�sultat & retour de fonction
 * R4 = borne sup�rieur de boucle
 * 
 * R12 = passage du chainage statique
 * R13 = base de l'environnement courant
 * R14 = Registre de TRAP
 * R15 = SP
 *
 */
public abstract class Instruction {
	
	protected CommonTree node;
	protected SupaHackaGenerator generator;

	public Instruction(CommonTree node, SupaHackaGenerator generator) {
		this.node = node;
		this.generator = generator;
	}
	
	/**
	 * G�n�re le code correspondant � l'instruction et le stocke dans CodeAss
	 * @param pile Pile des TDSs ouvertes
	 */
	public abstract void genererCode(ArrayList<TDS> pile);
	
	public CommonTree getNode() {
		return this.node;
	}

}
