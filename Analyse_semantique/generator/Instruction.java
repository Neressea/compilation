package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public abstract class Instruction {
	
	protected CommonTree node;

	public Instruction(CommonTree node) {
		this.node = node;
	}
	
	public abstract void genererCode(ArrayList<TDS> TDSs);
	
	public CommonTree getNode() {
		return this.node;
	}

}
