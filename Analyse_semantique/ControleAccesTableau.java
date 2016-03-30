import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleAccesTableau extends ControleSemantique{

	/**
	 * Pn reçoit le noeud de l'id du tableau
	 * @param node
	 */
	public ControleAccesTableau(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		Expression exp=null;
		
		//Type du tableau
		FieldTableau ft = (FieldTableau) TDS.findIn(TDSs, node.getText(), FieldType.FieldTableau);
		
		if(ft == null)
			throw new ErreurSemantique(node.getLine(), "Tableau non-déclaré : "+node.getText());
		
		FieldTypeDef typedeftab = (FieldTypeDefTableau) TDS.findIn(TDSs, ft.getType(), FieldType.FieldTypeDefTableau);
		String typeelems = ((FieldTypeDefTableau) typedeftab).getTypeElements();
		
		//On vérifie le type de tous les fils
		for (int i = 0; i < node.getChildCount()-1; i++) {
			if(node.getChild(i).getChildCount() == 1){
				exp = new Expression((CommonTree) node.getChild(i).getChild(0));
				String type = exp.computeType(TDSs);
				
				typedeftab = (FieldTypeDef) TDS.findIn(TDSs, typeelems, FieldType.FieldTypeDefTableau, FieldType.FieldTypeDefStructure);
				if(typedeftab.getFieldType().equals(FieldType.FieldTypeDefTableau))
					typeelems = ((FieldTypeDefTableau) typedeftab).getTypeElements();
								
				if(!type.equals("int"))
					throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-entière : "+type);
			}
		}
		
		//Si le dernier élément est un tableau, on le vérifie
		CommonTree last = (CommonTree) node.getChild(node.getChildCount()-1);
		if(typedeftab!=null && typedeftab.getFieldType().equals(FieldType.FieldTypeDefTableau)){
			if(last.getChildCount() == 1){
				exp = new Expression((CommonTree) last.getChild(0));
				String type = exp.computeType(TDSs);
								
				if(!type.equals("int"))
					throw new ErreurSemantique(node.getLine(), "Acces au tableau "+node.getText()+" par valeur non-entière : "+type);
			}
		}
	}
}
