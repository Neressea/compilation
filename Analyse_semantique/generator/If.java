package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class If extends Instruction{
	
	private static int nb_if = 0;

	public If(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		int current = nb_if++;
		CodeAss ca = CodeAss.getCodeSingleton();
		Condition condIf = new Condition((CommonTree) node.getChild(0).getChild(0), this.generator);
		// On genere le code de la condition, le resultat est dans R3
		condIf.genererCode(pile);
		
		// Mise a jour des indicateurs de R3
		ca.append("TST R3");
		
		// Saut conditionnel
		if(node.getChildCount() == 3)
			ca.append("BEQ else" + current + "-$-2");
		else
			ca.append("BEQ endif" + current + "-$-2");
		
		// On cree l'etiquette du THEN
		ca.append("then" + current + " //etiquette then");
		
		// Generation du contenu de then
		CommonTree nodeThen = (CommonTree)node.getChild(1);
		generator.genererChild(nodeThen);
		
		// Saut a endif (on a execute le contenu de then)
		ca.append("BMP endif" + current + "-$-2");
		
		if(node.getChildCount() == 3){
			// Etiquette de ELSE
			ca.append("else" + current + " //etiquette else");
			
			// Contenu de else
			CommonTree nodeElse = (CommonTree)node.getChild(2);
			generator.genererChild(nodeElse);
		}
		
		// etiquette ENDIF
		ca.append("endif" + current + " //etiquette fin de if");
		
		
	}

}
