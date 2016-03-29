import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Vérifie que le retour d'une fonction typée soit de même type que la définition de la fonction
 * Le noeud envoyé au constructeur est le noeud de déclaration de la fonction (FUNC_DECL)
 *
 */
public class ControleRetourFonction extends ControleSemantique{

	public ControleRetourFonction(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		//On récupère le type du prototype de la fonction.
		//Le premier fils est l'ID de la fonction
		String id = node.getChild(0).getText();
		
		//On récupère la définition de la fonction
		FieldFonction ff = (FieldFonction) TDS.findIn(TDSs, id, FieldType.FieldFonction);
		
		//On récupère le type de retour de la fonction
		String type = ff.getType();
		
		//Si la fonction n'a pas de retour, c'est tout bon.
		if(type.equals("UNDEFINED"))
			return;
		
		//On récupère la dernière expression de la fonction
		//On récupère le block de la fonction
		CommonTree block = (CommonTree) node.getChild(node.getChildCount()-1);
		
		//On récupère la dernière expression du bloc
		CommonTree last = (CommonTree) block.getChild(block.getChildCount()-1);
		
		//Si c'est une affectation, on prend que la partie gauche.
		if(last.getText().equals(":=")){
			//on récupère la partie droite
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
		
		//On vérifie la compatibilité des types.
		if(!Expression.checkTypes(TDSs, type, type_ret))
			throw new ErreurSemantique(last.getLine(), "Erreur : le type du prototype ("+type+") ne concorde pas avec le type du retour ("+type_ret+")");
	}

}
