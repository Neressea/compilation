package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class SupaHackaGenerator {
	private CommonTree node;
	private ArrayList<TDS> TDSs;

	public SupaHackaGenerator(CommonTree tree, ArrayList<TDS> TDSs) {
		this.node = tree;
		this.TDSs = TDSs;
	}
	
	public void genererCode() {
		// PLUS TARD
	}

}
