package analyse;
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
		
		if (TDS.findIn(TDSs, n.getChild(0).getText(), FieldType.FieldVariable) != null){
			found=true;
		}
		
		if (!found)throw new ErreurSemantique(node.getLine(), "Variable :"+n.getChild(0).getText()+" non declaree");
		
	}

	
}
