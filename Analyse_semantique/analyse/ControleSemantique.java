package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

/**
 * 
 * Contr�le s�mantique
 *
 */
public abstract class ControleSemantique {
	
	protected CommonTree node;
	
	public ControleSemantique(CommonTree node){
		this.node=node;
	}
	
	public abstract void check(ArrayList<TDS> TDSs) throws ErreurSemantique;
}
