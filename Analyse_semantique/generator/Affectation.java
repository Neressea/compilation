package generator;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;
import analyse.TDS;

public class Affectation extends Instruction{
	
	public Affectation(CommonTree node) {
		super(node);
	}
	
	@Override
	public void genererCode(ArrayList<TDS> pile) {
		// TODO Auto-generated method stub
	}
}
