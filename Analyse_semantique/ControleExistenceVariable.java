import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceVariable implements ControleSemantique{

	public static int current_nb_implication;
	public static int current_nb_bloc;
	
	@Override
	public void check(CommonTree tree, ArrayList<TDS> TDSs)
			throws ErreurSemantique {
		
		TDS currentTDS = null;
		
		for (TDS tds: TDSs){
			if (tds.getImbrication() == current_nb_implication){
				if (tds.getBloc() == current_nb_bloc) currentTDS = tds; 
			}
		}
		
		if (currentTDS.equals(null))throw new ErreurSemantique(tree.getLine(), "TDS du bloc actuelle introuvable");
		
		CommonTree n = (CommonTree) tree.getChild(0);
		
		if (!currentTDS.existIn(n.getText(), "Variable"))throw new ErreurSemantique(tree.getLine(), "Variable non déclarée");
		
	}

	
}
