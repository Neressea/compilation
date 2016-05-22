package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.Field;
import analyse.FieldTableau;
import analyse.FieldType;
import analyse.FieldTypeDefSimple;
import analyse.FieldTypeDefStructure;
import analyse.FieldTypeDefTableau;
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
			
			FieldTableau f = (FieldTableau) TDS.findIn(pile, name, FieldType.FieldTableau);
			FieldTypeDefTableau f_type = (FieldTypeDefTableau) TDS.findIn(pile, f.getType(), FieldType.FieldTypeDefTableau);
			
			String t = f_type.getTypeElements();
			Field ffXIV = TDS.findIn(pile, t, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
			if (ffXIV.getFieldType().equals(FieldType.FieldTypeDefStructure)) {
				FieldTypeDefStructure ffXV = (FieldTypeDefStructure) ffXIV;
				int size = Integer.parseInt(node.getChild(1).getChild(0).getChild(0).getText());
				int taille = size * ffXV.getNomsChampsEtTypes().size();
				codeass.append(name+" RSB "+taille);
								
				codeass.append("LDW R7, #"+name);
				codeass.append("STW R7, -(R15)");
				codeass.append("LDW R7, #"+taille);
				codeass.append("LDW R8, #0");
				codeass.append("LDW R5, #"+name);
				ExpressionArithmetique init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0), generator);
				init.genererCode(pile);
				
				codeass.append("LDQ "+(ffXV.getNomsChampsEtTypes().size()-1)+", R9");
				codeass.append("LDQ 0, R10");
				codeass.append("LDW R6, R3");
				codeass.append("LOOPTAB"+nb_tab_decl+" STW R6, (R5)");
				codeass.append("ADQ 2, R5");
				codeass.append("ADQ -2, R1");
				codeass.append("LDW R6, (R1)");// Du Beurre de Kalité
				codeass.append("ADQ 1, R8");
				codeass.append("ADQ 1, R10");//...BOB
				codeass.append("CMP R9, R10");
				codeass.append("BNE ENDSTRUCTAB"+nb_tab_decl+"-$-2");
				codeass.append("STW R6, (R5)");
				codeass.append("ADQ 2, R5");
				codeass.append("ADD R10, R10, R10");
				codeass.append("ADD R1, R10, R1");//ET LA C'EST LE DRAME
				codeass.append("LDQ 0, R10");
				codeass.append("LDW R6, (R1)");
				codeass.append("ENDSTRUCTAB"+nb_tab_decl);//blou
				codeass.append("CMP R7, R8");
				codeass.append("BEQ ENDTAB"+nb_tab_decl+"-$-2");
				codeass.append("BMP LOOPTAB"+nb_tab_decl+"-$-2");
				codeass.append("ENDTAB"+nb_tab_decl);
				nb_tab_decl++;
				
				
				
				
				
				
				
				
				
			} else {			
				int size = Integer.parseInt(node.getChild(1).getChild(0).getChild(0).getText());
				codeass.append(name+" RSB "+(size*2));
				codeass.append("LDW R7, #"+name);
				codeass.append("STW R7, -(R15)");
				codeass.append("LDW R7, #"+size);
				codeass.append("LDW R8, #0");
				codeass.append("LDW R5, #"+name);
				ExpressionArithmetique init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0), generator);
				init.genererCode(pile);
				codeass.append("LDW R6, R3");
				codeass.append("LOOPTAB"+nb_tab_decl+" STW R6, (R5)");
				codeass.append("ADQ 2, R5");
				codeass.append("ADQ 1, R8");
				codeass.append("CMP R7, R8");
				codeass.append("BEQ ENDTAB"+nb_tab_decl+"-$-2");
				codeass.append("BMP LOOPTAB"+nb_tab_decl+"-$-2");
				codeass.append("ENDTAB"+nb_tab_decl);
				nb_tab_decl++;
			}
		}else{
			
		}
		
		
		
	}

}
