package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.FieldType;
import analyse.FieldVariable;
import analyse.TDS;

public class OperandeSimple extends Instruction {

	public OperandeSimple(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss ca = CodeAss.getCodeSingleton();
		
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
				ca.append("LDW R3, #" + value);
			} else { // Il s'agit d'un identifiant
				Identifiant idf = new Identifiant(node);
				
				//L'adresse de la variable est stockée dans R4
				idf.genererCode(pile);
				
				//On fout le contenu de ce que pointe R4 dans R3
				ca.append("LDW R3, (R4)");
			}
		}
		
	}

}
