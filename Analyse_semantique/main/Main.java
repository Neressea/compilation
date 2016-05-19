package main;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import analyse.AnalyseSemantique;
import analyse.TDS;
import generator.SupaHackaGenerator;
import sun.tools.jar.CommandLine;

public class Main {
	public static void main(String[] args){
		
		//On vï¿½rifie qu'on a bien le chemin du fichier en paramï¿½tre
		boolean verbose_tds = false;
		boolean verbose_iup = false;
		
		if(args.length != 1 && args.length != 2){
			System.err.println("Usage : java -jar AnalyseAnalyseSemantique [-v | -iup | -tds] file_src");
			System.exit(1);
		}
		
		String file_src;
		
		if(args.length == 2){
			switch (args[0]) {
			case "-v":
				verbose_tds = true;
				verbose_iup = true;
				break;

			case "-iup":
				verbose_iup = true;
				break;
				
			case "-tds":
				verbose_tds = true;
				break;
				
			default:
				System.err.println("Usage : java -jar AnalyseAnalyseSemantique [-v | -iup | -tds] file_src");
				System.exit(1);
				break;
			}
			
			file_src = args[1];
		}else{
			file_src = args[0];
		}
		
		AnalyseSemantique analyzer = null;

		try {
			analyzer = new AnalyseSemantique(file_src);
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
			
			if(verbose_tds){
				for(TDS tds : analyzer.getTDS()){
					System.out.println("--------- TDS numero "+i+++" ---------");
					System.out.println(tds);
					System.out.println("--------------------------------");
				}
			}
			
			System.out.println("L'analyse semantique n'a detecte aucun probleme !");
			SupaHackaGenerator daru = new SupaHackaGenerator(analyzer.getTree(), analyzer.getTDS());
			String path = file_src.replace(".tg", ".src");
			try {
				
				//On génère le code assembleur en un .src
				daru.genererCode(path);
				
				System.out.println("Le code a bien ete genere dans " + path + ". Voila.");
				
				//On compile en .iup
				System.out.println("Génération du .iup dans " + path.replace(".src", ".iup") +". Revoila.");
				Main.executeJAR(verbose_iup, "-ass", path);
		        
				//On lance l'exécutable en console
				System.out.println("Lancement du simulateur...");
				Main.executeJAR(true, "-sim");
		        
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void executeJAR(boolean verbose, String... params) throws IOException{
		
		ArrayList<String> args = new ArrayList<String>(Arrays.asList(params));
		
		args.add(0, "../MicroPIUP/microPIUPK.jar");
		args.add(0, "-jar");
		args.add(0, "java");
		
		ProcessBuilder pB = new ProcessBuilder(args);
		pB.directory(new File("../Generation_Assembleur"));
        Process p = pB.start();
        
        InputStream is = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String line;
        while ((line = br.readLine()) != null) {
        	if(verbose)
        		System.out.println(line);
        }
	}
}
