import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTypageFor extends ControleSemantique{

	/**
	 * Noeud "for"
	 * @param node
	 */
	public ControleTypageFor(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		//On r�cup�re l'arbre de la borne inf�rieure
		CommonTree binf = (CommonTree) node.getChild(0).getChild(0).getChild(0);
		CommonTree bsup = (CommonTree) node.getChild(0).getChild(1).getChild(0);
		
		//On les traduit en expressions arithm�tiques
		ExpressionArithmetique ea_inf = new ExpressionArithmetique(binf);
		ExpressionArithmetique ea_sup = new ExpressionArithmetique(bsup);
		
		//On calcule le type des bornes
		String type_inf = ea_inf.computeType(TDSs);
		String type_sup = ea_sup.computeType(TDSs);
		
		if(!type_inf.equals("int") && !type_sup.equals("int")){
			throw new ErreurSemantique(node.getLine(), "Erreur de typage dans for. Attendu : int. Trouv� : inf = "+type_inf+", sup = "+type_sup);
		}else if(!type_inf.equals("int")){
			throw new ErreurSemantique(node.getLine(), "Erreur de typage dans for. Attendu : int. Trouv� : inf = "+type_inf);
		}else if(!type_sup.equals("int")){
			throw new ErreurSemantique(node.getLine(), "Erreur de typage dans for. Attendu : int. Trouv� : sup = "+type_sup);
		}
	}
	
}
