import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceVariable extends ControleSemantique{

	
	public ControleExistenceVariable(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		boolean found = false;
		
		CommonTree n = (CommonTree) node.getChild(0);
		
		for (TDS tds: TDSs){
			if (tds.existIn(n.getChild(0).getText(), FieldType.FieldVariable) != null){
				found=true;
				break;
			}
		}	
		
		if (!found)throw new ErreurSemantique(node.getLine(), "Variable non déclarée");
		
	}

	
}
