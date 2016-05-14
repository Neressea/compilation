package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Fonction extends Instruction{

	public Fonction(CommonTree node) {
		super(node);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		
		CodeAss ca = CodeAss.getCodeSingleton();
		
		//on regarde s'il s'agit de l'une des deux fonctions du langage (print ou read).
		String function_name = node.getChild(0).getText();
		CommonTree params_effectifs = (node.getChildCount() == 1) ? null : (CommonTree) node.getChild(1);
		
		if(function_name.equals("print")){
			
			//On récupère le paramètre que veut afficher le programmeur
			OperandeSimple os = new OperandeSimple((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3 : adresse de la chaine
			os.genererCode(pile);
			
			//On le transfère dans R0
			ca.append("LDW R0, R3");
			
			//On charge la trappe WRITE dans WR
			ca.append("JSR @print");
			
		}else if(function_name.equals("printi")){
			
			//On récupère le paramètre que veut afficher le programmeur
			OperandeSimple os = new OperandeSimple((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3
			os.genererCode(pile);
			
			//On empile R3
			ca.append("STW R3, -(R15)");
			
			//On sauvegarde l'adresse de la pile dans R0
			ca.append("LDW R0, R15");
			
			//On empile NUL
			ca.append("LDQ 0, R3");
			ca.append("STW R3, -(R15)");
			
			//On se branche sur le sous-programme d'écriture
			ca.append("JSR @printi");
			
		}else if(function_name.equals("read")){

			//On se branche sur le sous-programme : le résultat sera à l'adresse de R0, c'est-à-dire au début de la mémoire.
			ca.append("JEA @read");
			
		}else{
			//Autrement, c'est une fonction du programmeur
			
		}
	}

}
