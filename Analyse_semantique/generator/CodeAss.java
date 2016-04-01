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

	private CodeAss() {
		code="";
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
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
		writer.write(code);
		writer.close();
	}

}
