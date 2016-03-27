import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Cette classe représente une expression arithmétique du programme.
 * Elle permet notamment de calculer le type d'une expression arithmétique.
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
	 */
	public String computeType(ArrayList<TDS> pile){
		return recursiveComputeType(pile, expr);
	}
	
	/**
	 * @param exp Expression à calculer
	 * @return
	 */
	private String recursiveComputeType(ArrayList<TDS> pile, CommonTree exp){
		
		String type = null;
		
		if(exp.getChildCount() > 1){
			//On récupère le type du fils gauche (récursivité)
			String left = recursiveComputeType(pile, (CommonTree) exp.getChild(0));
			
			//On récupère le type du fils droit (récursivité)
			String right = recursiveComputeType(pile, (CommonTree) exp.getChild(1));
			
			//On vérifie la compatibilité des deux types (qu'ils soient admissibles dans les calculs et correspondent)
			type = concatType(pile, left, right);
		}else{
			type = findUnitType(pile, exp);
		}

		//Si c'est bon, on renvoie le type commun. Sinon UNDEFINED.
		return type;
	}
	
	/**
	 * Vérifie la concordance entre deux types et que ceux-ci sont admissibles dans des calculs arithmétiques.
	 * Renvoie le type correspondant aux deux expressions ou UNDEFINED si elles ne sont pas compatibles
	 * @param type1
	 * @param type2
	 * @return Le type commun ou UNDEFINED
	 */
	private String concatType(ArrayList<TDS> pile, String type1, String type2){
		//On vérifie si l'un des deux types est undefined
		if(type1.equals("UNDEFINED") || type2.equals("UNDEFINED")) 
			return "UNDEFINED";
		
		//S'ils sont définis, on les récupère (si ce ne sont pas des int)
		FieldTypeDef typedef1 = null, typedef2 = null;
		if(!type1.equals("int"))
			typedef1 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		if(!type2.equals("int"))
			typedef2 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		//On récupère leurs types réel (si renommage)
		if(typedef1 != null)
			type1 = findRealType(pile, typedef1);
		
		if(typedef2 != null)
			type2 = findRealType(pile, typedef2);
		
		//On vérifie que les types réels sont bien des entiers, sinon l'expression est erronée
		if(type1.equals("int") && type2.equals("int")){
			return "int";
		}
		
		return "UNDEFINED";
	}
	
	/**
	 * Remonte les définitions de types pour donner le type réel de l'unité.
	 * @param pile
	 * @param typedef
	 * @return UNDEFINED ou le type réel
	 */
	private String findRealType(ArrayList<TDS> pile, FieldTypeDef typedef){
		//Si c'est une structure, on renvoie UNDEFINED
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure))
			return "UNDEFINED";
		
		//Si c'est un tableau, on renvoie UNDEFINED
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau))
			return "UNDEFINED";
		
		//Sinon on a un alias.
		FieldTypeDefSimple ftds = (FieldTypeDefSimple) typedef;
		
		//on récupère le type renommé
		String type = ftds.getTypeRenomme();
		
		//Si c'est "int" on le renvoi
		if(type.equals("int"))
			return "int";
		
		//Si c'est "string" on renvoi UNDEFINED
		if(type.equals("string"))
			return "UNDEFINED";
		
		//Sinon on a un nouveau typedef. On recherche sa définition.
		FieldTypeDef ftd = (FieldTypeDef) TDS.findIn(pile, type, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
	
		//Si le type n'est pas trouvé, on renvoie UNDEFINED
		if(ftd == null)
			return "UNDEFINED";
		
		//Sinon, on récure.
		return findRealType(pile, ftd);
	}
	
	/**
	 * Renvoie le type d'une unité
	 * @param pile
	 * @param type
	 * @return
	 */
	private String findUnitType(ArrayList<TDS> pile, CommonTree unit){
		
		String type=null;
		
		//On vérifie si l'unité est une constante
		if(!(type=tryConstante(unit.getText())).equals("UNDEFINED")) return type;
		
		//Sinon on recherche la définition de l'unité. On sait qu'il s'agit forcément d'une unité typée.
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);

		//Si aucune définition n'a été retrouvée, l'expression est indeterminée.
		if(var == null)
			return "UNDEFINED";
		
		//Si l'unité n'a pas de fils, c'est un type simple et on renvoie donc son type
		if(unit.getChildCount() == 0)
			return var.getType();
		
		//Si l'unité a des fils, alors c'est un type composite (tableau ou structure).
		return "UNDEFINED";//findUnitComposite(pile, unit);
	}
	
	/**
	 * Fonction recherchant le type du dernier champ accédé
	 * @param pile
	 * @param unit
	 * @return Le type trouvé ou null UNDEFINED si rien n'a été trouvé
	 */
	private String findUnitComposite(ArrayList<TDS> pile, CommonTree unit){
		String type = "UNDEFINED";
		
		//On récuère la définition de l'unité
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);
		
		//On récupère la définition du type de l'unité
		FieldTypeDef typedef = (FieldTypeDef) TDS.findIn(pile, var.getType(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
		
		//On regarde si l'unité a des fils
		if(unit.getChildCount() != 0){
			
			//On regarde si c'est un tableau ou une structure
			if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure)){
				
				//On regarde s'il accède à un champ existant dans la définition du type
				
				//Si le champ n'existe pas, on renvoie UNDEFINED
				
				//Si tout s'est bien passé, on récure
				findUnitComposite(pile, (CommonTree)unit.getChild(1));
				
			}else if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau)){
				
				//On récupère le type des éléments du tableau
				
				//On regarde s'il accède à un champ existant dans la définition du type
				
				//Si le champ n'existe pas, on renvoie UNDEFINED
				
			}
		
		//Si l'unité n'a pas de fils, on renvoie le type récupéré.
		}else{
			type = var.getType();
		}
		
		return type;
	}
	
	/**
	 * Cette fonction vérifie si l'unité est une constante
	 * @param unit Unité à vérifier
	 * @return "int" ou "string" si c'est une constante, null sinon
	 */
	private String tryConstante(String unit){
		
		//On regarde si c'est une chaine de caractère
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
