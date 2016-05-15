package analyse;
import java.util.ArrayList;

public class FieldStructure extends FieldAvecType{
	
	private ArrayList<Couple<String, String>> noms_champs_et_valeurs;

	public FieldStructure(String ID, int taille_du_saut, int taille, String type) {
		super(ID, taille_du_saut, taille, type);
		noms_champs_et_valeurs = new ArrayList<Couple<String, String>>();
	}
	
	public void addChamp(String name, String value){
		noms_champs_et_valeurs.add(new Couple<String, String>(name, value));
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldStructure;
	}
	
	@Override
	public String toString(){
		
		String ret = "champs={";
		
		for(Couple<String, String> c : noms_champs_et_valeurs){
			ret+=c.getLeft()+"="+c.getRight()+", ";
		}
		
		ret+="}";
		
		return super.toString()+", "+ret;
	}

}
