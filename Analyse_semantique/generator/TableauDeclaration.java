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
		CodeAss codeass = CodeAss.getCodeSingleton();
		
		String name = node.getChild(0).getText();
		ExpressionArithmetique size = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(0).getChild(0), generator); 
		size.genererCode(pile);
		codeass.append("LDW R5, R3");
		codeass.append("LOOPTAB"+nb_tab_decl+" TST R5");
		codeass.append("BEQ ENDTAB"+nb_tab_decl+"-$-2");
		ExpressionArithmetique init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0), generator);
		init.genererCode(pile);
		codeass.append("STW R3, -(R15)");
		codeass.append("ADQ -1, R5");
		codeass.append("BMP LOOPTAB"+nb_tab_decl+"-$-2");
		codeass.append("ENDTAB"+nb_tab_decl);
		nb_tab_decl++;
		
	}

}
