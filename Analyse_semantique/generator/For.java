package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class For extends Instruction {
	
	private static int nb_for = 0; //Un id pour différencier les étiquettes de boucles.

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
		
		/*On génère l'étiquette de la boucle*/
		ca.append("boucle" + nb + " //Etiquette de la boucle");
		
		/*On génère les instructions contenues dans la boucle (code des noeuds fils)*/
		CommonTree block_node = (CommonTree) node.getChild(1);
		generator.genererChild(block_node);
		
		/*On calcule la borne sup (stockée dans R3)*/
		CommonTree expr_sup = (CommonTree) var_compteur.getChild(1).getChild(0);
		ExpressionArithmetique sup = new ExpressionArithmetique(expr_sup, this.generator);
		sup.genererCode(pile);
		
		//On charge le compteur dans R2
		Identifiant idf = new Identifiant(var_compteur, this.generator);
		idf.genererCode(pile);
		ca.append("LDW R2, (R1) //On charge le compteur dans R2"); //R2 = contenu pointé par R1
		
		/*On soustrait le compteur à la borne sup*/
		ca.append("SUB R3, R2, R3");
		
		/*Si égal à 0, on va à l'étiquette de sortie de boucle*/
		ca.append("BEQ sortie_boucle"+nb+"-$-2");
		
		/*Sinon, on incrémente le compteur*/
		ca.append("ADQ 1, R2 //on incrémente le compteur");
		ca.append("STW R2, (R1) //On met a jour le compteur en memoire");
		
		/*Et saut inconditionnel jusqu'au début de la boucle*/
		ca.append("BMP boucle"+nb+"-$-2");
		
		/*Enfin, étiquette de sortie de boucle*/
		ca.append("sortie_boucle" + nb);
		
		/*On dépile le compteur*/
		ca.append("LDW R3, (R15)+ //on dépile le compteur");
	}

}
