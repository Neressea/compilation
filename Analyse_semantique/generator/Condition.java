package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Condition extends Instruction{

	public Condition(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss codeass = CodeAss.getCodeSingleton();

		generateCodeComp(pile, codeass, node);
		codeass.append("STW R3, -(R15)");
		
	}
	
	private void generateCodeComp(ArrayList<TDS> pile, CodeAss codeass, CommonTree node){
		if (node.getText().equals("&")){
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
			codeass.append("LDW (R15)+, R2");
			codeass.append("CMP R2, #1");
			codeass.append("BEQ $-6");
			codeass.append("LDW R3, #0");
			codeass.append("JMP $-8");
			codeass.append("CMP R3, #1");
			codeass.append("BEQ $-4");
			codeass.append("LDW R3, #0");
			codeass.append("STW R3, -(R15)");
		}else if(node.getText().equals("|")){
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
			codeass.append("LDW (R15)+, R2");
			codeass.append("CMP R2, #1");
			codeass.append("BEQ $-8");
			codeass.append("CMP R3, #1");
			codeass.append("BEQ $-4");
			codeass.append("LDW R3, #0");
			codeass.append("STW R3, -(R15)");
		}else{
			OperandeSimple op1 = new OperandeSimple((CommonTree) node.getChild(0));
			op1.genererCode(pile);
			codeass.append("LDW R2, R3");
			OperandeSimple op2 = new OperandeSimple((CommonTree) node.getChild(1));
			op2.genererCode(pile);
			codeass.append("CMP R2, R3");
			switch (node.getText()){
				case "<":
					codeass.append("BLT $-6");
					break;
				case "<=":
					codeass.append("BLE $-6");
					break;
				case "=":
					codeass.append("BEQ $-6");
					break;
				case ">":
					codeass.append("BGT $-6");
					break;
				case ">=":
					codeass.append("BGE $-6");
					break;
				case "<>":
					codeass.append("BNE $-6");
					break;
			}
			codeass.append("LDW R3, #1");
			codeass.append("JMP $-4");
			codeass.append("LDW R3, #0");
			codeass.append("STW R3, -(R15)");
		}
		
		
		
	}

}
