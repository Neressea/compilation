package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Condition extends Instruction{

	public Condition(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		String token = node.getText();
		CodeAss codeass = CodeAss.getCodeSingleton();

		generateCodeComp(pile, codeass, (CommonTree) node);
		codeass.append("STW R3, -(R15)\n");
		
	}
	
	private void generateCodeComp(ArrayList<TDS> pile, CodeAss codeass, CommonTree node){
		if (node.getText().equals("&")){
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
			String buffer = "LDW (R15)+, R2\n"
							+"CMP R2, #1\n"
							+"BEQ $-6\n"
							+"LDW R3, #0\n"
							+"JMP $-8\n"
							+"CMP R3, #1\n"
							+"BEQ $-4\n"
							+"LDW R3, #0\n"
							+"STW R3, -(R15)\n";
			codeass.append(buffer);
		}else if(node.getText().equals("|")){
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
			generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
			String buffer = "LDW (R15)+, R2\n"
							+"CMP R2, #1\n"
							+"BEQ $-8\n"
							+"CMP R3, #1\n"
							+"BEQ $-4\n"
							+"LDW R3, #0\n"
							+"STW R3, -(R15)\n";
			codeass.append(buffer);
		}else{
			ExpressionArithmetique op1 = new ExpressionArithmetique((CommonTree) node.getChild(0));
			op1.genererCode(pile);
			codeass.append("LDW R2, R3\n");
			ExpressionArithmetique op2 = new ExpressionArithmetique((CommonTree) node.getChild(1));
			op2.genererCode(pile);
			String buffer = "CMP R2, R3\n";
			switch (node.getText()){
				case "<":
					buffer+="BLT 6\n";
					break;
				case "<=":
					buffer+="BLE $-6\n";
					break;
				case "=":
					buffer+="BEQ 0x$-6\n";
					break;
				case ">":
					buffer+="BGT $-6\n";
					break;
				case ">=":
					buffer+="BGE $-6\n";
					break;
				case "<>":
					buffer+="BNE $-6\n";
					break;
			}
			buffer += "LDW R3, #0\n"
			+"JMP #4\n"
			+"LDW R3, #1\n"
			+"STW R3, -(R15)\n";
			codeass.append(buffer);
		}
		
		
		
	}

}
