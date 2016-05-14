package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

/**
 * 
 * Utilisation des registres :
 * R0 = base de l'environnement d'ex�cution courant
 * R1 = adresse des variables � charger
 * R2 = op�rande pour op�ration
 * R3 = op�rande pour op�ration & r�sultat
 * R4 = borne sup�rieur de boucle
 * R5 = retour de fonction
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
