import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTypeParamFonction extends ControleSemantique {

	public ControleTypeParamFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		FieldFonction f;
		int nbChildren = node.getChildCount();
		CommonTree n = (CommonTree) node.getChild(0);
		
		// On suppose que la fonction existe, on la recupere
		f = (FieldFonction) TDS.findIn(TDSs, n.getText(), FieldType.FieldFonction);
		
		// Si on a des parametres et que le nombre correspond
		if (nbChildren == 2 && node.getChild(1).getChildCount()==f.getParams().size()) {
			
			for (int i =0 ; i < node.getChild(1).getChildCount(); i++ ) {
				ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(i));
				// Si le type du parametre i est celui specifie dans la TDS
				if (!(f.getParams().get(i).getRight().equals(ea.computeType(TDSs)))) {
					throw new ErreurSemantique(node.getLine(), 
													"Erreur type, variable n° " + i + 
													" dans la fonction " + node.getChild(0).getText()
													+ " : " + f.getParams().get(i).getRight() +
													" attendu : " + ea.computeType(TDSs));
				}
			}
		}
	}

}
