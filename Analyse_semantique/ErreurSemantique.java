
public class ErreurSemantique extends Exception{
	public ErreurSemantique(int line, String mess){
		super("Erreur à la ligne "+line+" : "+mess);
	}
}
