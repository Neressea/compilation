package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Let extends Instruction{

	public Let(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		// TODO Auto-generated method stub
	}

}
