package generator;

import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class ExpressionArithmetique extends Instruction{

	public ExpressionArithmetique(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		ArrayList<String> ope = new ArrayList<>(Arrays.asList(new String[]{"+","-","*","/"}));
		CodeAss ca = CodeAss.getCodeSingleton();
		if (!ope.contains(node.getText())) {
			OperandeSimple os = new OperandeSimple(node);
			os.genererCode(pile);
		} else {
			
			ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) node.getChild(0));
			ea.genererCode(pile);
			ca.append("STW R3, -(R15)"); // REMPLIR
			ea = new ExpressionArithmetique((CommonTree) node.getChild(1));
			ea.genererCode(pile);
			ca.append("LDW R4, (R15)+");
			
			switch (node.getText()) {
				case "+":
					// R3 (partie droite) + R15 (partie gauche dans la pile) dans R3
					// Ca depile R15 voila
					ca.append("ADD R3, R4, R3");
					break;
				case "-":
					ca.append("SUB R3, R4, R3");
					break;
				case "*":
					ca.append("MUL R3, R4, R3");
					break;
				case "/":
					ca.append("DIV R3, R4, R3");
					break;
			}
		}
			
	}

}
