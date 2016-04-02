package main;
import java.io.IOException;

import analyse.AnalyseSemantique;
import analyse.TDS;
import generator.SupaHackaGenerator;

public class Main {
	public static void main(String[] args){
		
		//On v�rifie qu'on a bien le chemin du fichier en param�tre
		if(args.length != 1){
			System.err.println("Usage : java -cp ./Analyse_lexicale_et_syntaxique/antlr-3.3-complete.jar AnalyseAnalyseSemantique file_src");
			System.exit(1);
		}
		
		
		
		AnalyseSemantique analyzer = null;

		try {
			analyzer = new AnalyseSemantique(args[0]);
		} catch (Throwable e) {
			System.err.println("Erreur lors de la lecture de l'AST : "+e.getMessage());
			System.exit(2);
		}
		
		analyzer.analyze();
			
		if(!analyzer.isOK()){
			String errors = analyzer.getErrors();
			System.err.println(errors);
			System.err.println(errors.split("\n").length+" erreur(s) semantique(s) trouvee(s)");
		}else{
			int i=1;
			
			for(TDS tds : analyzer.getTDS()){
				System.out.println("--------- TDS numero "+i+++" ---------");
				System.out.println(tds);
				System.out.println("--------------------------------");
			}
			System.out.println("L'analyse semantique n'a detecte aucun probleme !");
			SupaHackaGenerator daru = new SupaHackaGenerator(analyzer.getTree(), analyzer.getTDS());
			try {
				String path = args[0].replace(".tg", ".src");
				daru.genererCode(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
