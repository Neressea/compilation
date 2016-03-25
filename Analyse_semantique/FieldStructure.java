import java.util.ArrayList;

public class FieldStructure extends Field{
	
	private ArrayList<Couple<String, String>> noms_champs_et_types;

	public FieldStructure(String ID, int taille_du_saut, int taille) {
		super(ID, taille_du_saut, taille);
		noms_champs_et_types = new ArrayList<Couple<String, String>>();
	}
	
	public void addChamp(String name, String type){
		noms_champs_et_types.add(new Couple<String, String>(name, type));
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldStructure;
	}

}
