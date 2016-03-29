import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;


public class ControleBool extends ControleSemantique{

	ArrayList<String> comparateur = new ArrayList<String>();
	ArrayList<String> associateur = new ArrayList<String>();
	
	public ControleBool(CommonTree node) {
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
		
		String err = "";
		
		err = recursiveCheck(TDSs);
		
		if(!err.equals(""))
			throw new ErreurSemantique(err);
		
	}
	
	public String recursiveCheck(ArrayList<TDS> TDSs) throws ErreurSemantique{
		ControleBool child1;
		ControleBool child2;
		String err="";
		
		//Si c'est une unit�, on v�rifie que c'est bien un entier
		if(node.getChildCount() == 0 || node.getChildCount() == 1){
			Expression e = new Expression(node);
			String type = e.computeType(TDSs);
			
			if(!type.equals("int")){
				err+="Erreur "+(++ErreurSemantique.NB_ERRORS)+" � la ligne "+node.getLine()+" : Expression non-entiere utilisee comme booleen dans la condition : '"+node.getText()+"'\n";
			}
		}
	
		if(comparateur.contains(node.getText())){
			
			child1 = new ControleBool((CommonTree) node.getChild(0));
			String first="";
			try {
				first = child1.checkinf(TDSs);
			} catch (ErreurSemantique e) {
				err+=e.getMessage();
			}
			child2 = new ControleBool((CommonTree) node.getChild(1));
			String second="";
			try {
				second = child2.checkinf(TDSs);
			} catch (ErreurSemantique e) {
				err+=e.getMessage();
			}
			
			if (!first.equals(second)){
				err+="Erreur "+(++ErreurSemantique.NB_ERRORS)+" � la ligne "+node.getLine()+" : Comparaison de deux expressions aux types differents : '"+node.getChild(0).toStringTree()+"' ("+first+") et '"+node.getChild(1).toStringTree()+"' ("+second+")\n";
			}
			
		}else if (associateur.contains(node.getText())){

				child1 = new ControleBool((CommonTree) node.getChild(0));
				err+=child1.recursiveCheck(TDSs);
				
				child2 = new ControleBool((CommonTree) node.getChild(1));
				err+=child2.recursiveCheck(TDSs);

		}
		
		return err;
	}
	
	private String checkinf(ArrayList<TDS> TDSs) throws ErreurSemantique{
		Expression ea = new Expression(node);
		return ea.computeType(TDSs);
		
	}

}
