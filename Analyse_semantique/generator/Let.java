package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Let extends Instruction{

	public Let(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		CodeAss ca = CodeAss.getCodeSingleton();
		ca.append(Fonction.openEnv());
		
		//On g�n�re le bloc des d�clarations
		generator.genererChild((CommonTree) node.getChild(0));
		
		//On g�n�re le bloc d'ex�cution s'il y en a un 
		if(node.getChildCount() == 2)
			generator.genererChild((CommonTree) node.getChild(1));
		
		ca.append(Fonction.closeEnv());
	}

}
