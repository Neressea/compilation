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


	public OperandeSimple(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss ca = CodeAss.getCodeSingleton();
		String et;
		
		ArrayList<String> comparateurs_associateurs = new ArrayList<>(Arrays.asList(new String[]{"<",">","=",">=", "<=", "<>", "&", "|"}));
		if (token.matches("\".*\"")) { // Chaine de caracteres constante
			
			//Si le nombre de caractères ets impair, on ajoute un blanc arbitraire en fin de chaine pour le rendre pair.
			if(token.length() % 2 != 0)
				token = token.substring(0, token.length() - 1) + " " +token.substring(token.length() - 1, token.length());
			
			et="STRING".concat(Integer.toString(counter));
			ca.append(et+" string "+token);
			counter++;
			ca.append("LDQ 0, R3");
			ca.append("LDW R3, #"+et);
			
		}else if(comparateurs_associateurs.contains(token)){
			
			Condition cond = new Condition(node, this.generator);
			cond.genererCode(pile);
			
		}else if (token.equals("FUNC_CALL")){
			
			Fonction func = new Fonction(node, this.generator);
			func.genererCode(pile);
			
		}else if(token.equals("if")){
			If iffunc = new If(node, this.generator);
			iffunc.genererCode(pile);
		}else if(token.equals("let")){
			
			Let let = new Let(node, this.generator);
			let.genererCode(pile);
			
		}else{
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
				Identifiant idf = new Identifiant(node, this.generator);
				
				//L'adresse de la variable est stockï¿½e dans R4
				idf.genererCode(pile);
				
				//On fout le contenu de ce que pointe R1 dans R3
				ca.append("LDW R3, (R1)");
			}
		}		
		
	}

}
