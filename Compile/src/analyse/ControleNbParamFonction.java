package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleNbParamFonction extends ControleSemantique {

	public ControleNbParamFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		FieldFonction f;
		// On récupère le nombre de fils du noeud courant (appel d'une fonction : FUNC_CALL)
		int nbChildren = node.getChildCount();
		// On récupère le nom de la fonction appelée
		CommonTree n = (CommonTree) node.getChild(0);
		// On récupère la fonction dans la TDS ou elle a été créée
		f = (FieldFonction) TDS.findIn(TDSs, n.getText(), FieldType.FieldFonction);
		
		if(f==null) return;
		
		// On regarde le nombre de paramètres attendu par la fonction
		int nbParamsAttendu = f.getParams().size();
		
		if (nbChildren == 1) {	
			// Cas où l'appel ne comporte qu'un seul fils (donc pas de paramètres)
			if (nbParamsAttendu != 0)
				throw new ErreurSemantique(node.getLine(), "Nombre de parametres : 0 attendu(" + nbParamsAttendu + ")");
		} else {
			// Cas où l'appel comporte plusieurs fils
			// On regarde le nombre de fils du deuxième fils de l'appel = nb de paramètres
			if (node.getChild(1).getChildCount() != nbParamsAttendu) {
				// S'il n'y a pas le bon nombre de paramètres
				throw new ErreurSemantique(node.getLine(), "Mauvais nombre de parametre pour la fonction '" +
															node.getChild(0) + "' : "
															+ nbParamsAttendu
															+ " attendu, " + node.getChild(1).getChildCount() + " trouves");
			}
		}

	}

}
