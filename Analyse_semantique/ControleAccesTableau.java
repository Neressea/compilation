import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleAccesTableau extends ControleSemantique{

	/**
	 * Pn reçoit le noeud de l'id du tableau
	 * @param node
	 */
	public ControleAccesTableau(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		ExpressionArithmetique exp = new ExpressionArithmetique((CommonTree) node.getChild(0).getChild(0));
		String type = exp.computeType(TDSs);
		
		if(!type.equals("int"))
			throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-entière : "+type);
	}
}
