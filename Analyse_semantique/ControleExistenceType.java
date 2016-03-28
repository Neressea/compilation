import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceType extends ControleSemantique{
	
	public ControleExistenceType(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		boolean found = false;
		
		CommonTree n = (CommonTree) node.getChild(0);
		
		if (TDS.findIn(TDSs, n.getChild(1).getText(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau) != null){
			found=true;
		}
		
		if (!found)throw new ErreurSemantique(node.getLine(), "Type :"+n.getChild(1).getText()+"non déclarée");
		
	}
}
