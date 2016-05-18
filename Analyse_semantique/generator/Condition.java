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
		codeass.append("" +
				"LDW R3, (R15)+\n");

		
	}
	
	private void generateCodeComp(ArrayList<TDS> pile, CodeAss codeass, CommonTree node){
		boolean isNumb = true;
		
		try{
			Integer.parseInt(node.getText());
		}catch(Exception e){
			isNumb = false;
		}
		
		if (isNumb){
			ExpressionArithmetique op = new ExpressionArithmetique((CommonTree) node);
			op.genererCode(pile);
			codeass.append("STW R3, -(R15)");
		}else{
			if (node.getText().equals("&")){
				generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
				generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
				codeass.append("LDW R2, (R15)+");
				codeass.append("LDW R3, (R15)+");
				codeass.append("TST R2");
				codeass.append("BEQ 4");
				codeass.append("TST R3");
				codeass.append("BNE 4");
				codeass.append("LDQ 0, R3");
				codeass.append("JMP #4");
				codeass.append("LDQ 1, R3");
				codeass.append("STW R3, -(R15)");
			}else if(node.getText().equals("|")){
				generateCodeComp(pile, codeass, (CommonTree) node.getChild(0));
				generateCodeComp(pile, codeass, (CommonTree) node.getChild(1));
				codeass.append("LDW R2, (R15)+");
				codeass.append("LDW R3, (R15)+");
				codeass.append("TST R2");
				codeass.append("BNE 4");
				codeass.append("TST R3");
				codeass.append("BEQ 2");
				codeass.append("LDQ 1, R3");
				codeass.append("JMP #4");
				codeass.append("LDQ 0, R3");
				codeass.append("STW R3, -(R15)");
			}else{
				ExpressionArithmetique op1 = new ExpressionArithmetique((CommonTree) node.getChild(0));
				op1.genererCode(pile);
				codeass.append("LDW R2, R3");
				ExpressionArithmetique op2 = new ExpressionArithmetique((CommonTree) node.getChild(1));
				op2.genererCode(pile);
				String buffer = "CMP R2, R3\n";
				switch (node.getText()){
					case "<":
						buffer+="BLW 4\n";
						break;
					case "<=":
						buffer += "BLE 4\n";
						break;
					case "=":
						buffer+="BEQ 4\n";
						break;
					case ">":
						buffer+="BGT 4\n";
						break;
					case ">=":
						buffer+="BGE 4\n";
						break;
					case "<>":
						buffer+="BNE 4\n";
						break;
				}

				buffer += "LDQ 0, R3\n"
				+"JMP #4\n"
				+"LDQ 1, R3\n"
				+"STW R3, -(R15)\n";
				codeass.append(buffer);

				
			}
		}
		
		
		
		
		
		
	}

}
