


public class FieldTableau extends Field{

	private String type;
	
	/**
	 * Borne superieure des tableaux. Ceux-ci commencent par 0.
	 */
	private int borne_sup;
	
	public FieldTableau(String ID, int taille_du_saut, int taille_min) {
		super(ID, taille_du_saut, taille_min);
	}
	
	public String getType(){
		return this.type;
	}
	
	public int getBorneSup(){
		return this.borne_sup;
	}
	
	@Override
	public FieldTypeName getFieldType(){
		return FieldTypeName.FieldTableau;
	}
}
