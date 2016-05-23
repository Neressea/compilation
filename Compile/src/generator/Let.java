package generator;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import analyse.TDS;

public class Let extends Instruction{
	
	public static int nb_let = 0;

	public Let(CommonTree node, SupaHackaGenerator generator) {
		super(node, generator);
	}

	@Override
	public void genererCode(ArrayList<TDS> pile) {
		CodeAss ca = CodeAss.getCodeSingleton();
		generator.openTDS();
		
		if(nb_let == 0){
			nb_let++;
			
			ca.append(Fonction.openEnv());
			
			//On g�n�re le bloc des d�clarations
			generator.genererChild((CommonTree) node.getChild(0));
			
			//On g�n�re le bloc d'ex�cution s'il y en a un 
			if(node.getChildCount() == 2)
				generator.genererChild((CommonTree) node.getChild(1));
			
			ca.append(Fonction.closeEnv());
			generator.closeTDS();
									
		}else{
			
			int current = nb_let;
			ca.setWritingLet(nb_let);
			ca.append("//DEBUT LET");
			ca.append("let"+(nb_let++));
			ca.append(Fonction.openEnv());
			
			//On g�n�re le bloc des d�clarations
			generator.genererChild((CommonTree) node.getChild(0));
			
			//On g�n�re le bloc d'ex�cution s'il y en a un 
			if(node.getChildCount() == 2)
				generator.genererChild((CommonTree) node.getChild(1));
			
			ca.setWritingLet(current);
			ca.append(Fonction.closeEnv());
			ca.append("RTS");
			ca.append("//FIN LET");
			generator.closeTDS();
			
			ca.setWritingLet(0);
			
			ca.append("JSR @let"+current);
		}
	}

}
