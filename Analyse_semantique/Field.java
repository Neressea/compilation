import java.util.ArrayList;

public abstract class Field {
	
	//Nom du champ dans le code source
	protected String ID;
		
	/**
	 * Saut a faire depuis la base de l'environnement de la pile pour arriver 
	 * a l'element.
	 */
	protected int taille_du_saut;
	
	/**
	 * Taille minimale de l'élément
	 */
	protected int taille;
	
	public Field(String ID, int taille_du_saut, int taille){
		this.ID=ID;
		this.taille_du_saut=taille_du_saut;
		this.taille=taille;
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

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public abstract FieldType getFieldType();
	
}
