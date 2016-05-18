package generator;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;
import analyse.TDS;

public class Affectation extends Instruction{
	
	private SupaHackaGenerator generator;
	
	public Affectation(CommonTree node, SupaHackaGenerator generator) {
		super(node);
		this.generator = generator;
	}
	
	@Override
	public void genererCode(ArrayList<TDS> pile) {
		//On effectue les calculs de la partie droite
		ExpressionArithmetique expr = new ExpressionArithmetique((CommonTree) node.getChild(1));
		expr.genererCode(pile);
				
		//On calcule l'adresse de la variable dans la pile : adresse chargée dans R1
		Identifiant idf = new Identifiant((CommonTree) node.getChild(0));
		idf.genererCode(pile);
		
		//On affecte la valeur de retour (R3) dans la mémoire
		CodeAss ca = CodeAss.getCodeSingleton();
		ca.append("STW R3, (R1) //On stocke le resultat dans la mémoire");
	}
}
