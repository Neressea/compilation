import java.util.ArrayList;

public abstract class Field {
	
	public enum FieldTypeName {FieldFonction, FieldStructure, FieldTableau, FieldType, FieldVariable};
	
	//Nom du champ dans le code source
	protected String ID;
		
	/**
	 * Saut a faire depuis la base de l'environnement de la pile pour arriver 
	 * a l'element.
	 */
	protected int taille_du_saut;
	
	/**
	 * Taille minimale de l'�l�ment
	 */
	protected int taille_min;
	
	public Field(String ID, int taille_du_saut, int taille_min){
		this.ID=ID;
		this.taille_du_saut=taille_du_saut;
		this.taille_min=taille_min;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
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
	
	public abstract FieldTypeName getFieldType();
	
}
