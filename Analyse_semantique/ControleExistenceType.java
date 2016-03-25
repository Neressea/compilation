import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceType extends ControleSemantique{
	
	public ControleExistenceType(CommonTree tree) {
		super.node=tree;
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
	}
	
	public int computeSize(){
		return taille;
	}

}
