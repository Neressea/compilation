import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Cette classe reprï¿½sente une expression arithmï¿½tique du programme.
 * Elle permet notamment de calculer le type d'une expression arithmï¿½tique.
 * Cette classe ne correspond pas aux affectations.
 *
 */

public class Expression {
	private CommonTree expr;
	
	public Expression(CommonTree exp){
		expr=exp;
	}
	
	/**
	 * Vï¿½rifie que deux types soient ï¿½quivalents
	 * @param type1
	 * @param type2
	 * @return
	 */
	public static boolean checkTypes(ArrayList<TDS> pile, String type1, String type2){
		//On vï¿½rifie si l'un des deux types est undefined
		if(type1.equals("UNDEFINED") || type2.equals("UNDEFINED")) 
			return false;
		
		//S'ils sont dï¿½finis, on les rï¿½cupï¿½re (si ce ne sont pas des int)
		FieldTypeDef typedef1 = null, typedef2 = null;
		
		if(!type1.equals("int")&&!type1.equals("string"))
			typedef1 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		if(!type2.equals("int")&&!type2.equals("string")){
			typedef2 = (FieldTypeDef) TDS.findIn(pile, type2, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		}
		//On rï¿½cupï¿½re leurs types rï¿½el (si renommage)
		if(typedef1 != null)
			type1 = findRealType(pile, typedef1);
		
		if(typedef2 != null)
			type2 = findRealType(pile, typedef2);
		
		//On vï¿½rifie que les types rï¿½els sont bien des entiers, sinon l'expression est erronï¿½e
		if(type1.equals(type2) && !type1.equals("UNDEFINED")){
			return true;
		}

		return false;
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
	 * @param exp Expression ï¿½ calculer
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
		
		//Si le noeud n'est pas une expression arithmï¿½tique (ie une variable), on renvoie cash son type
		if(!ops.contains(exp.getText())){
			String t = findUnitType(pile, exp);
			return t;
		}
		
		//Si le fils est un operateur, ce n'est pas une unitï¿½
		if(ops.contains(exp.getChild(0).getText())){
			//On rï¿½cupï¿½re le type du fils gauche (rï¿½cursivitï¿½)
			left = recursiveComputeType(pile, (CommonTree) exp.getChild(0));
		}else{
			left = findUnitType(pile, (CommonTree) exp.getChild(0));
		}
				
		//Si le fils est un opï¿½rateur, ce n'est pas une unitï¿½
		if(ops.contains(exp.getChild(1).getText())){
			//On rï¿½cupï¿½re le type du fils gauche (rï¿½cursivitï¿½)
			right = recursiveComputeType(pile, (CommonTree) exp.getChild(1));
		}else{
			right = findUnitType(pile, (CommonTree) exp.getChild(1));
		}
				
		//On vï¿½rifie la compatibilitï¿½ des deux types (qu'ils soient admissibles dans les calculs et correspondent)
		type = concatType(pile, left, right);
						
		//Si c'est bon, on renvoie le type commun. Sinon UNDEFINED.
		return type;
	}
	
	/**
	 * Vï¿½rifie la concordance entre deux types et que ceux-ci sont admissibles dans des calculs arithmï¿½tiques.
	 * Renvoie le type correspondant aux deux expressions ou UNDEFINED si elles ne sont pas compatibles
	 * @param type1
	 * @param type2
	 * @return Le type commun ou UNDEFINED
	 */
	private String concatType(ArrayList<TDS> pile, String type1, String type2){
		//On vï¿½rifie si l'un des deux types est undefined
		if(type1.equals("UNDEFINED") || type2.equals("UNDEFINED")) 
			return "UNDEFINED";
		
		//S'ils sont dï¿½finis, on les rï¿½cupï¿½re (si ce ne sont pas des int)
		FieldTypeDef typedef1 = null, typedef2 = null;
		
		if(!type1.equals("int") && !type1.equals("string"))
			typedef1 = (FieldTypeDef) TDS.findIn(pile, type1, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		
		if(!type2.equals("int") && !type2.equals("string")){
			typedef2 = (FieldTypeDef) TDS.findIn(pile, type2, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
		}
		//On rï¿½cupï¿½re leurs types rï¿½el (si renommage)
		if(typedef1 != null)
			type1 = findRealType(pile, typedef1);
		
		if(typedef2 != null)
			type2 = findRealType(pile, typedef2);
		
		//On vï¿½rifie que les types rï¿½els sont bien des entiers, sinon l'expression est erronï¿½e
		if(type1.equals(type2) && !type1.equals("UNDEFINED")){
			return type1;
		}

		return "UNDEFINED";
	}
	
	/**
	 * Remonte les dï¿½finitions de types pour donner le type rï¿½el de l'unitï¿½.
	 * @param pile
	 * @param typedef
	 * @return UNDEFINED ou le type rï¿½el
	 */
	private static String findRealType(ArrayList<TDS> pile, FieldTypeDef typedef){
		
		//Si c'est une structure, on renvoie le type(affectation de structure)
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure))
			return typedef.getID();
		
		//Si c'est un tableau, on renvoie le type (affectation de tableau)
		if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau))
			return typedef.getID();
		
		//Sinon on a un alias.
		FieldTypeDefSimple ftds = (FieldTypeDefSimple) typedef;
		
		//on rï¿½cupï¿½re le type renommï¿½
		String type = ftds.getTypeRenomme();
		
		//Si c'est "int" on le renvoi
		if(type.equals("int"))
			return "int";
		
		//Si c'est "string" on renvoi UNDEFINED
		if(type.equals("string"))
			return "string";
		
		//Sinon on a un nouveau typedef. On recherche sa dï¿½finition.
		FieldTypeDef ftd = (FieldTypeDef) TDS.findIn(pile, type, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
	
		//Si le type n'est pas trouvï¿½, on renvoie UNDEFINED
		if(ftd == null)
			return "UNDEFINED";
		
		//Sinon, on rï¿½cure.
		return findRealType(pile, ftd);
	}
	
	/**
	 * Renvoie le type d'une unitï¿½
	 * @param pile
	 * @param type
	 * @return
	 * @throws ErreurSemantique 
	 */
	private String findUnitType(ArrayList<TDS> pile, CommonTree unit) throws ErreurSemantique{
		
		ArrayList<String> comparateurs = new ArrayList<String>(Arrays.asList(new String[]{">", "<", "<>", "=", "<=", ">=", "&", "|"}));
		
		if(comparateurs.contains(unit.getText())) return "bool";
		
		//Si jamais c'est un appel de fonction, on récupère le fils droit (nom de la fonction)
		if(unit.getText().equals("FUNC_CALL"))
			unit = (CommonTree) unit.getChild(0);
		
		//Si c'est un if, on calcule son type de retour
		if(unit.getText().equals("if")){
			return computeTypeIf(pile, unit);
		}
		
		//Si c'est une affectation, on renvoie le type de la variable. Concordance déjà checkée.
		if(unit.getText().equals(":=")){
			return findUnitType(pile, (CommonTree) unit.getChild(0));
		}
		
		//Si c'est un let, on appelle une fonction de calcul spécifique
		if(unit.getText().equals("let")){
			return computeTypeLet(pile, unit);
		}
		
		String type=null;
		//On vï¿½rifie si l'unitï¿½ est une constante
		if(!(type=tryConstante(unit.getText())).equals("UNDEFINED")) return type;
		
		//Sinon on recherche la dï¿½finition de l'unitï¿½. On sait qu'il s'agit forcï¿½ment d'une unitï¿½ typï¿½e.
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);
		//Si aucune dï¿½finition n'a ï¿½tï¿½ retrouvï¿½e, l'expression est indeterminï¿½e.
		if(var == null)
			throw new ErreurSemantique(unit.getLine(), "Variable non-declaree : "+unit.getText());
		
		//Si l'unitï¿½ n'a pas de fils, c'est un type simple et on renvoie donc son type
		if(unit.getChildCount() == 0)
			return var.getType();
				
		//Si l'unitï¿½ a des fils, alors c'est un type composite (tableau ou structure).
		return findUnitComposite(pile, unit);
	}
	
	public String computeTypeLet(ArrayList<TDS> pile, CommonTree lettree) throws ErreurSemantique{
		String type="UNDEFINED";
		
		//On vérifie que let ait le fils 'in'
		if(lettree.getChildCount() == 2){
			//On récupère la dernière expression du 'in'
			CommonTree last = (CommonTree) lettree.getChild(1).getChild(lettree.getChild(1).getChildCount()-1);
			
			//On analyse 
			AnalyseSemantique.analyse_courante.checkNode(lettree);
			
			type = (new Expression(last)).computeType(pile);
			 
			//On retourne le calcul du type
			return type;
		}else{
			//Sinon le 'in' est vide et on retourne "UNDEFINED"
			return "UNDEFINED";
		}
	}
	
	public String computeTypeIf(ArrayList<TDS> pile, CommonTree iftree)throws ErreurSemantique{
		String type = "UNDEFINED";
		
		//On calcule le type du then
		CommonTree then_tree = (CommonTree) iftree.getChild(1).getChild(iftree.getChild(1).getChildCount()-1);
		
		//Le type est donné par la dernière expression
		String then_type = findUnitType(pile, then_tree);
		
		//On calcule le type du else s'il y en a un
		if(iftree.getChildCount() == 3){
			
			CommonTree else_tree = (CommonTree) iftree.getChild(2).getChild(iftree.getChild(2).getChildCount()-1);
			
			//Le type est donné par la dernière expression
			String else_type = findUnitType(pile, else_tree);
			
			//On calcule la correspondance des deux : s'ils sont identiques, alors on renvoie ce type
			type=concatType(pile, then_type, else_type);
			
		}else{
			//S'il n'y a pas de else, le type est UNDEFINED => pas sûr d'avoir un retour
		}
		
		return type;
	}
	
	/**
	 * Fonction recherchant le type du dernier champ accï¿½dï¿½
	 * @param pile
	 * @param unit
	 * @return Le type trouvï¿½ ou null UNDEFINED si rien n'a ï¿½tï¿½ trouvï¿½
	 * @throws ErreurSemantique 
	 */
	private String findUnitComposite(ArrayList<TDS> pile, CommonTree unit) throws ErreurSemantique{
		String type = "UNDEFINED";
		
		//On rï¿½cuï¿½re la dï¿½finition de l'unitï¿½
		FieldAvecType var = (FieldAvecType) TDS.findIn(pile, unit.getText(), FieldType.FieldFonction, FieldType.FieldStructure, FieldType.FieldTableau, FieldType.FieldVariable);
		
		//On rï¿½cupï¿½re la dï¿½finition du type de l'unitï¿½
		FieldTypeDef typedef = (FieldTypeDef) TDS.findIn(pile, var.getType(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
		
		//On regarde si l'unité a des fils
		if(unit.getChildCount() != 0){
			
			//On regarde si c'est un tableau ou une structure
			if(typedef.getFieldType().equals(FieldType.FieldTypeDefStructure)){
				
				//On regarde s'il a un frï¿½re (accï¿½s ï¿½ struct ou tab)
				CommonTree cursor = (CommonTree) unit.getChild(0);
				
				FieldTypeDefStructure def_struct = (FieldTypeDefStructure) typedef;
				String type_champ;

				while(cursor.getChild(1) != null){
					type_champ = def_struct.getChampType(cursor.getChild(0).getText());
										
					//Si le champ n'existe pas, on renvoie une erreur
					if(type_champ.equals("UNDEFINED"))
						throw new ErreurSemantique(unit.getLine(), "Accès au champ inexistant : '"+cursor.getChild(0).getText()+"' de la structure "+unit.getText());
					
					//On récupère le champ à droite
					cursor = (CommonTree) cursor.getChild(1);
					def_struct = (FieldTypeDefStructure) TDS.findIn(pile, type_champ, FieldType.FieldTypeDefStructure);
					
				}
				
				return def_struct.getChampType(cursor.getChild(0).getText());
				
			}else if(typedef.getFieldType().equals(FieldType.FieldTypeDefTableau)){
				
				//On rï¿½cupï¿½re le type des ï¿½lï¿½ments du tableau
				String type_tab = ((FieldTypeDefTableau)typedef).getTypeElements();
				
				//On regarde le nombre de fils. S'il n'y en a qu'un, il n'y a qu'un simple accï¿½s ï¿½ une case et on renvoie le type du tableau
				if(unit.getChildCount() == 1){
					type = type_tab;
				}
				
				//S'il n'y a pas de fils, alors UNDEFINED. On ne peut pas utiliser un tableau entier dans un calcul
				if(unit.getChildCount() == 0){
					type = "UNDEFINED";
				}
				
				//S'il y a plus de fils, on a deux cas : tous sont des tableaux, ou alors le dernier est uen structure
				if(unit.getChildCount() > 1){
					//On rï¿½cupï¿½re la dï¿½finition du type des ï¿½lï¿½ments du tableau
					FieldTypeDef typedef_elem = (FieldTypeDef) TDS.findIn(pile, type_tab, FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
					
					//On parcourt les fils de 0 ï¿½ n-2 (le dernier est un cas particulier)
					for (int i = 0; i < unit.getChildCount()-2; i++) {
						//Si le type n'a pas ï¿½tï¿½ trouvï¿½, on renvoie UNDEF
						if(typedef_elem == null)
							type= "UNDEFINED";
						
						//On vï¿½rifie que c'est bien une dï¿½finition de tableau. Sinon, on ne pourrait pas y accï¿½der par []
						if(!typedef_elem.getFieldType().equals(FieldType.FieldTypeDefTableau))
							type= "UNDEFINED";
						
						//Maintenant, on va vï¿½rifier la mï¿½me chose pour le type des ï¿½lï¿½ments du tableau suivant.
						typedef_elem = (FieldTypeDef) TDS.findIn(pile, ((FieldTypeDefTableau)typedef_elem).getTypeElements(), FieldType.FieldTypeDefSimple, FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau);
					}
					
					//Pour le dernier fils, si celui-ci est un tableau, on renvoi son type.
					if(typedef_elem.getFieldType().equals(FieldType.FieldTypeDefTableau))
						type = ((FieldTypeDefTableau)typedef_elem).getTypeElements();
					
					//Si le dernier fils est une structure
				}
			}
		
		//Si l'unitï¿½ n'a pas de fils, on renvoie le type rï¿½cupï¿½rï¿½.
		}else{
			type = var.getType();
		}
		
		return type;
	}
	
	/**
	 * Cette fonction vï¿½rifie si l'unitï¿½ est une constante
	 * @param unit Unitï¿½ ï¿½ vï¿½rifier
	 * @return "int" ou "string" si c'est une constante, null sinon
	 */
	private String tryConstante(String unit){
		
		//On regarde si c'est une chaine de caractï¿½re
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
