import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleNbParamFonction extends ControleSemantique {

	public ControleNbParamFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		FieldFonction f;
		// On r�cup�re le nombre de fils du noeud courant (appel d'une fonction : FUNC_CALL)
		int nbChildren = node.getChildCount();
		// On r�cup�re le nom de la fonction appel�e
		CommonTree n = (CommonTree) node.getChild(0);
		// On r�cup�re la fonction dans la TDS ou elle a �t� cr��e
		f = (FieldFonction) TDS.findIn(TDSs, n.getText(), FieldType.FieldFonction);
		// On regarde le nombre de param�tres attendu par la fonction
		int nbParamsAttendu = f.getParams().size();
		
		if (nbChildren == 1) {	
			// Cas o� l'appel ne comporte qu'un seul fils (donc pas de param�tres)
			if (nbParamsAttendu != 0)
				throw new ErreurSemantique(node.getLine(), "Nombre de parametres : 0 attendu(" + nbParamsAttendu + ")");
		} else {
			// Cas o� l'appel comporte plusieurs fils
			// On regarde le nombre de fils du deuxi�me fils de l'appel = nb de param�tres
			System.out.println(node.getChild(1).getText());
			if (node.getChild(1).getChildCount() != nbParamsAttendu) {
				// S'il n'y a pas le bon nombre de param�tres
				throw new ErreurSemantique(node.getLine(), "Nombre de parametre : " 
															+ node.getChild(1).getChildCount()
															+ " attendu(" + nbParamsAttendu + ")");
			}
		}

	}

}
