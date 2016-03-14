import java.util.ArrayList;

/**
 * 
 * Repr�sente la fonction principale qui doit-�tre impl�ment�e par toute TDS.
 *
 */
public abstract class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	public static int NB_TDS = 0;
	
	public static int NB_IMBR = 0;
	
	public static TDS CURRENT_TDS = null;
	
	//Num�ro d'imbrication du bloc
	protected int nb_imbrication;
	
	//Num�ro du bloc (identifiant unique)
	protected int nb_bloc;
	
	protected ArrayList<Field> fields;
	
	protected ArrayList<TDS> TDSs;
	
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
	
	/**
	 * Met a jour le curseur sur le bloc parent du bloc courant.
	 * @return
	 */
	public TDS sgetParent(ArrayList<TDS> list){
		TDS current;
		for (int i = list.size()-1; i >=0 ; i--) {
			current = list.get(i);
			if(current.getImbrication() == TDS.NB_IMBR-1){
				TDS.CURRENT_TDS = current;
				TDS.NB_IMBR--;
				return TDS.CURRENT_TDS;
			}
		}
		return null;
	}
	
	/*
	
	public TDS createParent(ArrayList<TDS> list){
		TDS new_tds = new TDS();
		
		list.add(new_tds);
		NB_IMBR++;
		CURRENT_TDS = new_tds;
		
		return new_tds;
	}
	
	*/
	
	

	
	
}
