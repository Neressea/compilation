package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Field;
import analyse.FieldTableau;
import analyse.FieldType;
import analyse.FieldTypeDefTableau;
import analyse.TDS;

public class TableauAcces extends Instruction{
	
	public TableauAcces(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss codeass = CodeAss.getCodeSingleton();
		
		codeass.append("//Début de l'accès au tableau");
		
		String tab_name = node.getText(); //On récupère le nom du tableau
		FieldTableau f = (FieldTableau) TDS.findIn(pile, tab_name, FieldType.FieldTableau);
		FieldTypeDefTableau f_type = (FieldTypeDefTableau) TDS.findIn(pile, f.getType(), FieldType.FieldTypeDefTableau);
		CommonTree num_case = (CommonTree) node.getChild(0).getChild(0);
		
		//On calcule la case accédée : résultat dans R3
		ExpressionArithmetique ea = new ExpressionArithmetique(num_case, generator);
		ea.genererCode(pile);
		
		//on multiplie le saut par 2 pour retomber sur des mots
		codeass.append("ADD R3, R3, R3");
		
		//On calcule l'adresse de la base du tableau (identifiant)
		Identifiant idf = new Identifiant(node, generator);
		idf.genererCode(pile);
		
		//On récupère l'adresse du tableau, qui est stockée dans la case pointée par R1
		codeass.append("LDW R1, (R1)");
		
		//On modifie l'adresse de R1 par le saut
		codeass.append("ADD R1, R3, R1");
		
		//Enfin on charge le contenu du tableau
		if(f_type.getTypeElements().equals("string"))
			codeass.append("LDW R3, (R1)");
		else
			codeass.append("LDW R3, (R1)");
		
		codeass.append("//Fin de l'accès au tableau");
	}

}
