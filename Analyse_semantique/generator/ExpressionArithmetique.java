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
		ArrayList<String> ope = new ArrayList<>(Arrays.asList(new String[]{"+","-","*","/", "NEG"}));
		CodeAss ca = CodeAss.getCodeSingleton();
		if (!ope.contains(node.getText())) {
			OperandeSimple os = new OperandeSimple(node);
			os.genererCode(pile);
		} else {
			
			ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) node.getChild(0));
			ea.genererCode(pile);
			
			//Si jamais on a NEG, on négationne R3 et on s'arrête là
			if(node.getText().equals("NEG")){
				ca.append("NEG R3, R3");
				return;
			}
			
			ca.append("STW R3, -(R15)"); // REMPLIR
			ea = new ExpressionArithmetique((CommonTree) node.getChild(1));
			ea.genererCode(pile);
			ca.append("LDW R4, (R15)+");
			
			switch (node.getText()) {
				case "+":
					// R4 (partie gauche) + R3 (partie droite) dans R3
					ca.append("ADD R4, R3, R3");
					break;
				case "-":
					ca.append("SUB R4, R3, R3");
					break;
				case "*":
					ca.append("MUL R4, R3, R3");
					break;
				case "/":
					ca.append("DIV R4, R3, R3");
					break;
			}
		}
			
	}

}
