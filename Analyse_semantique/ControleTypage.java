import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTypage extends ControleSemantique {
	
	private CommonTree ID;
	public ControleTypage(CommonTree node, CommonTree id) {
		super(node);
		this.ID=id;
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		ExpressionArithmetique ea = new ExpressionArithmetique(node);
		String type = ea.computeType(TDSs);
		ExpressionArithmetique eaID = new ExpressionArithmetique(ID);
		String expectedType = eaID.computeType(TDSs);
		if (expectedType.equals(type)) throw new ErreurSemantique(node.getLine(), 
														"Erreur de typage : " + expectedType + " attendu mais"
														+ type + "trouvé");
	}

}
