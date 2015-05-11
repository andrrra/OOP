
public class Length {
	
	private int number; 
	private String units;
	
	public Length() {
		this.number=0;
		this.units="km";
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int n) {
		if (n>0) this.number=n;
	}
	
	public String getUnits() {
		return units;
	}
	
	public void setUnits(String s) {
		if (s.equals("km")||s.equals("miles")||s.equals("minutes")) this.units=s;
	}
	
	public void convert (String newUnits, double rate){
		if (newUnits.equals("km")||newUnits.equals("miles")||newUnits.equals("minutes")) {
			setUnits(newUnits);
			setNumber((int)Math.round(getNumber()/rate));
		}
	}
	
	public String toString () {
		return number+" "+units;
	}

}
