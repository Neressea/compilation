package generator;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Couple;
import analyse.Field;
import analyse.FieldStructure;
import analyse.FieldTableau;
import analyse.FieldType;
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
			
			//On restaure R3
			ca.append("LDW R3, R4");
		
		//Si on affecte à un champ de structure (si nb_fils == 0, on affecte toute la structure comme une var normale)
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
				ca.append("//On fout le tout dans R3");
			}
		}
		
		//On affecte la valeur de retour (R3) dans la mémoire
		ca.append("STW R3, (R1) //On stocke le resultat dans la mémoire");
	}
}
