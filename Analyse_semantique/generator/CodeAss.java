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

	private CodeAss() {
		code="RESETA 	equ 0xEFFA 	// adresse de lancement\n"
	+"INA    	equ 0xEFA0 	// adresse du port // d'entree\n"
	+"OUTA   	equ 0xEFA2 	// adresse du port // de sortie\n"
	+"LOADA  	equ 0xEFDC      // adresse de chargement\n"
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
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
		writer.write(code);
		writer.close();
		System.out.println("Le code a bien ete genere dans " + path + " Voila.");
	}

}
