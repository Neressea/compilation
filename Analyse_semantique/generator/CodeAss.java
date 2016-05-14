package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Singleton stockant le code g�n�r� et permettant de l'�crire dans un fichier.
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
	 * Ajoute un bloc de code au code � g�n�rer
	 * @param block Bloc de code de 1 � N lignes
	 */
	public void append(String block) {
		code+=block+"\n";
	}
	
	/**
	 * Ecris le code dans le fichier indiqu� dans le path
	 * @param path
	 * @throws IOException 
	 */
	public void write(String path) throws IOException {
		
		code+=  "LDQ 64, R14 //On charge la trappe EXIT \n"
				+"TRP R14 //On quitte l'ex�cution\n"
				+"print LDQ 66, R14\n"
				+"TRP R14 //On l�ve la trappe\n"
				+"RTS //On retourne dans la suite de l'ex�cution\n"
				
				+"printi LDQ 66, R14\n"
				+"TRP R14 //On �ve la trappe\n"
				+"RTS //On retourne dans la suite de l'ex�cution\n"
				
				+"read LDQ 65, R14 //on charge la trap\n"
				+"LDQ 0, R0 //On r�cup�re les chaines de caract�res tout le temps au m�me endroit, en d�but de m�moire\n"
				+"TRP R14 //On l�ve la trappe\n"
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
