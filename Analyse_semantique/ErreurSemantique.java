
public class ErreurSemantique extends Exception{
	public ErreurSemantique(int line, String mess){
		super("Erreur à la ligne "+line+" : "+mess);
	}
	
	/**
	 * Pour composer exception avec plusieurs messages d'erreur
	 */
	public ErreurSemantique(String mess){
		super(mess);
	}
}
