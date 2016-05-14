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
			
			//On r�cup�re le param�tre que veut afficher le programmeur
			OperandeSimple os = new OperandeSimple((CommonTree) params_effectifs.getChild(0));
			
			//Le r�sultat est foutu dans R3 : adresse de la chaine
			os.genererCode(pile);
			
			//On le transf�re dans R0
			ca.append("LDW R0, R3");
			
			//On charge la trappe WRITE dans WR
			ca.append("LDQ 66, R14");
			
		}else if(function_name.equals("printi")){
			
			//On r�cup�re le param�tre que veut afficher le programmeur
			OperandeSimple os = new OperandeSimple((CommonTree) params_effectifs.getChild(0));
			
			//Le r�sultat est foutu dans R3
			os.genererCode(pile);
			
			//On transf�re son adresse dans R0	
			ca.append("STRING");
			
			//On se branche sur le sous-programme d'�criture
			ca.append("JEA @printi");
			
		}else if(function_name.equals("read")){

			//On se branche sur le sous-programme : le r�sultat sera � l'adresse de R0, c'est-�-dire au d�but de la m�moire.
			ca.append("JEA @read");
			
		}else{
			//Autrement, c'est une fonction du programmeur
			
		}
	}

}
