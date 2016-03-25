import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Contrôle sémantique
 *
 */
public abstract class ControleSemantique {
	
	protected CommonTree node;
	
	public abstract void check(ArrayList<TDS> TDSs) throws ErreurSemantique;
}
