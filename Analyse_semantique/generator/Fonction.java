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
			
			//On charge la trappe WRITE dans WR
			ca.append("LDQ 66, R14");
			
		}else if(function_name.equals("printi")){
			//On récupère le paramètre que veut afficher le programmeur
			OperandeSimple os = new OperandeSimple((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3
			os.genererCode(pile);
			
			//On charge la trappe WRITE dans WR
			ca.append("LDQ 66, R14");
			
		}else if(function_name.equals("read")){
			//On récupère l'entrée de l'utilisateur
			
			//On charge la trappe READ dans WR
			ca.append("LDQ 65, R14");
			
			//On la renvoie au programmeur dans R5
			
		}else{
			//Autrement, c'est une fonction du programmeur
			
		}
	}

}
