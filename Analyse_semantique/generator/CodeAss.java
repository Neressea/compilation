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
		
		code =	"//*** On d�finit les adresses utiles ***//\n"
				+"RESETA 	equ 0xEFFA 	// adresse de lancement du programme\n"
				+"LOADA  	equ 0xEFFA      // adresse de chargement du programme\n"
				+"STACKA equ " + base_pile +" //Adresse de base de la pile\n\n"
				
				+"//*** On d�finit les registres usuels ***//\n"
				+"SP equ R15 //Reigstre de sommet de pile\n"
				+"WR equ R14 //Registre pour lever les traps\n"
				+"BP equ R13 //Registre de base de l'environnement courant\n\n"
			
				+"//*** On d�finit les trappes usuelles ***//\n"
				+"EXIT_TRP equ 64 //Trappe pour quitter le programme\n"
				+"READ_TRP equ 65 //Trappe de lecture sur l'entr�e standard\n"
				+"WRITE_TRP equ 66 //Trappe d'�criture sur la sortie standard\n\n"
			
				+"NUL equ 0 //Caract�re de fin de chaine\n\n"
				
				+"ORG   LOADA	// chargement en LOADA\n"
				+"START main	// demarre � main\n\n"
		
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
	 * Ajoute un bloc de code au code � g�n�rer
	 * @param block Bloc de code de 1 � N lignes
	 */
	public void append(String block) {
		code+=block+"\n";
	}
	
	/**
	 * Ajoute la trappe d'arr�t et les fonctions du langage 
	 */
	private void closeCode(){
		code+=  "//*** On exit le programme principal ***//"
				+"LDQ 64, R14 //On charge la trappe EXIT \n"
				+"TRP R14 //On quitte l'ex�cution\n"
				
				+"//*** print(string) : affiche le texte pass� en param�tre ***//"
				+"print LDQ 66, R14\n"
				+"TRP R14 //On l�ve la trappe\n"
				+"RTS //On retourne dans la suite de l'ex�cution\n"
				
				+"//*** printi(int) : affiche l'entier pass� en param�tre ***//"
				+"printi LDQ 66, R14\n"
				+"TRP R14 //On �ve la trappe\n"
				+"RTS //On retourne dans la suite de l'ex�cution\n"
				
				+"//*** int read() : lit un entier sur l'entr�e standard ***//"
				+"read LDQ 65, R14 //on charge la trap\n"
				+"LDQ 0, R0 //On r�cup�re les chaines de caract�res tout le temps au m�me endroit, en d�but de m�moire\n"
				+"TRP R14 //On l�ve la trappe\n"
				+"RTS //On retourne dans le programme\n"

				+"//*** string atoi(int number, int base) : Cast un entier en une chaine selon la base pass�e en param�tre ***//\n"
				+"atoi ";
				
	}
	
	/**
	 * Ecris le code dans le fichier indiqu� dans le path
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
