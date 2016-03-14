import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Reprï¿½sente la fonction principale qui doit-ï¿½tre implï¿½mentï¿½e par toute TDS.
 *
 */
public class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	public static int NB_TDS = 0;
	
	public static int NB_IMBR = 0;
	
	public static TDS CURRENT_TDS = null;
	
	//Numï¿½ro d'imbrication du bloc
	private int nb_imbrication;
	
	//Numï¿½ro du bloc (identifiant unique)
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
	
	/**
	 * Met à jour le curseur sur le bloc parent du bloc courant.
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
	
	public TDS createParent(ArrayList<TDS> list){
		TDS new_tds = new TDS();
		
		list.add(new_tds);
		NB_IMBR++;
		CURRENT_TDS = new_tds;
		
		return new_tds;
	}
	
	public boolean existIn(String ID, String nature){
		
		for (Field f : this.fields){
			if (f.getNature().equals(nature)){
				if (f.getID().equals(ID)) return true;
			}
		}
		
		return false;
		
	}
	
	static void addTDSVar(CommonTree node){
		Field newField = new Field(node.getChild(0).getText(), "Variable", null, null, 0, 0, 0);
	}
	
	static void addTDSType(CommonTree node){
		for (int i = 0; i < node.getChildCount() ; i++){
			if (node.getChild(i).getText().equals("TYPE")){
				
			}
		}
		
		Field newField = new Field(node.getChild(0).getText(), "Variable", null, null, 0, 0, 0);
	}
	
	static void addTDSFunction(CommonTree node){
		
	}
	
	
}
