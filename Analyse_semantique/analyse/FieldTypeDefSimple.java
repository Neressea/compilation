package analyse;

public class FieldTypeDefSimple extends FieldTypeDef{
	
	/**
	 * Type renomm� par le type d�fini
	 */
	private String type;

	public FieldTypeDefSimple(String ID, int taille_du_saut, int taille, String type) {
		super(ID, taille_du_saut, taille, 0);
		this.type=type;
	}
	
	public String getTypeRenomme(){
		return type;
	}

	@Override
	public FieldType getFieldType() {
		return FieldType.FieldTypeDefSimple;
	}
	
	public String toString(){
		return super.toString()+", type_redefini="+type;
	}

}
