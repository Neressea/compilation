import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceVariable implements ControleSemantique{

	@Override
	public void check(CommonTree tree, ArrayList<TDS> TDSs)
			throws ErreurSemantique {
		
		CommonTree n = (CommonTree) tree.getChild(0);
		
		// En attente de modification de la classe TDS
		
		
		//if (!n.exits(TDSs))throw new ErreurSemantique(node.getLine(), "Variable non déclarée");
		
	}

	
}
