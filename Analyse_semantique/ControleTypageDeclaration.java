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
		switch(fat.getFieldType()){
			case FieldVariable:
				
				String expected_type = fat.getType();
				
				//On calcule le type du second fils
				ExpressionArithmetique ea = new ExpressionArithmetique((CommonTree) node.getChild(node.getChildCount()-1));
				String found_type = ea.computeType(TDSs);
												
				if(!ExpressionArithmetique.checkTypes(TDSs, expected_type, found_type))
					throw new ErreurSemantique(node.getLine(), "Erreur de typage dans la d�claration de variable : '"+expected_type+"' attendu mais '"+found_type+"' trouv�");
				
				break;
			case FieldTableau:
				
				//On r�cup�re la d�finition du type du tableau
				FieldTypeDefTableau ftdt = (FieldTypeDefTableau) TDS.findIn(TDSs, node.getChild(1).getText(), FieldType.FieldTypeDefTableau);
				
				//On calcule le type d'initialisation attendu
				String type_init_expected = ftdt.getTypeElements();
								
				//On calcule le type de la taille du tableau
				ExpressionArithmetique ea_taille = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(0).getChild(0));
				String type_taille = ea_taille.computeType(TDSs);
				
				//On v�rifie que c'est bien un entier
				if(!ExpressionArithmetique.checkTypes(TDSs, type_taille, "int"))
					erreurs += "Erreur � la ligne "+node.getLine()+" : Erreur de typage dans la taille du tableau : int attendu mais '"+type_taille+"' trouv�\n";
				
				//On calcule le type d'initialisation
				ExpressionArithmetique ea_init = new ExpressionArithmetique((CommonTree) node.getChild(1).getChild(1).getChild(0));
				String type_init = ea_init.computeType(TDSs);
				
				//On v�rifie que c'est bien le type du tableau
				if(!ExpressionArithmetique.checkTypes(TDSs, type_init, type_init_expected)){
					erreurs+="Erreur � la ligne "+node.getLine()+" : Erreur de typage dans l'initialisation du tableau : '"+type_init_expected+"' attendu mais '"+type_init+"' trouv�\n";
				}
				
				if(!erreurs.equals(""))
					throw new ErreurSemantique(erreurs);
				
				break;
			case FieldStructure:
				
				CommonTree struct = (CommonTree) node.getChild(1);
				
				//on r�cup�re la d�finition du type de la structure
				FieldTypeDefStructure ftds = (FieldTypeDefStructure) TDS.findIn(TDSs, struct.getText(), FieldType.FieldTypeDefStructure);
				//On parcourt tous les champs d'initialisation
				for(int i=0; i<struct.getChildCount(); i++){
					
					//On r�cup�re le champ courant
					CommonTree champ = (CommonTree) struct.getChild(i);
					
					//On r�cup�re son type
					String type_champ = ftds.getChampType(champ.getText());

					//on calcule le type de l'expression du champ
					ExpressionArithmetique e_a = new ExpressionArithmetique((CommonTree) champ.getChild(0));
					
					try{
						String type_found = e_a.computeType(TDSs);
						
						if(!ExpressionArithmetique.checkTypes(TDSs, type_champ, type_found)){
							erreurs+="Erreur � la ligne "+node.getLine()+" : Erreur de typage dans le champ '"+champ.getText()+"' de la structure '"+node.getChild(0).getText()+"' : '"+type_champ+"' attendu mais '"+type_found+"' trouv�\n";
						}
					}catch(ErreurSemantique err){
						//L'erreur a d�j� �t� d�tect� ailleurs
					}
				}
								
				if(!erreurs.equals(""))
					throw new ErreurSemantique(erreurs);
				
				break;
		}
	}

}
