package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class ControleDoubleDeclaration extends ControleSemantique {

	public ControleDoubleDeclaration(CommonTree node) {
		super(node);
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		Field f;
		String idVariable = node.getChild(0).getText();
		f = (Field) TDS.findIn(TDSs, idVariable, FieldType.FieldFonction, FieldType.FieldStructure,
													FieldType.FieldTableau, FieldType.FieldTypeDefSimple,
													FieldType.FieldTypeDefStructure, FieldType.FieldTypeDefTableau,
													FieldType.FieldVariable);
		if (f!=null) {
			throw new ErreurSemantique(node.getLine(), "L identifiant '" + idVariable 
													+ "' a deja ete declare (" + f.getFieldType().toString() + ")");
		}
	}

}
