import java.util.ArrayList;


public class FieldFonction extends FieldAvecType{
	
	/**
	 * List<Couple<ID, type>>
	 * Associe les parametres d'une fonction a leur type ou 
	 * les champs d'une structure a leur type.
	 */
	private ArrayList<Couple<String, String>> params;
	
	public FieldFonction(String ID, int taille_du_saut, String type) {
		super(ID, taille_du_saut, -1, type);
		params = new ArrayList<Couple<String, String>>();
	}
	
	public void addParam(String name, String type){
		params.add(new Couple<String, String>(name, type));
	}	
	
	public ArrayList<Couple<String, String>> getParams(){
		return this.params;
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldFonction;
	}
	
	@Override
	public String toString(){
		
		String ret = "params={";
		
		for(Couple<String, String> c : params){
			ret+=c.getLeft()+":"+c.getRight()+", ";
		}
		
		ret+="}";
		
		return super.toString()+", "+ret+", type=";
	}
	
}
