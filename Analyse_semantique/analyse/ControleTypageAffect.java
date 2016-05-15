package analyse;
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
		Expression ea_expr = new Expression(expr);
		String expr_type = ea_expr.computeType(TDSs);
		
		//On cherche le type de la variable
		CommonTree id = (CommonTree) node.getChild(0);
		Expression ea_id = new Expression(id);
		String id_type = ea_id.computeType(TDSs);

		if(!Expression.checkTypes(TDSs, expr_type, id_type))
			throw new ErreurSemantique(node.getLine(), "Erreur de typage dans l'affectation : '"+id_type+"' attendu mais '"+expr_type+"' trouvé");
		
	}

}
