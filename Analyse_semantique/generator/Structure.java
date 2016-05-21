package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Couple;
import analyse.FieldStructure;
import analyse.FieldType;
import analyse.TDS;

public class Structure extends Instruction{

	public Structure(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		//On récupère le vrai noeud
		String var_name = node.getParent().getText();
		String field = node.getChild(0).getText();
		FieldStructure fs = (FieldStructure) TDS.findIn(pile, var_name, FieldType.FieldStructure);
		int saut_to_champ=0;
		
		//On recherche le champ
		CommonTree val = null;
		for (Couple<String, CommonTree> couple : fs.getFieldsAndValues()) {
			if(couple.getLeft().equals(field)){
				val = couple.getRight();
				break;
			}
			saut_to_champ++;
		}
		
		if(val != null){
			ExpressionArithmetique ea = new ExpressionArithmetique(val, generator);
			ca.append("//Calcul de la valeur initiale du champ de structure --> dans R3");
			ea.genererCode(pile);
			ca.append("//Calcul de l'adresse de la variable structure");
			Identifiant id = new Identifiant((CommonTree) node.getParent(), generator);
			id.genererCode(pile);
			ca.append("//Calcul de l'adresse du champ");
			saut_to_champ*=2;
			ca.append("ADQ -"+saut_to_champ+", R1");
			ca.append("//On fout le tout dans R3");
			ca.append("LDW R3, (R1)");
		}
	}

}
