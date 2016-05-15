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
		
		Fonction.openEnv();
		
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
			
			//On place le résultat dans R3
			ca.append("LDW R3, R0");
		
		}else if(function_name.equals("itoa")){
		
		}else{
			//Autrement, c'est une fonction du programmeur
			ca.append("CALL : "+function_name);
		}
		
		Fonction.closeEnv();
	}
	
	
	
	/**
	 * Ouvre un nouvel environnement dans la pile
	 */
	public static void openEnv(){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		ca.append("//On ouvre un nouvel environnement dans la pile");
		ca.append("STW BP, -(SP) //On sauvegarde l'ancienne base sur le sommet de la pile");
		ca.append("LDW BP, SP //Le sommet de la pile devient la nouvelle base");
	}
	
	/**
	 * Ferme l'environnement courant dans la pile
	 */
	public static void closeEnv(){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		ca.append("//On ferme l'environnement courant");
		ca.append("LDW SP, BP //On réintiialise le sommet de la pile à la base courante");
		ca.append("LDW BP, (SP)+ //On dépile l'ancienne base");
	}
	
	/**
	 * Fonction sauvegardant les registres lors de l'ouverture d'un nouvel environnement
	 */
	private void saveRegisters(){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		ca.append("//On sauvegarde les registres");
		for (int i = 0; i < 15; i++) {
			ca.append("STW R"+i+", -(SP)");
		}
	}
	
	/**
	 * Recharge les registres après la sortie dela fonction
	 */
	private void reloadRegisters(){
		CodeAss ca = CodeAss.getCodeSingleton();
		
		ca.append("//On recharge les registres");
		for (int i = 0; i < 15; i++) {
			ca.append("LDW R"+i+", (SP)+");
		}
	}
}
