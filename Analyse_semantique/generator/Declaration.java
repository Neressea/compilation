package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Declaration extends Instruction{

	public Declaration(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		
		//On r�cup�re l'expression
		ExpressionArithmetique ea = null;
		if(node.getChildCount() == 2){
			ea = new ExpressionArithmetique((CommonTree) node.getChild(1));
		}else if (node.getChildCount() == 3){
			ea = new ExpressionArithmetique((CommonTree) node.getChild(2));
		}
		
		//On calcule la valeur de l'expression (r�sultat dans R3)
		ea.genererCode(pile);
		
		//On empile la valeur
		ca.append("STW R3, -(R15) //On empile la valeur d�clar�e");
	}
}
