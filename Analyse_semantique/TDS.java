import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Représente la fonction principale qui doit-être implémentée par toute TDS.
 *
 */
public class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	private static int NB_TDS = 0;
	
	//Numéro d'imbrication du bloc
	private int nb_imbrication;
	
	//Numéro du bloc (identifiant unique)
	private int nb_bloc;
	
	private ArrayList<Field> fields;
	
	public TDS(){
		nb_bloc = NB_TDS;
		NB_TDS++;
		fields = new ArrayList<Field>();
	}
}
