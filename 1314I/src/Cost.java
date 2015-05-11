
public class Cost {
	
	private int amount;
	private String currency;
	
	public Cost() {
		this.amount=0;
		this.currency ="pounds sterling";	
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void setAmount(int n){
		if (n>0) 
			this.amount=n;
	}
	
	public String getCurrency(){
		return currency;
	}
	
	public void setCurrency(String s){
		if (s.equals("pounds sterling")||s.equals("euros")||s.equals("US dollars"))
			this.currency=s;
	}
	
	public void convert(String newCurrency, double rate){
		if (newCurrency.equals("pounds sterling")||newCurrency.equals("euros")||newCurrency.equals("US dollars")){
			setCurrency(newCurrency);
			setAmount((int) (getAmount()/rate));
		}
	}
	
	public String toString() {
		return getAmount()+" "+getCurrency();
	}
	

}
