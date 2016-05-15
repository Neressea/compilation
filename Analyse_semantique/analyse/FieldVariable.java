package analyse;
public class FieldVariable extends FieldAvecType{
	
	public FieldVariable(String ID, int taille_du_saut, int taille_min, String type) {
		super(ID, taille_du_saut, taille_min, type);
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldVariable;
	}
	
	@Override
	public String toString(){
		
		return super.toString();
	}
	
}
