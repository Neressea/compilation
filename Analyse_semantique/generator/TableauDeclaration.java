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
		boolean isNumb = true;
		
		try{
			Integer.parseInt(node.getChild(1).getChild(0).getChild(0).getText());
		}catch(Exception e){
			isNumb = false;
		}
		
		if (isNumb){
			int size = Integer.parseInt(node.getChild(1).getChild(0).getChild(0).getText());
			System.out.println(size);
			codeass.append(name+" RSW "+size);
			codeass.append("LDW R7, #"+name);
			codeass.append("STW R7, -(R15)");
			codeass.append("LDW R7, #"+size);
			codeass.append("LDW R8, #0");
			codeass.append("LDW R5, #"+name);
			ExpressionArithmetique init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0), generator);
			init.genererCode(pile);
			codeass.append("LDW R6, R3");
			codeass.append("LOOPTAB"+nb_tab_decl+" STW R6, (R5)");
			codeass.append("ADQ -2, R5");
			codeass.append("ADQ 1, R8");
			codeass.append("CMP R7, R8");
			codeass.append("BEQ ENDTAB"+nb_tab_decl+"-$-2");
			codeass.append("BMP LOOPTAB"+nb_tab_decl+"-$-2");
			codeass.append("ENDTAB"+nb_tab_decl);
			nb_tab_decl++;
		}else{
			
		}
		
		
		
	}

}
