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
		String err = "";
		
		// On suppose que la fonction existe, on la recupere
		f = (FieldFonction) TDS.findIn(TDSs, n.getText(), FieldType.FieldFonction);
		
		// Si on a des parametres et que le nombre correspond
		if (nbChildren == 2 && node.getChild(1).getChildCount()==f.getParams().size()) {
			
			for (int i =0 ; i < node.getChild(1).getChildCount(); i++ ) {
				Expression ea = new Expression((CommonTree) node.getChild(1).getChild(i));
				// Si le type du parametre i est celui specifie dans la TDS
				boolean concordance = Expression.checkTypes(TDSs, f.getParams().get(i).getRight(), ea.computeType(TDSs));
				if (!concordance) {
					err+="Erreur à la ligne "+node.getLine()+" : Erreur dans le typage du parametre " + i + 
													" de la fonction " + node.getChild(0).getText()
													+ " : '" + f.getParams().get(i).getRight() +
													"' attendu, '" + ea.computeType(TDSs)+"' trouve\n";
				}
			}
		}
		
		if(!err.equals(""))
			throw new ErreurSemantique(err);
	}

}
