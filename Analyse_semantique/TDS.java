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
	
	@Override
	public String toString(){
		String ret  = "* n° bloc="+nb_bloc+", n° imbrication="+num_imbrication+" * \n";
		
		for(Field f : fields){
			ret+="| "+f+" |\n";
		}
		
		return ret;
	}
}
