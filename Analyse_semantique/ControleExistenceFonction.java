import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceFonction implements ControleSemantique{

	@Override
	public void check(CommonTree tree, ArrayList<TDS> TDSs)
			throws ErreurSemantique {
		//Lors d'une affectation, on s'assure que la variable existe deja dans la TDS
		CommonTree n = (CommonTree) tree.getChild(0);
		
		// En attente de modification de la classe TDS
		
		
		//if (!n.exits(TDSs))throw new ErreurSemantique(node.getLine(), "Fonction non déclarée");
		
	}

}
