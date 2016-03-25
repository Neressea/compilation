


public class FieldTypeDef extends Field{

	public FieldTypeDef(String ID, int taille_du_saut, int taille_min) {
		super(ID, taille_du_saut, taille_min);
	}

	@Override
	public FieldType getFieldType(){
		return FieldType.FieldType;
	}
}
