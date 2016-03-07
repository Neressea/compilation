import java.util.ArrayList;

public class Field {
	
	//Nom du champ dans le code source
	private String ID;
	
	//Nature du champ (tab, var, struct, fonction, type défini)
	private String nature;
	
	//Type du champ (int, string, ...) => type d'une variable ou type de retour pour une fonction.
	private String type;
	
	/**
	 * List<Couple<ID, type>>
	 * Associe les paramètres d'une fonction à leur type ou 
	 * les champs d'une structure à leur type.
	 */
	private ArrayList<Couple<String, String>> params;
	
	/**
	 * Borne supérieure des tableaux. Ceux-ci commencent à 0.
	 */
	private int borne_sup;
	
	/**
	 * Saut à faire depuis la base de l'environnement de la pile pour arriver 
	 * à l'élément.
	 */
	private int taille_du_saut;
	
	/**
	 * Taille minimale de l'élément
	 */
	private int taille_min;

	public String getID() {
		return ID;
	}

	public Field(String iD, String nature, String type, ArrayList<Couple<String, String>> params, int borne_sup, int taille_du_saut, int taille_min) {
		ID = iD;
		this.nature = nature;
		this.type = type;
		this.params = params;
		this.borne_sup = borne_sup;
		this.taille_du_saut = taille_du_saut;
		this.taille_min = taille_min;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Couple<String, String>> getParams() {
		return params;
	}

	public void setParams(ArrayList<Couple<String, String>> params) {
		this.params = params;
	}

	public int getBorne_sup() {
		return borne_sup;
	}

	public void setBorne_sup(int borne_sup) {
		this.borne_sup = borne_sup;
	}

	public int getTaille_du_saut() {
		return taille_du_saut;
	}

	public void setTaille_du_saut(int taille_du_saut) {
		this.taille_du_saut = taille_du_saut;
	}

	public int getTaille_min() {
		return taille_min;
	}

	public void setTaille_min(int taille_min) {
		this.taille_min = taille_min;
	}
}
