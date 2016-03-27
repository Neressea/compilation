import org.antlr.runtime.tree.CommonTree;

public class FieldTableau extends FieldAvecType{
	
	/**
	 * Borne superieure des tableaux. Ceux-ci commencent par 0.
	 */
	private CommonTree borne_sup;
	
	/**
	 * Adresse où commencent les éléments du tableau.
	 * Champ qui sera calculé lors de la géénration de code.
	 */
	private int adresse_virtuelle;
	
	/**
	 * Taille d'un élément du tableau.
	 */
	private int taille_element;
		
	public FieldTableau(String ID, int taille_du_saut, int taille, String type, CommonTree borne_sup) {
		super(ID, taille_du_saut, taille, type);
		this.borne_sup=borne_sup;
	}
	
	public CommonTree getBorneSup(){
		return this.borne_sup;
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldTableau;
	}
	
	@Override
	public String toString(){
		
		String ret = "borne sup="+borne_sup.getText()+", ";
		
		return super.toString()+", "+ret;
	}
}
