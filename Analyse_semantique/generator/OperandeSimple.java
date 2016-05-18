package generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

import org.antlr.runtime.tree.CommonTree;

import analyse.FieldType;
import analyse.FieldVariable;
import analyse.TDS;

public class OperandeSimple extends Instruction {
	
	public static int counter = 0;


	public OperandeSimple(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss ca = CodeAss.getCodeSingleton();
		String et;
		
		ArrayList<String> comparateurs_associateurs = new ArrayList<>(Arrays.asList(new String[]{"<",">","=",">=", "<=", "<>", "&", "|"}));
		
		if (token.matches("\".*\"")) { // Chaine de caracteres constante
			
			et="STRING".concat(Integer.toString(counter));
			ca.append(et+" string "+token);
			counter++;
			ca.append("LDW R3, #"+et);
			
		}else if(comparateurs_associateurs.contains(token)){
			
			Condition cond = new Condition(node);
			cond.genererCode(pile);
			
		}else if (token.equals("FUNC_CALL")){
			
			Fonction func = new Fonction(node);
			func.genererCode(pile);
			
		} else {
			boolean is_digit = true;
			int value = 0;
			
			try {
				value = Integer.parseInt(token);
			} catch (Exception e) {
				is_digit=false;
			}
			
			if(token.equals("NEG")){
				is_digit = true;
				value = Integer.parseInt(node.getChild(0).getText());
				value = -value;
			}
			
			if (is_digit) { // C'est une constante entiere
				ca.append("LDW R3, #" + value);
			} else { // Il s'agit d'un identifiant
				Identifiant idf = new Identifiant(node);
				
				//L'adresse de la variable est stock�e dans R4
				idf.genererCode(pile);
				
				//On fout le contenu de ce que pointe R1 dans R3
				ca.append("LDW R3, (R1)");
			}
		}		
		
	}

}
