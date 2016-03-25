


public class FieldTableau extends Field{

	private String type;
	
	/**
	 * Borne superieure des tableaux. Ceux-ci commencent par 0.
	 */
	private int borne_sup;
	
	/**
	 * Adresse o� commencent les �l�ments du tableau.
	 * Champ qui sera calcul� lors de la g��nration de code.
	 */
	private int adresse_virtuelle;
	
	/**
	 * Taille d'un �l�ment du tableau.
	 */
	private int taille_element;
		
	public FieldTableau(String ID, int taille_du_saut, int taille, String type, int taille_element, int borne_sup) {
		super(ID, taille_du_saut, taille);
		this.borne_sup=borne_sup;
		this.type=type;
	}
	
	public String getType(){
		return this.type;
	}
	
	public int getBorneSup(){
		return this.borne_sup;
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldTableau;
	}
}
