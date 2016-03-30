import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.tree.CommonTree;


public class ControleBool extends ControleSemantique{

	private ArrayList<String> comparateur = new ArrayList<String>();
	private ArrayList<String> associateur = new ArrayList<String>();
	private String err = "";
	
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
	
		if(comparateur.contains(node.getText())){
			
//			child1 = new ControleBool((CommonTree) node.getChild(0));
//			String first="";
//			first = child1.checkinf(TDSs);
//
//			child2 = new ControleBool((CommonTree) node.getChild(1));
//			String second="";
//			second = child2.checkinf(TDSs);
			(new Expression(node)).computeType(TDSs);
									
		}else if (associateur.contains(node.getText())){

				child1 = new ControleBool((CommonTree) node.getChild(0));
				err+=child1.recursiveCheck(TDSs);
				
				child2 = new ControleBool((CommonTree) node.getChild(1));
				err+=child2.recursiveCheck(TDSs);

		}else{
			//Si c'est une unité, on vérifie que c'est bien un entier
			ControleBool cb = new ControleBool(node);
			String type=cb.checkinf(TDSs);
									
			if(!type.equals("int")){
				err+="Erreur à la ligne "+node.getLine()+" : Expression non-entiere utilisee comme booleen dans la condition : '"+node.getText()+"'\n";
			}
		}
		
		return err;
	}
	
	private String checkinf(ArrayList<TDS> TDSs){
		try{
			Expression ea = new Expression(node);
			return ea.computeType(TDSs);
		}catch(Exception e){
			err+=e.getMessage();
		}
		
		return "UNDEFINED";
	}

}
