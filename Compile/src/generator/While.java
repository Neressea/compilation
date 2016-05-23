package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class While extends Instruction{
	
	private static int nb_while = 0; 
	
	public While(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		nb_while++;
		CodeAss ca = CodeAss.getCodeSingleton();
		Condition condWhile = new Condition((CommonTree) node.getChild(0).getChild(0), this.generator);
		
		// Creation etiquette code boucle while
		ca.append("boucleW" + nb_while + " // etiquette debut while");
		
		// On genere le code la condition, resultat dans R3
		condWhile.genererCode(pile);
		
		// Mise a jour des indicateurs de R3
		ca.append("TST R3");
		
		// Si faux saut a la fin
		ca.append("BEQ endWhile" + nb_while + "-$-2");
		
		// Generation code dans while
		CommonTree nodeBlock = (CommonTree)node.getChild(1);
		generator.genererChild(nodeBlock);
		
		// Saut au debut du while
		ca.append("BMP boucleW" + nb_while + "-$-2");
		
		// Etiquette fin while
		ca.append("endWhile" + nb_while + " //etiquette fin while");
	}

}
