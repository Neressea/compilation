import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceVariable implements ControleSemantique{

	
	@Override
	public void check(CommonTree tree, ArrayList<TDS> TDSs)
			throws ErreurSemantique {
		
		boolean found = false;
		
		CommonTree n = (CommonTree) tree.getChild(0);
		
		for (TDS tds: TDSs){
			if (tds.getImbrication() == TDS.NB_IMBR){
				if (tds.getBloc() == TDS.NB_TDS){
					if (tds.existIn(n.getText(), "Variable")){
						found = true;
						break;
					}
				}
			}else if(tds.getImbrication() < TDS.NB_IMBR){
				if (tds.existIn(n.getText(), "Variable")){
					found = true;
					break;
				}
			}
		}	
		
		if (!found)throw new ErreurSemantique(tree.getLine(), "Variable non déclarée");
		
	}

	
}
