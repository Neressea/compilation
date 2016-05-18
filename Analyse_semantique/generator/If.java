package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class If extends Instruction{
	
	private SupaHackaGenerator generator;
	private static int nb_if = 0;

	public If(CommonTree node, SupaHackaGenerator generator) {
		super(node);
		this.generator = generator;
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		CodeAss ca = CodeAss.getCodeSingleton();
		Condition condIf = new Condition((CommonTree) node.getChild(0).getChild(0));
		// On genere le code de la condition, le resultat est dans R3
		condIf.genererCode(pile);
		
		// Mise a jour des indicateurs de R3
		ca.append("TST R3");
		
		// Saut conditionnel
		ca.append("BGT else" + nb_if + "-$-2");
		
		// On cree l'etiquette du THEN
		ca.append("then" + nb_if + " //etiquette then");
		
		// Generation du contenu de then
		CommonTree nodeThen = (CommonTree)node.getChild(1);
		generator.genererChild(nodeThen);
		
		// Saut a endif (on a execute le contenu de then)
		ca.append("endif" + nb_if + "-$-2");
		
		// Etiquette de ELSE
		ca.append("else" + nb_if + " //etiquette else");
		
		// Contenu de else
		CommonTree nodeElse = (CommonTree)node.getChild(2);
		generator.genererChild(nodeElse);
		
		// etiquette ENDIF
		ca.append("endif" + nb_if + " //etiquette fin de if");
		
		
	}

}
