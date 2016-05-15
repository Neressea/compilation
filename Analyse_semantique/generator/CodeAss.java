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
		
		code =	"//*** On définit les adresses utiles ***//\n"
				+"RESETA 	equ 0xEFFA 	// adresse de lancement du programme\n"
				+"LOADA  	equ 0xEFFA      // adresse de chargement du programme\n"
				+"STACKA equ " + base_pile +" //Adresse de base de la pile\n\n"
				
				+"//*** On définit les registres usuels ***//\n"
				+"SP equ R15 //Reigstre de sommet de pile\n"
				+"WR equ R14 //Registre pour lever les traps\n"
				+"BP equ R13 //Registre de base de l'environnement courant\n\n"
			
				+"//*** On définit les trappes usuelles ***//\n"
				+"EXIT_TRP equ 64 //Trappe pour quitter le programme\n"
				+"READ_TRP equ 65 //Trappe de lecture sur l'entrée standard\n"
				+"WRITE_TRP equ 66 //Trappe d'écriture sur la sortie standard\n\n"
			
				+"NUL equ 0 //Caractère de fin de chaine\n\n"
				
				+"ORG   LOADA	// chargement en LOADA\n"
				+"START main	// demarre à main\n\n"
		
				+"main LDW SP, #STACKA //On charge la base de la pile\n"
				+"LDW BP, #NIL //Base initiale nulle\n";
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
	 * Ajoute la trappe d'arrêt et les fonctions du langage 
	 */
	private void closeCode(){
		code+=  "//*** On exit le programme principal ***//"
				+"LDQ 64, R14 //On charge la trappe EXIT \n"
				+"TRP R14 //On quitte l'exécution\n"
				
				+"//*** print(string) : affiche le texte passé en paramètre ***//"
				+"print LDQ 66, R14\n"
				+"TRP R14 //On lève la trappe\n"
				+"RTS //On retourne dans la suite de l'exécution\n"
				
				+"//*** printi(int) : affiche l'entier passé en paramètre ***//"
				+"printi LDQ 66, R14\n"
				+"TRP R14 //On ève la trappe\n"
				+"RTS //On retourne dans la suite de l'exécution\n"
				
				+"//*** int read() : lit un entier sur l'entrée standard ***//"
				+"read LDQ 65, R14 //on charge la trap\n"
				+"LDQ 0, R0 //On récupère les chaines de caractères tout le temps au même endroit, en début de mémoire\n"
				+"TRP R14 //On lève la trappe\n"
				+"RTS //On retourne dans le programme\n"

				+"//*** string atoi(int number, int base) : Cast un entier en une chaine selon la base passée en paramètre ***//\n"
				+"atoi ";
				
	}
	
	/**
	 * Ecris le code dans le fichier indiqué dans le path
	 * @param path
	 * @throws IOException 
	 */
	public void write(String path) throws IOException {
		
		closeCode();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
		writer.write(code);
		writer.close();
		System.out.println("Le code a bien ete genere dans " + path + " Voila.");
	}
	
	public int getBasePile(){
		return base_pile;
	}

}
