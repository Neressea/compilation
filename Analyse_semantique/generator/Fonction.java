package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import com.sun.org.apache.bcel.internal.classfile.Code;

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
			ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3 : adresse de la chaine
			ea.genererCode(pile);
			
			//On le transfère dans R0
			ca.append("LDW R0, R3");
			
			//On charge la trappe WRITE dans WR
			ca.append("JSR @print");
			
		}else if(function_name.equals("printi")){
			
			//On récupère le paramètre que veut afficher le programmeur
			ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3
			ea.genererCode(pile);
			
			//On le déplace dans R5
			ca.append("LDW R5, R3");
			
			//On considère que c'est de la base 10
			ca.append("LDQ 10, R6");
			
			//On appelle itoa pour obtenir une chaine (@ de la chaine dans R3)
			ca.append("JSR @itoa");
			
			//Puis on met le résultat dans R0
			ca.append("LDW R0, R3");
			
			//On se branche sur le sous-programme d'écriture
			ca.append("JSR @printi");
			
		}else if(function_name.equals("read")){
			
			ca.append("JSR @read");
		
		}else if(function_name.equals("itoa")){
			//On récupère le paramètre que veut convertir le programmeur
			ExpressionArithmetique entier = new ExpressionArithmetique((CommonTree) params_effectifs.getChild(0));
			
			//Le résultat est foutu dans R3
			entier.genererCode(pile);
			
			//On le déplace dans R5
			ca.append("LDW R5, R3");
			
			//On charge la base que l'utilisateur veut utiliser
			ExpressionArithmetique base_op = new ExpressionArithmetique((CommonTree) params_effectifs.getChild(1));
			
			//Résultat dans R3
			base_op.genererCode(pile);
			
			//On le déplace dans R6
			ca.append("LDW R6, R3");
			
			//On appelle itoa pour obtenir une chaine (@ de la chaine dans R3)
			ca.append("JSR @itoa");
		}else{
			//Autrement, c'est une fonction du programmeur
			ca.append("CALL : "+function_name);
			
			//On empile les paramètres
			
			//On appelle la fonction
			
			//On dépile les paramètres
		}
	}
	
	
	
	/**
	 * Ouvre un nouvel environnement dans la pile
	 */
	public static String openEnv(){
		
		String code = "//On ouvre un nouvel environnement dans la pile\n";
		code += "STW BP, -(SP) //On sauvegarde l'ancienne base sur le sommet de la pile\n";
		code += "LDW BP, SP //Le sommet de la pile devient la nouvelle base\n";
		
		return code;
	}
	
	/**
	 * Ferme l'environnement courant dans la pile
	 */
	public static String closeEnv(){		
		String code = "//On ferme l'environnement courant\n";
		code += "LDW SP, BP //On réintiialise le sommet de la pile à la base courante\n";
		code += "LDW BP, (SP)+ //On dépile l'ancienne base\n";
		
		return code;
	}
	
	/**
	 * Fonction sauvegardant les registres lors de l'ouverture d'un nouvel environnement
	 */
	public static String saveRegisters(){
		
		String code = "//On sauvegarde les registres\n";
		for (int i = 0; i < 15; i++) {
			if( i != 3) //Le registre 3 est utilisé pour les retours
				code += "STW R"+i+", -(SP)\n";
		}
		
		return code;
	}
	
	/**
	 * Recharge les registres après la sortie dela fonction
	 */
	public static String reloadRegisters(){
		
		String code = "//On recharge les registres\n";
		for (int i = 14; i>=0; i--) {
			if( i != 3) //Le registre 3 est utilisé pour les retours
				code += "LDW R"+i+", (SP)+\n";
		}
		
		return code;
	}
}
