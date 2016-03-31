import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleAccesTableau extends ControleSemantique{

	/**
	 * Pn re�oit le noeud de l'id du tableau
	 * @param node
	 */
	public ControleAccesTableau(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique{
		Expression exp=null;
		
		//On r�cup�re le parent 
		CommonTree nodeFils = node;
		node = (CommonTree) node.getParent();
		
		//Si ce n'est pas le premier fils qu'on a, on a d�j� v�rifi� et on arr�te tout
		if(!node.getChild(0).equals(nodeFils))
			return;
		
		//Type du tableau
		FieldTableau ft = (FieldTableau) TDS.findIn(TDSs, node.getText(), FieldType.FieldTableau);
		
		if(ft == null)
			throw new ErreurSemantique(node.getLine(), "Tableau non-d�clar� : "+node.getText());
		
		FieldTypeDef typedeftab = (FieldTypeDefTableau) TDS.findIn(TDSs, ft.getType(), FieldType.FieldTypeDefTableau);
		String typeelems = ((FieldTypeDefTableau) typedeftab).getTypeElements();
		
		//On v�rifie le type de tous les fils
		for (int i = 0; i < node.getChildCount()-1; i++) {
			if(node.getChild(i).getChildCount() == 1){
				exp = new Expression((CommonTree) node.getChild(i).getChild(0));
				
				typedeftab = (FieldTypeDef) TDS.findIn(TDSs, typeelems, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
				
				if(typedeftab == null)
					return;
				
				String type = exp.computeType(TDSs);
				
				if(typedeftab.getFieldType().equals(FieldType.FieldTypeDefTableau))
					typeelems = ((FieldTypeDefTableau) typedeftab).getTypeElements();
								
				if(!type.equals("int"))
					throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-enti�re : "+type);
			}
		}
				
		//Si le dernier �l�ment est un tableau, on le v�rifie
		CommonTree last = (CommonTree) node.getChild(node.getChildCount()-1);
		if(typedeftab!=null && typedeftab.getFieldType().equals(FieldType.FieldTypeDefTableau)){
			if(last.getChildCount() == 1){
				exp = new Expression((CommonTree) last.getChild(0));
				String type = exp.computeType(TDSs);
								
				if(!type.equals("int"))
					throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-enti�re : "+type);
			}
		}
	}
}
