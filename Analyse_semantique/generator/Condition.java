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
			String buffer = "CMP R2, R3\n";
			switch (node.getText()){
				case "<":
					buffer+="BLT 6\n";
					break;
				case "<=":
					buffer += "BLE $-6\n";
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
