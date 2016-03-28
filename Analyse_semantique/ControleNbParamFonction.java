import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleNbParamFonction extends ControleSemantique {

	public ControleNbParamFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		FieldFonction f;
		int nbChildren = node.getChildCount();

		CommonTree n = (CommonTree) node.getChild(0);
		f = (FieldFonction) TDS.findIn(TDSs, n.getText(), FieldType.FieldFonction);
		int nbParamsAttendu = f.getParams().size();

		if (nbChildren == 1) {			
			if (nbParamsAttendu != 0) {
				throw new ErreurSemantique(node.getLine(), "Nombre de parametres : 0 attendu(" + nbParamsAttendu + ")");
			} else {
				if (node.getChild(1).getChildCount() != nbParamsAttendu) {
					throw new ErreurSemantique(node.getLine(), "Nombre de parametre : " 
																+ node.getChild(1).getChildCount()
																+ " attendu(" + nbParamsAttendu + ")");
				}
			}
		}

	}

}
