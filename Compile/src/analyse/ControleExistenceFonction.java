package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;


public class ControleExistenceFonction extends ControleSemantique{

	public ControleExistenceFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		boolean found = false;
				
		if (TDS.findIn(TDSs, node.getChild(0).getText(), FieldType.FieldFonction) != null){
			found=true;
		}
		
		if (!found)throw new ErreurSemantique(node.getLine(), "Fonction "+node.getChild(0).getText()+" non déclarée");
		
	}
}
