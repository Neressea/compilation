package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

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

}
