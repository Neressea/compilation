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
		Expression exp=null;
		
		//On vérifie le type de tous les fils
		for (int i = 0; i < node.getChildCount(); i++) {
			if(node.getChild(i).getChildCount() == 1){
				exp = new Expression((CommonTree) node.getChild(i).getChild(0));
				String type = exp.computeType(TDSs);
								
				if(!type.equals("int"))
					throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-entière : "+type);
			
			}
		}
		
	}
}
