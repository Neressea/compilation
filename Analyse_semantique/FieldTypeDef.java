


public class FieldTypeDef extends Field{
	
	private FieldType nature;

	public FieldTypeDef(String ID, int taille_du_saut, int taille, FieldType t) {
		super(ID, taille_du_saut, taille);
		nature=t;
	}

	@Override
	public FieldType getFieldType(){
		return FieldType.FieldType;
	}
}
