import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Repr�sente la fonction principale qui doit-�tre impl�ment�e par toute TDS.
 *
 */
public class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	private static int NB_TDS = 0;
	
	//Num�ro d'imbrication du bloc
	private int nb_imbrication;
	
	//Num�ro du bloc (identifiant unique)
	private int nb_bloc;
	
	private ArrayList<Field> fields;
	
	public TDS(){
		nb_bloc = NB_TDS;
		NB_TDS++;
		fields = new ArrayList<Field>();
	}
}
