package analyse;
import java.util.ArrayList;

/**
 * 
 * Reprï¿½sente la fonction principale qui doit-ï¿½tre implï¿½mentï¿½e par toute TDS.
 *
 */
public abstract class TDS {
	
	//Compteur du nombre de TDS dans le programme.
	public static int NB_BLOC = 0;
		
	//Numï¿½ro d'imbrication du bloc
	protected int num_imbrication;
	
	//Numï¿½ro du bloc (identifiant unique)
	protected int nb_bloc;
	
	protected ArrayList<Field> fields;
		
	public TDS(int num_imbr){
		nb_bloc = NB_BLOC;
		NB_BLOC++;
		fields = new ArrayList<Field>();
		num_imbrication=num_imbr;
	}
	
	public int getImbrication(){
		return num_imbrication;
	}
	
	public int getBloc(){
		return nb_bloc;
	}
	
	public ArrayList<Field> getFields(){
		return this.fields;
	}
	
	public Field existIn(String ID, FieldType fieldtype){
		for (Field field : this.fields){
			if(field.getFieldType().equals(fieldtype)){
				if(field.getID().equals(ID)) return field;
			}
		}
		return null;
	}
	
	public void add(Field f){
		fields.add(f);
	}
	
	
	public int getCurrentSize(){
		int size=0;
		
		for(Field f : fields){
			size+=f.getTaille();
		}
		
		return size;
	}
	
	/**
	 * Retrouve une définition dans la liste de TDS donnée.
	 * @param tds_list
	 * @param ID
	 * @param field_type Champs recherchés (variables, fonctions, ...). Plusieurs peuvent être recherchés
	 * @return Un objet Field ou null si aucune définition correspondante n'a été retrouvée
	 */
	public static Field findIn(ArrayList<TDS> tds_list, String ID, FieldType... field_type){
		Field f = null;
		for(TDS tds : tds_list){
			for (int i = 0; i < field_type.length; i++) {
				if((f=tds.existIn(ID, field_type[i]))!=null){
					return f;
				}
			}
		}
		return null;
	}
	
	/**
	 * Retrouve toutes les definitions d'un ID dans les TDS
	 * @param tds_list
	 * @param ID
	 * @param field_type
	 * @return Une ArrayList de Field pouvant etre de taille 0 si aucune correspondance
	 */
	public static ArrayList<Field> findAll(ArrayList<TDS> tds_list, String ID, FieldType... field_type) {
		ArrayList<Field> all = new ArrayList<Field>();
		for (TDS tds : tds_list) {
			for (int i=0 ; i< field_type.length; i++) {
				if ((tds.existIn(ID, field_type[i]))!=null) {
					all.add(tds.existIn(ID, field_type[i]));
				}
			}
		}
		return all;
	}
	
	/**
	 * Calcule le saut de la base de la pile jusqu'à la TDS contenant l'élément ID.
	 * @param tds_list
	 * @param ID
	 * @param field_type
	 * @return
	 */
	public static int findSautToTDS(ArrayList<TDS> tds_list, String ID, FieldType... field_type){
		int saut = 0; //Le tout premier mot de la pile n'est jamais utilisé
		Field f = null;
		
		for(int i=1; i<tds_list.size(); i++){
			TDS tds = tds_list.get(i);
			if(!(tds instanceof TDSFor))
				saut += 6; //On compte les 3@ à sauter
			for (int j = 0; j < field_type.length; j++) {
				if((f=tds.existIn(ID, field_type[j]))!=null){
					return saut; 
				}
			}
			saut+=tds.getCurrentSize();
		}
		
		return saut;
	}
	
	@Override
	public String toString(){
		String ret  = "* n° bloc="+nb_bloc+", n° imbrication="+num_imbrication+" * \n";
		
		for(Field f : fields){
			ret+="| "+f+" |\n";
		}
		
		return ret;
	}
}
