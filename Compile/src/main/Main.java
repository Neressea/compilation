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
import java.util.Scanner;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import analyse.AnalyseSemantique;
import analyse.TDS;
import generator.SupaHackaGenerator;
//import sun.tools.jar.CommandLine;

public class Main {
	public static void main(String[] args){
		
		//On v�rifie qu'on a bien le chemin du fichier en param�tre
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
				
				//On g�n�re le code assembleur en un .src
				daru.genererCode(path);
				
				System.out.println("Le code a bien ete genere dans " + path + ". Voila.");
				
				//On compile en .iup
				System.out.println("G�n�ration du .iup dans " + path.replace(".src", ".iup") +". Revoila.");
				Main.executeJAR(verbose_iup, "-ass", path);
		        
				//On lance l'ex�cutable en console
				System.out.println("------------------- Lancement du simulateur -------------------");
				System.out.print("Lancer le simulateur en console ? [O-n] : ");
				
				if((new Scanner(System.in)).nextLine().equals("n")){
					Main.executeJAR(true, "-sim");
				}else{
					Main.executeJAR(true, "-batch", path.replace(".src", ".iup"));
				}
		        
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void executeJAR(boolean verbose, String... params) throws IOException, InterruptedException{
		
		ArrayList<String> args = new ArrayList<String>(Arrays.asList(params));
		
		args.add(0, "../MicroPIUP/microPIUPK.jar");
		args.add(0, "-jar");
		args.add(0, "java");
		
        ProcessBuilder pB = new ProcessBuilder(args);
		pB.directory(new File("../Generation_Assembleur"));
        
        if(verbose){
        	pB.redirectOutput(ProcessBuilder.Redirect.INHERIT);
    		pB.redirectInput(ProcessBuilder.Redirect.INHERIT);
    		pB.redirectError(ProcessBuilder.Redirect.INHERIT);
    		Process p = pB.start();
    		p.waitFor();
        }else{
        	Process p = pB.start();
        	InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String line;
            while ((line = br.readLine()) != null);
        }
        
	}
}
