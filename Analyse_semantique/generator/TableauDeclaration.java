package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class TableauDeclaration extends Instruction{

	public TableauDeclaration(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss codeass = CodeAss.getCodeSingleton();
		
		String name = node.getChild(0).getText();
		
		codeass.append(name+" STB 80");
		codeass.append("STW #"+name+" , -(R15)");
	}

}
