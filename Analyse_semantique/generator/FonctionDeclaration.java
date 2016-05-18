package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class FonctionDeclaration extends Instruction{
	
	private SupaHackaGenerator generator;

	public FonctionDeclaration(CommonTree node, SupaHackaGenerator generator) {
		super(node);
		this.generator = generator;
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		//On écrit une fonction
		ca.setWritingFunc(true);
		
		String func_name = node.getChild(0).getText();
		ca.append(func_name);
		ca.append(Fonction.saveRegisters());
		
		generator.genererChild((CommonTree) node.getChild(2));
		
		ca.append(Fonction.reloadRegisters());
		ca.append("RTS");
		ca.setWritingFunc(false);
	}

}
