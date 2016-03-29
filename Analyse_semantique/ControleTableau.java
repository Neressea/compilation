import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTableau extends ControleSemantique{
	
	public ControleTableau(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		/*------------------- On v�rifie que la taille du tableau n'est pas n�gative -------------------*/
		
		//On r�cup�re la taille du tableau
		CommonTree n = (CommonTree) node.getChild(0); 
		
		/*On essaie de caster en entier. Sinon ce n'est pas une constante enti�re et on ne peut
		  donc v�rifier si la valeur est n�gative */

		Expression ea = new Expression(n);
		ea.computeType(TDSs);
			
		if(n.getText().matches("NEG")) throw new ErreurSemantique(node.getLine(), "Taille de tableau < 0");
			
	}

}
