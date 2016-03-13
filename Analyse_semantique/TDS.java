import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Repr�sente la fonction principale qui doit-�tre impl�ment�e par toute TDS.
 *
 */
public class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	public static int NB_TDS = 0;
	
	public static int NB_IMBR = 0;
	
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
	
	public int getImbrication(){
		return nb_imbrication;
	}
	
	public int getBloc(){
		return nb_bloc;
	}
	
	public boolean existIn(String ID, String nature){
		
		for (Field f : this.fields){
			if (f.getNature().equals(nature)){
				if (f.getID().equals(ID)) return true;
			}
		}
		
		return false;
		
	}
}
