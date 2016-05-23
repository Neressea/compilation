package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleTypageDeclaration extends ControleSemantique{

	public ControleTypageDeclaration(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		FieldAvecType fat = (FieldAvecType) TDS.findIn(TDSs, node.getChild(0).getText(), FieldType.FieldVariable, FieldType.FieldStructure, FieldType.FieldTableau);
		String erreurs = "";
		
		if(fat==null) return;
		
		switch(fat.getFieldType()){
			case FieldVariable:
				
				String expected_type = fat.getType();
				
				//On calcule le type du second fils
				Expression ea = new Expression((CommonTree) node.getChild(node.getChildCount()-1));
				String found_type = ea.computeType(TDSs);
												
				if(!Expression.checkTypes(TDSs, expected_type, found_type))
					throw new ErreurSemantique(node.getLine(), "Erreur de typage dans la déclaration de variable : '"+expected_type+"' attendu mais '"+found_type+"' trouvé");
				
				break;
			case FieldTableau:
				
				//On récupère la définition du type du tableau
				FieldTypeDefTableau ftdt = (FieldTypeDefTableau) TDS.findIn(TDSs, node.getChild(1).getText(), FieldType.FieldTypeDefTableau);
				
				if(ftdt == null) return;
				
				//On calcule le type d'initialisation attendu
				String type_init_expected = ftdt.getTypeElements();
								
				//On calcule le type de la taille du tableau
				Expression ea_taille = new Expression((CommonTree) node.getChild(1).getChild(0).getChild(0));
				String type_taille = ea_taille.computeType(TDSs);
				
				//On vérifie que c'est bien un entier
				if(!Expression.checkTypes(TDSs, type_taille, "int"))
					erreurs += "Erreur à la ligne "+node.getLine()+" : Erreur de typage dans la taille du tableau : int attendu mais '"+type_taille+"' trouvé\n";
				
				//On calcule le type d'initialisation
				Expression ea_init = new Expression((CommonTree) node.getChild(1).getChild(1).getChild(0));
				String type_init = ea_init.computeType(TDSs);
				
				//On vérifie que c'est bien le type du tableau
				if(!Expression.checkTypes(TDSs, type_init, type_init_expected)){
					erreurs+="Erreur à la ligne "+node.getLine()+" : Erreur de typage dans l'initialisation du tableau : '"+type_init_expected+"' attendu mais '"+type_init+"' trouvé\n";
				}
				
				if(!erreurs.equals(""))
					throw new ErreurSemantique(erreurs);
				
				break;
			case FieldStructure:
				
				CommonTree struct = (CommonTree) node.getChild(1);
				ArrayList<String> deja_renseignes = new ArrayList<String>();
				
				//on récupère la définition du type de la structure
				FieldTypeDefStructure ftds = (FieldTypeDefStructure) TDS.findIn(TDSs, struct.getText(), FieldType.FieldTypeDefStructure);
				
				//On parcourt tous les champs d'initialisation
				for(int i=0; i<struct.getChildCount(); i++){
					
					//On récupère le champ courant
					CommonTree champ = (CommonTree) struct.getChild(i);
					
					//On récupère le type attendu
					String type_champ = ftds.getChampType(champ.getText());
					int num_champ = ftds.getChampNum(champ.getText());

					//on calcule le type de l'expression du champ
					Expression e_a = new Expression((CommonTree) champ.getChild(0));
					
					try{
						String type_found = e_a.computeType(TDSs);
						
						//On vérifie que les chammps concordent
						if(!Expression.checkTypes(TDSs, type_champ, type_found)){
							//On vérifie qu'on accède à un champ existant
							if(!type_champ.equals("UNDEFINED"))
								erreurs+="Erreur à la ligne "+node.getLine()+" : Erreur de typage dans le champ '"+champ.getText()+"' de la structure '"+node.getChild(0).getText()+"' : '"+type_champ+"' attendu mais '"+type_found+"' trouvé\n";
							else
								erreurs+="Erreur à la ligne "+node.getLine()+" : Accès au champ inexistant '"+champ.getText()+"' de la structure '"+node.getChild(0).getText()+"'\n";
						}else{
							//On vérifie que le champ est renseigné au bon emplacement
							if(i != num_champ){
								erreurs+="Erreur à la ligne "+node.getLine()+" : L'ordre des champs n'est pas respecté : '"+champ.getText()+"' de la structure '"+node.getChild(0).getText()+"' en position "+(i+1)+" au lieu de la position "+(num_champ+1)+" \n";
							}
						}

						if(deja_renseignes.contains(champ.getText())){
							erreurs+="Erreur à la ligne "+node.getLine()+" : Accès multiple au champ '"+champ.getText()+"' de la structure '"+node.getChild(0).getText()+"'\n";
						}else{
							deja_renseignes.add(champ.getText());
						}
					
					}catch(ErreurSemantique err){
						//L'erreur a déjà été détecté ailleurs
					}
				}
				
				//Maintenant, on vérifie que tous les champs ont bien été renseignés
				ArrayList<String> champs_a_renseigner = new ArrayList<String>();
				for(Couple<String, String> c : ftds.getNomsChampsEtTypes())
					champs_a_renseigner.add(c.getLeft());
				
				String champs_non_renseignes = "";
				
				//On calcule la difference entre les deux
				for (int i = 0; i < champs_a_renseigner.size(); i++) {
					if(!deja_renseignes.contains(champs_a_renseigner.get(i)))
						champs_non_renseignes+=champs_a_renseigner.get(i)+" ";
				}
				
				if(!champs_non_renseignes.equals("")){
					erreurs+="Erreur à la ligne "+node.getLine()+" : Tous les champs n'ont pas ete renseignes dans la structure '"+node.getChild(0).getText()+"' : "+champs_non_renseignes+" manquant(s)\n";
				}
								
				if(!erreurs.equals(""))
					throw new ErreurSemantique(erreurs);
				
				break;
		}
	}

}
