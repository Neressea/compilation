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
	private String code_fonctions_utilisateurs; //Le code des fonctions d�finies par les utilisateurs
	private String code_fonctions_du_langage;
	private int base_pile = 0x1000;
	private boolean writing_func = false;

	private CodeAss() {
		
		code_fonctions_utilisateurs = "/////// ------------------------------  Fonctions utilisateurs  ------------------------------ ///////\n\n";
		
		code_fonctions_du_langage = "/////// ------------------------------  Fonctions du langage  ------------------------------ ///////\n\n"
				+"//*** println(string) : affiche le texte pass� en param�tre et fait un saut de ligne ***//\n"
				+"println \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "TRP #WRITE_TRP //On l�ve la trappe\n"
				+ "LDQ SAUT_DE_LIGNE, R0\n"
				+ "TRP #WRITE_TRP\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS //On retourne dans la suite de l'ex�cution\n\n"
				
				+"//*** print(string) : affiche le texte pass� en param�tre ***//\n"
				+"print \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "TRP #WRITE_TRP //On l�ve la trappe\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS //On retourne dans la suite de l'ex�cution\n\n"
				
				+"//*** printiln(int) : affiche l'entier pass� en param�tre ***//\n"
				+"printiln \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "TRP #WRITE_TRP //On l�ve la trappe\n"
				+ "LDQ SAUT_DE_LIGNE, R0\n"
				+ "TRP #WRITE_TRP\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS //On retourne dans la suite de l'ex�cution\n\n"
				
				+"//*** printi(int) : affiche l'entier pass� en param�tre ***//\n"
				+"printi \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "TRP #WRITE_TRP //On l�ve la trappe\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS //On retourne dans la suite de l'ex�cution\n\n"
				
				+"//*** string read() : lit une chaine sur l'entr�e standard ***//\n"
				+"read \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "STRING"+(OperandeSimple.counter++)+" RSB 100 //On cr�e la chaine de retour (100 caract�res max)\n"
				+ "LDQ STRING"+(OperandeSimple.counter-1)+", R0 //On met cette adresse en lecture\n"
				+ "TRP #READ_TRP //On l�ve la trappe\n"
				+ "LDW R3, R0 //On met le r�sultat dans R3\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS //On retourne dans le programme\n\n"
				
				+"//*** int readi() : lit un entier sur l'entr�e standard ***//\n"
				+"readi \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+"//On commence par lire la chaine\n"
				+ "STRING"+(OperandeSimple.counter++)+" RSB 100 //On cr�e la chaine de retour (100 caract�res max)\n"
				+ "LDQ STRING"+(OperandeSimple.counter-1)+", R0 //On met cette adresse en lecture\n"
				+ "TRP #READ_TRP //On l�ve la trappe\n"
				+ "LDW R5, R0 //On met le r�sultat dans R5\n"
				+ "JSR @atoi //On convertit en entier. R�sultat dans R3\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+ "RTS //On retourne dans le programme\n\n"
				
				+"//*** int atoi(string) : convertit une chaine en entier base 10. R5 = adresse de la chaine. ***//\n"
				+"atoi \n"
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				
				+"LDQ 0, R3 //On initialise R3\n"
				+"LDQ ASCII_0, R6 //On charge lavaleur ASCII de 0 \n"
				+"LDQ 10, R7 //On charge la valeur ASCII de 0 \n"
				+"LOOP_ATOI \n"
				
				+"//On charge le caract�re courant dans R4\n"
				+"LDB R4, (R5)\n"
				+"TST R4\n"
				+"BEQ END_LOOP_ATOI-$-2 //Si le caract�re courant est �gal � 0, on saute � la fin de la boucle\n\n"
				
				+"MUL R3, R7, R3//On multiplie par 10 la valeur de l'entier\n"
				+"SUB R4, R6, R4 //On calcule la valeur d�cimale de R4\n"
				+"ADD R3, R4, R3 //On ajoute cette valeur � R3\n\n"
				
				+"ADQ 1, R5//On se d�place dans la chaine\n"
				+"BMP LOOP_ATOI-$-2\n"
				
				+"END_LOOP_ATOI\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+ "RTS //On retourne dans le programme\n\n"

				+"//*** string itoa(int number, int base) : Cast un entier en une chaine selon la base pass�e en param�tre ***//\n"
				+"itoa "
				+ Fonction.saveRegisters()
				+ Fonction.openEnv()
				+ "STRING"+(OperandeSimple.counter++) + " RSB 100 //On cr�e la chaine de retour (100 octets max)\n"
				+ "LDQ STRING"+(OperandeSimple.counter-1)+", R3 //On charge l'adresse dans R0\n"
				+"//R5 -> entier � convertir, R6 -> base de conversion, R3 -> adresse de la chaine r�sultat\n"
				
				+"LDQ 10, R8  \n"
				+"CMP R6, R8  \n"
				+"BNE NOSIGN-$-2 //Si b==10, on calcule le signe\n"
				+"LDQ 0, R7 //R7 contiendra le symbole de la conversion\n"
				+"TST R5\n"
				+"BGE POSIT-$-2 //On saute si (R5) >= 0\n"
				+"NEG R5, R5\n"
				+"LDQ ASCII_MINUS, R7\n"
				+"POSIT NOP\n\n"
				
				+"NOSIGN  LDW R8, R5 //R8 <- entier � convertir\n"
				+"CNVLOOP ldw R5, R8\n\n"
				
				+"SRL R6, R6\n//On divise la base par 2\n"
				+"ANI R5, R9, #1 //ANd Imm�diate entre r0 et 00...01 vers r4\n"
				+"SRL R5, R5 //on divise l'entier par 2\n"
				+"DIV R5, R6, R8\n"
				+"SHL R5, R5\n"
				+"ADD R5, R9, R5\n"
				+"SHL R6, R6\n\n"
				
				+"ADQ -10, R5 //entier -10 -> R5\n"
				+"BGE LETTER-$-2\n"
				+"ADQ 10+ASCII_0, R5\n\n"
				
				+"BMP STKCHR-$-2\n\n"
				
				+"LETTER ADQ ASCII_A, R5\n\n"
				
				+"STKCHR STW R5, -(SP)\n"
				+"TST R8\n"
				+"BNE CNVLOOP-$-2\n //Boucle si quotient non nul\n\n"
				 
				+"//On empile maintenant les caract�res dans le bon ordre\n"
				+"LDW R2, R3\n"
				+"LDQ 0, R10\n"
				+"CMP R7, R10 //Si R7 = 0, on l'ajoute pas a la chaine\n"
				+"BEQ CPYLOOP-$-2\n"
				+"STB R7, (R2)+ //On copie le signe dans le tampon\n"
				+"CPYLOOP LDW R5, (SP)+//On d�pile le chiffre\n"
				+"STB R5, (R2)+\n"
				+"CMP SP, BP\n"
				+"BNE CPYLOOP-$-2\n"
				+"LDQ NUL, R5\n"
				+"STB R5, (R2)+//On termine la chaine par NUL\n"
				+ Fonction.closeEnv()
				+ Fonction.reloadRegisters()
				+"RTS\n\n";
		
		code =	"/////// ------------------------------  En-tete du programme  ------------------------------ ///////\n\n"
				+"//*** On d�finit les adresses utiles ***//\n"
				+"RESETA 	equ 0xEFFA 	// adresse de lancement du programme\n"
				+"LOADA  	equ 0xEFFA      // adresse de chargement du programme\n"
				+"STACKA equ " + base_pile +" //Adresse de base de la pile\n\n"
				
				+"//*** On d�finit les registres usuels ***//\n"
				+"SP equ R15 //Reigstre de sommet de pile\n"
				+"WR equ R14 //Registre pour lever les traps\n"
				+"BP equ R13 //Registre de base de l'environnement courant\n"
				+"ASCII_MINUS equ 45\n"
				+"ASCII_PLUS  equ 43\n"
				+"ASCII_SP    equ 32 \n"
				+"ASCII_0     equ 48 \n"
				+"ASCII_A     equ 65 \n\n"
			
				+"//*** On d�finit les trappes usuelles ***//\n"
				+"EXIT_TRP equ 64 //Trappe pour quitter le programme\n"
				+"READ_TRP equ 65 //Trappe de lecture sur l'entr�e standard\n"
				+"WRITE_TRP equ 66 //Trappe d'�criture sur la sortie standard\n\n"
			
				+"NIL equ 0 //Base initiale\n"
				+"NUL equ 0 //Caract�re de fin de chaine\n\n"
				
				+"ORG   LOADA	// chargement en LOADA\n"
				+"START main	// demarre � main\n\n"
				
				+"/////// ------------------------------  Programme principal  ------------------------------ ///////\n\n"
				
				+"main LDW SP, #STACKA //On charge la base de la pile\n"
				+"LDW BP, #NIL //Base initiale nulle\n\n"
				
				+"//*** Saut de ligne ***//\n"
				+"SAUT_DE_LIGNE string \"\"\n"
				+"LDQ SAUT_DE_LIGNE, R2\n"
				+"LDQ 10, R3 //Saut de ligne\n"
				+"LDQ NUL, R4 //Fin de chaine\n"
				+"STB R3, (R2)+\n"
				+"STB R4, (R2)\n";
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
	 * L'ajoute soit au bloc des fonctions soit au bloc principal
	 * @param block Bloc de code de 1 � N lignes
	 */
	public void append(String block) {
		if(!writing_func)
			code+=block+"\n";
		else
			code_fonctions_utilisateurs+=block+"\n";
	}
	
	/**
	 * Indique si on �crit dans une fonction ou dans le bloc principal
	 * @param writing
	 */
	public void setWritingFunc(boolean writing){
		writing_func = writing;
	}
	
	/**
	 * Ajoute la trappe d'arr�t et les fonctions du langage 
	 */
	private void closeCode(){
		code+=  "//*** On exit le programme principal ***//\n"
				+"TRP #EXIT_TRP //On quitte l'ex�cution\n\n";
	}
	
	/**
	 * Ecris le code dans le fichier indiqu� dans le path
	 * @param path
	 * @throws IOException 
	 */
	public void write(String path) throws IOException {
		
		closeCode();
		
		//On ajoute les focntions d�finies par l'utilisateur
		code += code_fonctions_utilisateurs;
		
		//On ajoute les fonctions du langage
		code += code_fonctions_du_langage;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
		writer.write(code);
		writer.close();
	}
	
	public int getBasePile(){
		return base_pile;
	}

}
