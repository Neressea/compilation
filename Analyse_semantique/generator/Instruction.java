package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

/**
 * 
 * Utilisation des registres :
 * R0 = registre pour les paramètres des fonctions de l'assembleur
 * R1 = adresse des variables à charger
 * R2 = opérande pour opération
 * R3 = opérande pour opération & résultat & retour de fonction
 * R4 = borne supérieur de boucle
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
	 * Génère le code correspondant à l'instruction et le stocke dans CodeAss
	 * @param pile Pile des TDSs ouvertes
	 */
	public abstract void genererCode(ArrayList<TDS> pile);
	
	public CommonTree getNode() {
		return this.node;
	}
	
	public void saveRegister(String... reg){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		for (int i = 0; i < reg.length; i++) {
			ca.append("STW "+reg[i]+", -(R15)");
		}
	}
	
	public void loadRegister(String... reg){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		for (int i = 0; i < reg.length; i++) {
			ca.append("LDW "+reg[i]+", (R15)+");
		}
	}

}
