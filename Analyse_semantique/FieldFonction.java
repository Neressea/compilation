import java.util.ArrayList;


public class FieldFonction extends Field{

	private String type;
	
	/**
	 * List<Couple<ID, type>>
	 * Associe les parametres d'une fonction a leur type ou 
	 * les champs d'une structure a leur type.
	 */
	private ArrayList<Couple<String, String>> params;
	
	public FieldFonction(String ID, int taille_du_saut, String type) {
		super(ID, taille_du_saut, -1);
		params = new ArrayList<Couple<String, String>>();
		this.type = type;
	}
	
	public void addParam(String name, String type){
		params.add(new Couple<String, String>(name, type));
	}
	
	public String getType(){
		return this.type;
	}
	
	public ArrayList<Couple<String, String>> getParams(){
		return this.params;
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldFonction;
	}
	
}
