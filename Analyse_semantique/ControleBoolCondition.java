import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;


public class ControleBoolCondition extends ControleSemantique{

	ArrayList<String> comparateur = new ArrayList<String>();
	ArrayList<String> associateur = new ArrayList<String>();
	
	public ControleBoolCondition(CommonTree node) {
		super(node);
		
		this.comparateur.add("<>");
		this.comparateur.add(">");
		this.comparateur.add("<");
		this.comparateur.add(">=");
		this.comparateur.add("<=");
		this.comparateur.add("=");
		
		this.associateur.add("&");
		this.associateur.add("|");
	}

	@Override
	public void check(ArrayList<TDS> TDSs) throws ErreurSemantique {
		
		ControleBoolCondition child;
		
		if(comparateur.contains(node.getChild(0).getText())){
			
			child = new ControleBoolCondition((CommonTree) node.getChild(0));
			String first = child.checkinf(TDSs);
			child = new ControleBoolCondition((CommonTree) node.getChild(1));
			String second = child.checkinf(TDSs);
			
			if (!first.equals(second)){
				throw new ErreurSemantique(node.getLine(), "Comparaison de deux expressions aux types différents "+first+" et "+second);
			}
			
		}
		else if (associateur.contains(node.getChild(0).getText())){
			if (node.getChildCount() >= 2){
				child = new ControleBoolCondition((CommonTree) node.getChild(0));
				child.check(TDSs);
			}
			
			if(node.getChildCount() >= 1){
				child = new ControleBoolCondition((CommonTree) node.getChild(1));
				child.check(TDSs);
			}else{
				
			}
			
		}else{
			throw new ErreurSemantique(node.getLine(), "La condition n'est pas un boolean");
		}
		
	}
	
	private String checkinf(ArrayList<TDS> TDSs) throws ErreurSemantique{
		
		ExpressionArithmetique ea = new ExpressionArithmetique(node);
		return ea.computeType(TDSs);
		
	}

}
