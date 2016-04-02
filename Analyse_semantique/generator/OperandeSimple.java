package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class OperandeSimple extends Instruction {

	public OperandeSimple(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		if (token.matches("\".*\"")) { // Chaine de caracteres constante
			
		} else {
			boolean is_digit = true;
			int value = 0;
			try {
				value = Integer.parseInt(token);
			} catch (Exception e) {
				is_digit=false;
			}
			if (is_digit) { // C'est une constante entiere
				CodeAss.getCodeSingleton().append("LDW R3, #" + value);
			} else { // Il s'agit d'un identifiant
				// On verra ca apres
			}
		}
		
	}

}
