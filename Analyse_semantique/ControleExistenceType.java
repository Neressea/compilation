import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceType extends ControleSemantique{
	
	public ControleExistenceType(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		boolean found = false;
		
		if(node.getText().equals("string") || node.getText().equals("int"))
			found=true;
				
		if (TDS.findIn(TDSs, node.getText(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau) != null){
			found=true;
		}
		
		if (!found)throw new ErreurSemantique(node.getLine(), "Type :"+node.getText()+" non déclarée");
		
	}
}
