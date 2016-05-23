package analyse;


public abstract class FieldTypeDef extends Field{
	
	protected int taille_des_defs;
	
	public FieldTypeDef(String ID, int taille_du_saut, int taille, int taille_des_defs){
		super(ID, taille_du_saut, taille);
		this.taille_des_defs = taille_des_defs;
	}
	
	public int getTailleDesElems(){
		return taille_des_defs;
	}
}
