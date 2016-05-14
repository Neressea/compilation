package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Singleton stockant le code généré et permettant de l'écrire dans un fichier.
 *
 */
public class CodeAss {
	
	private String code;
	private int base_pile = 0x1000;

	private CodeAss() {
		code="RESETA 	equ 0xEFFA 	// adresse de lancement\n"
			+"INA    	equ 0xEFA0 	// adresse du port // d'entree\n"
			+"OUTA   	equ 0xEFA2 	// adresse du port // de sortie\n"
			+"LOADA  	equ 0xEFFA      // adresse de chargement\n"
			+"SEUIL	equ 3		// seuil\n"
		
			+"ORG   LOADA	// chargement en LOADA\n"
			+"START RESETA	// demarre en RESETA\n";
	}
	
	private static CodeAss codeAss = new CodeAss();
	
	/**
	 * Renvoie l'instance du sigleton
	 * @return Instance du singleton
	 */
	public static CodeAss getCodeSingleton() {
		return codeAss;
	}
	
	/**
	 * Ajoute un bloc de code au code à générer
	 * @param block Bloc de code de 1 à N lignes
	 */
	public void append(String block) {
		code+=block+"\n";
	}
	
	/**
	 * Ecris le code dans le fichier indiqué dans le path
	 * @param path
	 * @throws IOException 
	 */
	public void write(String path) throws IOException {
		
		code+=  "LDQ 64, R14 //On charge la trappe EXIT \n"
				+"TRP R14 //On quitte l'exécution\n"
				+"print LDQ 66, R14\n"
				+"TRP R14 //On lève la trappe\n"
				+"RTS //On retourne dans la suite de l'exécution\n"
				
				+"printi LDQ 66, R14\n"
				+"TRP R14 //On ève la trappe\n"
				+"RTS //On retourne dans la suite de l'exécution\n"
				
				+"read LDQ 65, R14 //on charge la trap\n"
				+"LDQ 0, R0 //On récupère les chaines de caractères tout le temps au même endroit, en début de mémoire\n"
				+"TRP R14 //On lève la trappe\n"
				+"RTS //On retourne dans le programme\n";
				//+"cast_string  //Fonction pour caster un entier en string\n";
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
		writer.write(code);
		writer.close();
		System.out.println("Le code a bien ete genere dans " + path + " Voila.");
	}
	
	public int getBasePile(){
		return base_pile;
	}

}
