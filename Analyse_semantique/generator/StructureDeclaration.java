package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class StructureDeclaration extends Instruction{

	public StructureDeclaration(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		
		CommonTree elems = (CommonTree) node.getChild(1);
		//On parcours tous les champs
		System.out.println(elems);
		for (int i = 0; i < elems.getChildCount(); i++) {
			CommonTree current = (CommonTree) elems.getChild(i).getChild(0);
			
			//On génère leur code : résultat dans R3
			ExpressionArithmetique el = new ExpressionArithmetique(current, generator);
			el.genererCode(pile);
			
			//On empile le résultat
			ca.append("STW R3, -(R15)");
		}
	}

}
