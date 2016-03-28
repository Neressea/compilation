import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Cette classe repr�sente une expression arithm�tique du programme.
 * Elle permet notamment de calculer le type d'une expression arithm�tique.
 * Cette classe ne correspond pas aux affectations.
 *
 */

public class ExpressionArithmetique {
	private CommonTree expr;
	
	public ExpressionArithmetique(CommonTree exp){
		expr=exp;
	}
	
	/**
	 * Calcule le type de l'expression
	 * @param pile Pile des environnements ouverts
	 * @return Le type de l'expression ou UNDEFINED si l'expression est incorrecte.
	 * @throws ErreurSemantique 
	 */
	public String computeType(ArrayList<TDS> pile) throws ErreurSemantique{
		return recursiveComputeType(pile, expr);
	}
	
	/**
	 * V�rifie que deux types soient �quivalents
	 * @param type1
	 * @param type2
	 * @return
	 */
	public static boolean checkTypes(ArrayList<TDS> pile, String type1, String type2){
		//On v�rifie si l'un des deux types est undefined
		if(type1.equals("UNDEFINED") || type2.equals("UNDEFINED")) 
			return false;
		
		//S'ils sont d�finis, on les r�cup�re (si ce ne sont pas des int)
		FieldTypeDef typedef1 = null, typedef2 = null;
		
		if(!type1.equals("int"))
			typedef1 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		if(!type2.equals("int")){
			typedef2 = (FieldTypeDef) TDS.findIn(pile, type2, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		}
		//On r�cup�re leurs types r�el (si renommage)
		if(typedef1 != null)
			type1 = findRealType(pile, typedef1);
		
		if(typedef2 != null)
			type2 = findRealType(pile, typedef2);
		
		//On v�rifie que les types r�els sont bien des entiers, sinon l'expression est erron�e
		if(type1.equals(type2)){
			return true;
		}

		return false;
	}
	
	/**
	 * @param exp Expression � calculer
	 * @return
	 * @throws ErreurSemantique 
	 */
	private String recursiveComputeType(ArrayList<TDS> pile, CommonTree exp) throws ErreurSemantique{
		
		String type = null;
		String left = null;
		String right = null;
		
		ArrayList<String> ops = new ArrayList<String>(Arrays.asList(new String[]{"+", "-", "/", "*", "NEG"}));
		
		//Si le noeud est un - unaire, on le skippe
		if(exp.getText().equals("NEG") && exp.getChildCount() == 1){
			return recursiveComputeType(pile, (CommonTree) exp.getChild(0));
		}
		
		//Si le noeud n'est pas une expression arithm�tique (ie une variable), on renvoie cash son type
		if(!ops.contains(exp.getText())){
			String t  =findUnitType(pile, exp);
			return t;
		}
		
		//Si le fils est un op�rateur, ce n'est pas une unit�
		if(ops.contains(exp.getChild(0).getText())){
			//On r�cup�re le type du fils gauche (r�cursivit�)
			left = recursiveComputeType(pile, (CommonTree) exp.getChild(0));
		}else{
			left = findUnitType(pile, (CommonTree) exp.getChild(0));
		}
				
		//Si le fils est un op�rateur, ce n'est pas une unit�
		if(ops.contains(exp.getChild(1).getText())){
			//On r�cup�re le type du fils gauche (r�cursivit�)
			right = recursiveComputeType(pile, (CommonTree) exp.getChild(1));
		}else{
			right = findUnitType(pile, (CommonTree) exp.getChild(1));
		}
				
		//On v�rifie la compatibilit� des deux types (qu'ils soient admissibles dans les calculs et correspondent)
		type = concatType(pile, left, right);
						
		//Si c'est bon, on renvoie le type commun. Sinon UNDEFINED.
		return type;
	}
	
	/**
	 * V�rifie la concordance entre deux types et que ceux-ci sont admissibles dans des calculs arithm�tiques.
	 * Renvoie le type correspondant aux deux expressions ou UNDEFINED si elles ne sont pas compatibles
	 * @param type1
	 * @param type2
	 * @return Le type commun ou UNDEFINED
	 */
	private String concatType(ArrayList<TDS> pile, String type1, String type2){
		//On v�rifie si l'un des deux types est undefined
		if(type1.equals("UNDEFINED") || type2.equals("UNDEFINED")) 
			return "UNDEFINED";
		
		//S'ils sont d�finis, on les r�cup�re (si ce ne sont pas des int)
		FieldTypeDef typedef1 = null, typedef2 = null;
		
		if(!type1.equals("int"))
			typedef1 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		if(!type2.equals("int")){
			typedef2 = (FieldTypeDef) TDS.findIn(pile, type2, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		}
		//On r�cup�re leurs types r�el (si renommage)
		if(typedef1 != null)
			type1 = findRealType(pile, typedef1);
		
		if(typedef2 != null)
			type2 = findRealType(pile, typedef2);
		
		//On v�rifie que les types r�els sont bien des entiers, sinon l'expression est erron�e
		if(type1.equals("int") && type2.equals("int")){
			return "int";
		}

		return "UNDEFINED";
	}
	
	/**
	 * Remonte les d�finitions de types pour donner le type r�el de l'unit�.
	 * @param pile
	 * @param typedef
	 * @return UNDEFINED ou le type r�el
	 */
	private static String findRealType(ArrayList<TDS> pile, FieldTypeDef typedef){
		//Si c'est une structure, on renvoie UNDEFINED
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure))
			return "UNDEFINED";
		
		//Si c'est un tableau, on renvoie UNDEFINED
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau))
			return "UNDEFINED";
		
		//Sinon on a un alias.
		FieldTypeDefSimple ftds = (FieldTypeDefSimple) typedef;
		
		//on r�cup�re le type renomm�
		String type = ftds.getTypeRenomme();
		
		//Si c'est "int" on le renvoi
		if(type.equals("int"))
			return "int";
		
		//Si c'est "string" on renvoi UNDEFINED
		if(type.equals("string"))
			return "UNDEFINED";
		
		//Sinon on a un nouveau typedef. On recherche sa d�finition.
		FieldTypeDef ftd = (FieldTypeDef) TDS.findIn(pile, type, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
	
		//Si le type n'est pas trouv�, on renvoie UNDEFINED
		if(ftd == null)
			return "UNDEFINED";
		
		//Sinon, on r�cure.
		return findRealType(pile, ftd);
	}
	
	/**
	 * Renvoie le type d'une unit�
	 * @param pile
	 * @param type
	 * @return
	 * @throws ErreurSemantique 
	 */
	private String findUnitType(ArrayList<TDS> pile, CommonTree unit) throws ErreurSemantique{
		
		String type=null;
		//On v�rifie si l'unit� est une constante
		if(!(type=tryConstante(unit.getText())).equals("UNDEFINED")) return type;
		
		//Sinon on recherche la d�finition de l'unit�. On sait qu'il s'agit forc�ment d'une unit� typ�e.
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);
		
		//Si aucune d�finition n'a �t� retrouv�e, l'expression est indetermin�e.
		if(var == null)
			throw new ErreurSemantique(unit.getLine(), "Variable non-déclarée : "+unit.getText());
		
		//Si l'unit� n'a pas de fils, c'est un type simple et on renvoie donc son type
		if(unit.getChildCount() == 0)
			return var.getType();
				
		//Si l'unit� a des fils, alors c'est un type composite (tableau ou structure).
		return findUnitComposite(pile, unit);
	}
	
	/**
	 * Fonction recherchant le type du dernier champ acc�d�
	 * @param pile
	 * @param unit
	 * @return Le type trouv� ou null UNDEFINED si rien n'a �t� trouv�
	 */
	private String findUnitComposite(ArrayList<TDS> pile, CommonTree unit){
		String type = "UNDEFINED";
		
		//On r�cu�re la d�finition de l'unit�
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);
		
		//On r�cup�re la d�finition du type de l'unit�
		FieldTypeDef typedef = (FieldTypeDef) TDS.findIn(pile, var.getType(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
		
		//On regarde si l'unit� a des fils
		if(unit.getChildCount() != 0){
			
			//On regarde si c'est un tableau ou une structure
			if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure)){
				
				//On regarde s'il acc�de � un champ existant dans la d�finition du type (on saute le noeud FIELD)
				String type_struct = ((FieldTypeDefStructure)typedef).getChampType(unit.getChild(0).getChild(0).getText());
				
				//Si le champ n'existe pas, on renvoie UNDEFINED
				if(type_struct.equals("UNDEFINED")) return type_struct;
				
				//On regarde s'il a un fr�re (acc�s � struct ou tab)
				CommonTree cursor = unit;
				
				while(cursor.getChildCount() > 1){
					
					
				}
				
			}else if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau)){
				
				//On r�cup�re le type des �l�ments du tableau
				String type_tab = ((FieldTypeDefTableau)typedef).getTypeElements();
				
				//On regarde le nombre de fils. S'il n'y en a qu'un, il n'y a qu'un simple acc�s � une case et on renvoie le type du tableau
				if(unit.getChildCount() == 1){
					type = type_tab;
				}
				
				//S'il n'y a pas de fils, alors UNDEFINED. On ne peut pas utiliser un tableau entier dans un calcul
				if(unit.getChildCount() == 0){
					type = "UNDEFINED";
				}
				
				//S'il y a plus de fils, on a deux cas : tous sont des tableaux, ou alors le dernier est uen structure
				if(unit.getChildCount() > 1){
					//On r�cup�re la d�finition du type des �l�ments du tableau
					FieldTypeDef typedef_elem = (FieldTypeDef) TDS.findIn(pile, type_tab, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
					
					//On parcourt les fils de 0 � n-2 (le dernier est un cas particulier)
					for (int i = 0; i < unit.getChildCount()-2; i++) {
						//Si le type n'a pas �t� trouv�, on renvoie UNDEF
						if(typedef_elem == null)
							type= "UNDEFINED";
						
						//On v�rifie que c'est bien une d�finition de tableau. Sinon, on ne pourrait pas y acc�der par []
						if(!typedef_elem.getFieldType().equals(FieldType.FieldTypeDefTableau))
							type= "UNDEFINED";
						
						//Maintenant, on va v�rifier la m�me chose pour le type des �l�ments du tableau suivant.
						typedef_elem = (FieldTypeDef) TDS.findIn(pile, ((FieldTypeDefTableau)typedef_elem).getTypeElements(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
					}
					
					//Pour le dernier fils, si celui-ci est un tableau, on renvoi son type.
					if(typedef_elem.getFieldType().equals(FieldType.FieldTypeDefTableau))
						type = ((FieldTypeDefTableau)typedef_elem).getTypeElements();
					
					//Si le dernier fils est une structure
				}
			}
		
		//Si l'unit� n'a pas de fils, on renvoie le type r�cup�r�.
		}else{
			type = var.getType();
		}
		
		return type;
	}
	
	/**
	 * Cette fonction v�rifie si l'unit� est une constante
	 * @param unit Unit� � v�rifier
	 * @return "int" ou "string" si c'est une constante, null sinon
	 */
	private String tryConstante(String unit){
		
		//On regarde si c'est une chaine de caract�re
		if(unit.matches("\".*\""))
			return "string";
		
		//Sinon on regarde si c'est un entier
		try{
			Integer.parseInt(unit);
			//S'il n'y a pas eu d'erreur lors du cast, alors c'est un entier
			return "int";
		}catch(Exception e){
			//S'il y a eu une erreur lors du cast, ce n'est pas un entier. On ne fait rien
		}
		
		return "UNDEFINED";
	}
}
