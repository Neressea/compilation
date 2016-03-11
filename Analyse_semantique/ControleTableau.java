import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTableau implements ControleSemantique{

	@Override
	public void check(CommonTree node, ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		/*------------------- On vérifie que la taille du tableau n'est pas négative -------------------*/
		
		//On récupère la taille du tableau
		CommonTree n = (CommonTree) node.getChild(0); 
		
		/*On essaie de caster en entier. Sinon ce n'est pas une constante entière et on ne peut
		  donc vérifier si la valeur est négative */

		if(n.getText().matches("NEG")) throw new ErreurSemantique(node.getLine(), "Taille de tableau < 0");
			
	}

}
