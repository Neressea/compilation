package generator;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Couple;
import analyse.Field;
import analyse.FieldStructure;
import analyse.FieldTableau;
import analyse.FieldType;
import analyse.FieldTypeDefStructure;
import analyse.FieldTypeDefTableau;
import analyse.FieldVariable;
import analyse.TDS;

public class Affectation extends Instruction{
		
	public Affectation(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}
	
	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		
		//On effectue les calculs de la partie droite
		ExpressionArithmetique expr = new ExpressionArithmetique((CommonTree) node.getChild(1), this.generator);
		expr.genererCode(pile);
		
		//On sauvegarde l'adresse pouur les affectations de structures
		ca.append("LDW R5, R1");
		
		Field f = TDS.findIn(pile, node.getChild(0).getText(), FieldType.FieldVariable, FieldType.FieldTableau, FieldType.FieldStructure);
		
		//On calcule l'adresse de la variable dans la pile : adresse chargée dans R1
		Identifiant idf = new Identifiant((CommonTree) node.getChild(0), this.generator);
		idf.genererCode(pile);
		
		//Si on affecte à une case d'un tableau (si nb_fils == 0, on affecte toute le tableau comme une var normale)
		if(f.getFieldType().equals(FieldType.FieldTableau) && node.getChild(0).getChildCount() > 0){
			
			//On déplace l'opérande droite dans un autre registre
			ca.append("LDW R4, R3");
			
			//On sauvegarde R1
			ca.append("LDW R5, R1");
			
			//On calcule la case accédée : résultat dans R3
			ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) node.getChild(0).getChild(0).getChild(0), generator);
			ea.genererCode(pile);
			
			//On restaure R1
			ca.append("LDW R1, R5");
			
			//on multiplie le saut par 2 pour retomber sur des mots
			ca.append("ADD R3, R3, R3");
			
			//On récupère l'adresse du tableau, qui est stockée dans la case pointée par R1
			ca.append("LDW R1, (R1)");
			
			//On modifie l'adresse de R1 par le saut
			ca.append("ADD R1, R3, R1");
			
			if (node.getChildCount()==2 && node.getChild(0).getChild(1).getText().equals("FIELD")) {
				FieldTableau ft = (FieldTableau) TDS.findIn(pile, node.getChild(0).getText(), FieldType.FieldTableau);
				FieldTypeDefTableau ftdf = (FieldTypeDefTableau) TDS.findIn(pile, ft.getType(), FieldType.FieldTypeDefTableau);
				String type_e = ftdf.getTypeElements();
				FieldTypeDefStructure ftds = (FieldTypeDefStructure) TDS.findIn(pile, type_e, FieldType.FieldTypeDefStructure);
				int num = 0;
				
				for (Couple<String, String> c : ftds.getNomsChampsEtTypes()) {
					if(c.getLeft().equals(node.getChild(0).getChild(1).getChild(0).getText())){
						break;
					}else
						num++;
				}
				
				ca.append("ADQ "+(num * 2)+", R1");
			}
			
			//On restaure R3
			ca.append("LDW R3, R4");
		
		//Si on affecte à un champ de structure (si nb_fils == 0, on affecte toute la structure)
		}else if(f.getFieldType().equals(FieldType.FieldStructure) && node.getChild(0).getChildCount() > 0){
			//On récupère le vrai noeud
			String field = node.getChild(0).getChild(0).getChild(0).getText();
			FieldStructure fs = (FieldStructure) f;
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
				ca.append("//Calcul de l'adresse du champ");
				saut_to_champ*=2;
				ca.append("ADQ -"+saut_to_champ+", R1");
			}
		}
		
		//On affecte des structures entre elles
		if(f.getFieldType().equals(FieldType.FieldStructure)  && node.getChild(0).getChildCount() == 0){
			//On récupère le vrai noeud
			FieldStructure fs = (FieldStructure) f;
			int saut_to_champ = 0;
			
			//On recherche le champ
			for (Couple<String, CommonTree> couple : fs.getFieldsAndValues()) {
				//On recopie tous les champs
				ca.append("//Copie de "+couple.getLeft());
				ca.append("LDW R4, (R5) //On charge la valeur à copier");
				ca.append("STW R4, (R1)");
				ca.append("LDW R9, R4");
				
				saut_to_champ += 2;
				ca.append("ADQ -"+saut_to_champ+", R5");
				ca.append("ADQ -"+saut_to_champ+", R1");
			}
		}else{
			//On affecte la valeur de retour (R3) dans la mémoire
			ca.append("STW R3, (R1) //On stocke le resultat dans la mémoire");
		}
		
		
	}
}
