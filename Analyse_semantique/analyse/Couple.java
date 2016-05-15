package analyse;

public class Couple<E, F>{
	private E left;
	private F right;
	
	public Couple(E left, F right){
		this.left = left;
		this.right = right;
	}
	
	public E getLeft(){
		return left;
	}
	
	public F getRight(){
		return right;
	}
}
