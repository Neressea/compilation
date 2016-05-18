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
 * R13 = base de l'environnement courant
 * R14 = Registre de TRAP
 * R15 = SP
 *
 */
public abstract class Instruction {
	
	protected CommonTree node;

	public Instruction(CommonTree node) {
		this.node = node;
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
