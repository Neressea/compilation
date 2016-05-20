package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class TableauAcces extends Instruction{
	
	public TableauAcces(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss codeass = CodeAss.getCodeSingleton();
		
		String name = node.getText();
		int deplacement = 0;
	
		//Adresse de la chaine dans R5
		codeass.append("ADQ "+deplacement+", R5");
		codeass.append("LDW R3, (R5)");
	}

}
