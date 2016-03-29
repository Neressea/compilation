import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * V�rifie que le retour d'une fonction typ�e soit de m�me type que la d�finition de la fonction
 * Le noeud envoy� au constructeur est le noeud de d�claration de la fonction (FUNC_DECL)
 *
 */
public class ControleRetourFonction extends ControleSemantique{

	public ControleRetourFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		//On r�cup�re le type du prototype de la fonction.
		//Le premier fils est l'ID de la fonction
		String id = node.getChild(0).getText();
		
		//On r�cup�re la d�finition de la fonction
		FieldFonction ff = (FieldFonction) TDS.findIn(TDSs, id, FieldType.FieldFonction);
		
		//On r�cup�re le type de retour de la fonction
		String type = ff.getType();
		
		//Si la fonction n'a pas de retour, c'est tout bon.
		if(type.equals("UNDEFINED"))
			return;
		
		//On r�cup�re la derni�re expression de la fonction
		//On r�cup�re le block de la fonction
		CommonTree block = (CommonTree) node.getChild(node.getChildCount()-1);
		
		//On r�cup�re la derni�re expression du bloc
		CommonTree last = (CommonTree) block.getChild(block.getChildCount()-1);
		
		//Si c'est une affectation, on prend que la partie gauche.
		if(last.getText().equals(":=")){
			//on r�cup�re la partie droite
			last = (CommonTree) last.getChild(1);
		}
		
		//On calcule la valeur de l'expression.
		Expression ea = new Expression(last);
		String type_ret;
		if (last.getText().equals("for") || last.getText().equals("while")) {
			type_ret = "UNDEFINED";
		} else {
			type_ret = ea.computeType(TDSs);
		}
		
		//On v�rifie la compatibilit� des types.
		if(!Expression.checkTypes(TDSs, type, type_ret))
			throw new ErreurSemantique(last.getLine(), "Erreur : le type du prototype ("+type+") ne concorde pas avec le type du retour ("+type_ret+")");
	}

}
