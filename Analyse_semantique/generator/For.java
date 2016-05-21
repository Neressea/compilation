package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class For extends Instruction {
	
	private static int nb_for = 0; //Un id pour diff�rencier les �tiquettes de boucles.

	public For(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		int nb = nb_for++;
		CodeAss ca = CodeAss.getCodeSingleton();
				
		/*On calcule la valeur initiale du compteur et on l'empile*/
		CommonTree var_compteur = (CommonTree) node.getChild(0);
		CommonTree expr_begin = (CommonTree) var_compteur.getChild(0).getChild(0);
		ExpressionArithmetique begin = new ExpressionArithmetique(expr_begin, this.generator);
		begin.genererCode(pile);
		
		//On empile R3
		ca.append("STW R3, -(R15) //On empile valeur initiale du compteur de boucle");
		
		/*On g�n�re l'�tiquette de la boucle*/
		ca.append("boucle" + nb + " //Etiquette de la boucle");
		
		/*On g�n�re les instructions contenues dans la boucle (code des noeuds fils)*/
		CommonTree block_node = (CommonTree) node.getChild(1);
		generator.genererChild(block_node);
		
		/*On calcule la borne sup (stock�e dans R3)*/
		CommonTree expr_sup = (CommonTree) var_compteur.getChild(1).getChild(0);
		ExpressionArithmetique sup = new ExpressionArithmetique(expr_sup, this.generator);
		sup.genererCode(pile);
		
		//On charge le compteur dans R2
		Identifiant idf = new Identifiant(var_compteur, this.generator);
		idf.genererCode(pile);
		ca.append("LDW R2, (R1) //On charge le compteur dans R2"); //R2 = contenu point� par R1
		
		/*On soustrait le compteur � la borne sup*/
		ca.append("SUB R3, R2, R3");
		
		/*Si �gal � 0, on va � l'�tiquette de sortie de boucle*/
		ca.append("BEQ sortie_boucle"+nb+"-$-2");
		
		/*Sinon, on incr�mente le compteur*/
		ca.append("ADQ 1, R2 //on incr�mente le compteur");
		ca.append("STW R2, (R1) //On met a jour le compteur en memoire");
		
		/*Et saut inconditionnel jusqu'au d�but de la boucle*/
		ca.append("BMP boucle"+nb+"-$-2");
		
		/*Enfin, �tiquette de sortie de boucle*/
		ca.append("sortie_boucle" + nb);
		
		/*On d�pile le compteur*/
		ca.append("LDW R3, (R15)+ //on d�pile le compteur");
	}

}
