
public abstract class FieldAvecType extends Field{
	
	private String type;

	public FieldAvecType(String ID, int taille_du_saut, int taille, String type) {
		super(ID, taille_du_saut, taille);
		this.type=type;
	}
	
	public String getType(){
		return type;
	}
	
	public String toString(){
		return super.toString()+", type="+type;
	}

}
