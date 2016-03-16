


public class FieldStructure extends Field{

	public FieldStructure(String ID, int taille_du_saut, int taille_min) {
		super(ID, taille_du_saut, taille_min);
	}
	
	@Override
	public FieldTypeName getFieldType(){
		return FieldTypeName.FieldStructure;
	}

}
