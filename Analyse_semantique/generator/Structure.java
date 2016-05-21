package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Structure extends Instruction{

	public Structure(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		//On récupère le vrai noeud
		node = (CommonTree) node.getParent();
	}

}
