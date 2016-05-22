package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class FonctionDeclaration extends Instruction{
	
	public FonctionDeclaration(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		//On �crit une fonction
		ca.setWritingFunc(true);
		
		String func_name = node.getChild(0).getText();
		ca.append(func_name);
		ca.append(Fonction.saveRegisters());
		ca.append(Fonction.openEnv());
		
		if(node.getChildCount() == 3)
		
		generator.genererChild((CommonTree) node.getChild(2));
		
		else
			
			generator.genererChild((CommonTree) node.getChild(1));
		
		ca.append(Fonction.closeEnv());
		ca.append(Fonction.reloadRegisters());
		ca.append("RTS");
		ca.setWritingFunc(false);
	}

}
