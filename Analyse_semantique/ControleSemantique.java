import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Contr�le s�mantique
 *
 */
public interface ControleSemantique {
	public void check(CommonTree tree, ArrayList<TDS> TDSs) throws ErreurSemantique;
}
