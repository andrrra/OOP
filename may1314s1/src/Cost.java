
public class Cost {
	
	private int amount;
	private String currency;
	private static final String ps = "pounds sterling", us = "US dollars",	eu = "euros";
	
	
	public Cost() {
		amount = 0;
		currency = "pounds sterling";
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int n){
		if (n>0) this.amount=n;
	}
	public String getCurrency(){
		return currency;
	}
	public void setCurrency(String s){
		if (s.equals(ps) || (s.equals(us)) || (s.equals(eu))) this.currency=s;
	}
	public void convert(String newCurrency, double rate){
		if (newCurrency.equals(ps)||newCurrency.equals(us)||newCurrency.equals(eu)) {
			this.currency=newCurrency;
			setCurrency(newCurrency);
			setAmount((int)Math.round((double) amount/rate));
		}
	}
	public String toString(){
		return amount+" "+currency;
	}

}
