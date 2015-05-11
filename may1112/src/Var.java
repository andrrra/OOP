
public class Var extends Expr {
	
	private String symbol;
	
	public Var(String symbol){
		this.symbol=symbol;
	}

	@Override
	public boolean isTerm() {
		return true;
	}

	@Override
	public boolean isNorm() {
		return true;
	}
	
	public String toString() {
		return symbol;
	}
	
	
	
	

}
