package analyse;

public class FieldTypeDefTableau extends FieldTypeDef{
	
	/**
	 * Type des objets du tableau.
	 */
	private String type;

	public FieldTypeDefTableau(String ID, int taille_du_saut, int taille, String type) {
		super(ID, taille_du_saut, taille);
		this.type=type;
	}
	
	public String getTypeElements(){
		return type;
	}

	@Override
	public FieldType getFieldType() {
		return FieldType.FieldTypeDefTableau;
	}
	
	public String toString(){
		return super.toString()+", type_des_éléments="+type;
	}

}
