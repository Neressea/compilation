package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Couple;
import analyse.Field;
import analyse.FieldTableau;
import analyse.FieldType;
import analyse.FieldTypeDefStructure;
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
		CommonTree num_codeassse = (CommonTree) node.getChild(0).getChild(0);
		
		//On codeasslcule la codeassse accédée : résultat dans R3
		ExpressionArithmetique ea = new ExpressionArithmetique(num_codeassse, generator);
		ea.genererCode(pile);
		
		int taille = f_type.getTailleDesElems();
		codeass.append("LDQ " + taille + ", R9");
		//on multiplie le saut par 2 pour retomber sur des mots
		codeass.append("MUL R3, R9, R3");
		
		//On codeasslcule l'adresse de la base du tableau (identifiant)
		Identifiant idf = new Identifiant(node, generator);
		idf.genererCode(pile);
		
		//On récupère l'adresse du tableau, qui est stockée dans la codeassse pointée par R1
		codeass.append("LDW R1, (R1)");
		
		//On modifie l'adresse de R1 par le saut
		codeass.append("ADD R1, R3, R1");
		
		if (node.getChildCount()==2 && node.getChild(1).getText().equals("FIELD")) {
			FieldTableau ft = (FieldTableau) TDS.findIn(pile, node.getText(), FieldType.FieldTableau);
			FieldTypeDefTableau ftdf = (FieldTypeDefTableau) TDS.findIn(pile, ft.getType(), FieldType.FieldTypeDefTableau);
			String type_e = ftdf.getTypeElements();
			FieldTypeDefStructure ftds = (FieldTypeDefStructure) TDS.findIn(pile, type_e, FieldType.FieldTypeDefStructure);
			int num = 0;
			
			for (Couple<String, String> c : ftds.getNomsChampsEtTypes()) {
				
				if(c.getLeft().equals(node.getChild(1).getChild(0).getText())){
					break;
				} else {
					num++;
				}
					
			}
			codeass.append("SUB R1, R3, R1");
			codeass.append("LDQ " + ftds.getNomsChampsEtTypes().size() +", R7");
			codeass.append("MUL R3, R7, R3");
			codeass.append("ADD R1, R3, R1");
			codeass.append("ADQ "+(num * 2)+", R1");
		}
		
		//Enfin on charge le contenu du tableau
		if(f_type.getTypeElements().equals("string"))
			codeass.append("LDW R3, (R1)");
		else
			codeass.append("LDW R3, (R1)");
		
		codeass.append("//Fin de l'accès au tableau");
	}

}
