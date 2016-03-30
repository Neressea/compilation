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
		String err = "";
		//On r�cup�re l'arbre de la borne inf�rieure
		CommonTree binf = (CommonTree) node.getChild(0).getChild(0).getChild(0);
		CommonTree bsup = (CommonTree) node.getChild(0).getChild(1).getChild(0);
		
		//On les traduit en expressions arithm�tiques
		Expression ea_inf = new Expression(binf);
		Expression ea_sup = new Expression(bsup);
		
		//On calcule le type des bornes
		String type_inf = ea_inf.computeType(TDSs);
		String type_sup = ea_sup.computeType(TDSs);
		
		if(!type_inf.equals("int")){
			err+="Erreur � la ligne "+node.getLine()+" : Erreur de typage dans la borne inferieure du for. Attendu : int. Trouv� = "+type_inf+"\n";
		}
		
		if(!type_sup.equals("int")){
			err+="Erreur � la ligne "+node.getLine()+" : Erreur de typage dans la borne superieure du for. Attendu : int. Trouv� = "+type_sup+"\n";
		}
		
		if(!err.equals(""))
			throw new ErreurSemantique(err);
	}
	
}
