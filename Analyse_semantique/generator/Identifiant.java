package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.FieldType;
import analyse.FieldVariable;
import analyse.TDS;

public class Identifiant extends Instruction{

	public Identifiant(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		CodeAss ca = CodeAss.getCodeSingleton();
		
		//On récupère les infos dans les TDS.
		FieldVariable infos = (FieldVariable) TDS.findIn(pile, node.getText(), FieldType.FieldVariable); //Pour l'instant on ne gère que les identifiants de variables simples
		
		//On calcule l'adresse de la variable (dans R4).
		int base = ca.getBasePile();
		//On calcule le saut de la base de la pile jusqu'à la TDS contenant l'identifiant
		int sautTDS = TDS.findSautToTDS(pile, node.getText(), FieldType.FieldVariable);
		int sautVar = infos.getTailleDuSaut();
		
		//On y ajoute le saut de la base de l'environnement jusqu'à la variable
		
		//On range l'adresse dans R4
		String hex = Integer.toHexString(base - sautTDS - sautVar);
		while(hex.length() < 4) hex = "0" + hex;
		ca.append("LDW R1, #0x"+hex+" //On charge l'adresse de l'idf dans R1");
		System.out.println("adresse de "+node.getText()+" = "+hex);
	}

}
