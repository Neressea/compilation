


public class FieldType extends Field{

	public FieldType(String ID, int taille_du_saut, int taille_min) {
		super(ID, taille_du_saut, taille_min);
	}

	@Override
	public FieldTypeName getFieldType(){
		return FieldTypeName.FieldType;
	}
}
