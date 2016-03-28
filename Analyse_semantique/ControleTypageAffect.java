import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTypageAffect extends ControleSemantique{

	public ControleTypageAffect(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		//On calcule le type de l'expression droite
		CommonTree expr = (CommonTree) node.getChild(1);
		ExpressionArithmetique ea_expr = new ExpressionArithmetique(expr);
		String expr_type = ea_expr.computeType(TDSs);
		
		//On cheerche le type de la variable
		CommonTree id = (CommonTree) node.getChild(0);
		ExpressionArithmetique ea_id = new ExpressionArithmetique(id);
		String id_type = ea_id.computeType(TDSs);
		
		if(!ExpressionArithmetique.checkTypes(TDSs, expr_type, id_type))
			throw new ErreurSemantique(node.getLine(), "Erreur de typage dans l'affectation : '"+id_type+"' attendu mais '"+expr_type+"' trouvé");
		
	}

}
