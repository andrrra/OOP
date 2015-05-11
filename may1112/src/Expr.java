
public abstract class Expr {
	
	public abstract  boolean isTerm();
	
	public abstract  boolean isNorm();
	
	public Expr normalize() {
		return this;
	}
	
	public Expr getLeft() {
		return null;
	}
	
	public Expr getRight(){
		return null;
	}
	
	public Op getOp(){
		return null;
	}

}
