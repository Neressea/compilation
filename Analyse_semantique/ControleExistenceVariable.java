import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceVariable implements ControleSemantique{

	
	@Override
	public void check(CommonTree tree, ArrayList<TDS> TDSs)
			throws ErreurSemantique {
		
		boolean found = false;
		
		CommonTree n = (CommonTree) tree.getChild(0);
		
		for (TDS tds: TDSs){
			if (tds.existIn(n.getChild(0).getText(), Field.FieldTypeName.FieldVariable)){
				found=true;
				break;
			}
		}	
		
		if (!found)throw new ErreurSemantique(tree.getLine(), "Variable non déclarée");
		
	}

	
}
