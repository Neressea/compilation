package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class FieldStructure extends FieldAvecType{
	
	private ArrayList<Couple<String, CommonTree>> noms_champs_et_valeurs;

	public FieldStructure(String ID, int taille_du_saut, int taille, String type) {
		super(ID, taille_du_saut, taille, type);
		noms_champs_et_valeurs = new ArrayList<Couple<String, CommonTree>>();
	}
	
	public void addChamp(String name, CommonTree value){
		noms_champs_et_valeurs.add(new Couple<String, CommonTree>(name, value));
	}
	
	@Override
	public FieldType getFieldType(){
		return FieldType.FieldStructure;
	}
	
	public ArrayList<Couple<String, CommonTree>> getFieldsAndValues(){
		return noms_champs_et_valeurs;
	}
	
	@Override
	public String toString(){
		
		String ret = "champs={";
		
		for(Couple<String, CommonTree> c : noms_champs_et_valeurs){
			ret+=c.getLeft()+"="+c.getRight()+", ";
		}
		
		ret+="}";
		
		return super.toString()+", "+ret;
	}

}
