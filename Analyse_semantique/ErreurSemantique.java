
public class ErreurSemantique extends Exception{
	public ErreurSemantique(int line, String mess){
		super("Erreur � la ligne "+line+" : "+mess);
	}
}
