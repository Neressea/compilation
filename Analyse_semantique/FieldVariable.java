public class FieldVariable extends Field{

	private String type;
	
	public FieldVariable(String ID, int taille_du_saut, int taille_min, String type) {
		super(ID, taille_du_saut, taille_min);
		this.type=type;
	}
	
	public String getType(){
		return this.type;
	}
	
	@Override
	public FieldTypeName getFieldType(){
		return FieldTypeName.FieldVariable;
	}

}
