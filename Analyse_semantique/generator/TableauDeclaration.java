package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class TableauDeclaration extends Instruction{

	private static int nb_tab_decl = 0; 
	
	public TableauDeclaration(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss codeass = CodeAss.getCodeSingleton();
		
		String name = node.getChild(0).getText();
		ExpressionArithmetique size = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(0).getChild(0), generator); 
		size.genererCode(pile);
		System.out.println(name);
		codeass.append(name+" RSB R3");
		codeass.append("LDW R5, R3");
		codeass.append("STW #"+name+" , -(R15)");
		codeass.append("LDW R10, #"+name);
		ExpressionArithmetique init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0), generator);
		init.genererCode(pile);
		codeass.append("LDW R6, R3");
		codeass.append("LDW R7, #"+name);
		codeass.append("RETOUR"+nb_tab_decl+" LDW (R7), R6");
		codeass.append("ADQ -1,  R5");
		codeass.append("ADQ 2,  R7");
		codeass.append("TST R5");
		codeass.append("BNE RETOUR"+nb_tab_decl+"-$-2");
		nb_tab_decl++;
		
	}

}
