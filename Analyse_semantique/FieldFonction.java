import java.util.ArrayList;


public class FieldFonction extends Field{

	private String type;
	
	/**
	 * List<Couple<ID, type>>
	 * Associe les parametres d'une fonction a leur type ou 
	 * les champs d'une structure a leur type.
	 */
	private ArrayList<Couple<String, String>> params;
	
	public FieldFonction(String ID, int taille_du_saut, int taille_min, String type, ArrayList<Couple<String, String>> params) {
		super(ID, taille_du_saut, taille_min);
		this.type = type;
		this.params=params;
		
	}
	
	public String getType(){
		return this.type;
	}
	
	public ArrayList<Couple<String, String>> getParams(){
		return this.params;
	}
	
}
