import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Contrôle sémantique
 *
 */
public interface ControleSemantique {
	public void check(CommonTree tree, ArrayList<TDS> TDSs) throws ErreurSemantique;
}
