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
				//On récupère les infos dans les TDS.
				FieldVariable infos = (FieldVariable) TDS.findIn(pile, token, FieldType.FieldVariable); //Pour l'instant on ne gère que les identifiants de variables simples
				
				//On calcule l'adresse de la variable (dans R4).
				int base = ca.getBasePile();
				//On calcule le saut de la base de la pile jusqu'à la TDS contenant l'identifiant
				int sautTDS = Integer.parseInt(TDS.findSautToTDS(pile, token, FieldType.FieldVariable)+"", 16);
				int sautVar = Integer.parseInt(infos.getTailleDuSaut()+"", 16);
				
				//On y ajoute le saut de la base de l'environnement jusqu'à la variable
				
				//On range l'adresse dans R4
				String hex = Integer.toHexString(base - sautTDS - sautVar);
				while(hex.length() < 4) hex = "0" + hex;
				ca.append("LDW R4, #0x"+hex);
				
				//On fout le contenu de ce que pointe R4 dans R3
				ca.append("LDW R3, (R4)");
			}
		}
		
	}

}
