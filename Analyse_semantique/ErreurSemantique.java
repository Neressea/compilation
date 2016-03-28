
public class ErreurSemantique extends Exception{
	
	public static int NB_ERRORS = 0;
	
	public ErreurSemantique(int line, String mess){
		super("Erreur "+(++NB_ERRORS)+" à la ligne "+line+" : "+mess);
	}
	
	/**
	 * Pour composer exception avec plusieurs messages d'erreur
	 */
	public ErreurSemantique(String mess){
		super(mess);
	}
}
