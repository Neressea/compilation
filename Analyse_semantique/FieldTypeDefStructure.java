import java.util.ArrayList;


public class FieldTypeDefStructure extends FieldTypeDef{
	
	private ArrayList<Couple<String, String>> noms_champs_et_types;

	public FieldTypeDefStructure(String ID, int taille_du_saut, int taille) {
		super(ID, taille_du_saut, taille);
		noms_champs_et_types = new ArrayList<Couple<String, String>>();
	}
	
	public void addChampType(String name, String type){
		noms_champs_et_types.add(new Couple<String, String>(name, type));
	}
	
	/**
	 * Cherche un champ et renvoie son type.
	 * @param name Nom du champ
	 * @return type du champ ou UNDEFINED si non trouvé.
	 */
	public String getChampType(String name){
		
		for(Couple<String, String> c : noms_champs_et_types){
			if(c.getLeft().equals(name))
				return c.getRight();
		}
		
		return "UNDEFINED";
	}

	@Override
	public FieldType getFieldType() {
		return FieldType.FieldTypeDefStructure;
	}
	
	public String toString(){
		
		String ret = "champs={";
		
		for(Couple<String, String> c : noms_champs_et_types){
			ret+=c.getLeft()+":"+c.getRight()+", ";
		}
		
		ret+="}";
		
		return super.toString()+", "+ret;
	}

}
