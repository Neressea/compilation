package analyse;
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
	 * Taille minimale de l'�l�ment
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

	public int getTailleDuSaut() {
		return taille_du_saut;
	}

	public void setTailleDuSaut(int taille_du_saut) {
		this.taille_du_saut = taille_du_saut;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public abstract FieldType getFieldType();
	
	@Override
	public String toString(){
		return "cat�gorie="+this.getFieldType()+", id="+ID+", taille="+taille+", saut="+taille_du_saut;
	}
	
}
