package analyse;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public class Let {
	private AnalyseSemantique analyse;
	private CommonTree tree;
	public Let(CommonTree ct){
		tree=ct;
		analyse = new AnalyseSemantique(ct);
	}
	
	public String computeType(ArrayList<TDS> pile){
		analyse.analyze(pile);
		return analyse.getType();
	}
}
