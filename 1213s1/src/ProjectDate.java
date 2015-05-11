
public class ProjectDate {
	
	private int weekNo, dayNo;
	
	public ProjectDate(){
		this.weekNo=0;
		this.dayNo=1;
	}
	
	public int getWeekNo(){
		return weekNo;
	}
	
	public void setWeekNo(int n){
		this.weekNo=n;
	}
	
	public int getDayNo(){
		return dayNo;
	}
	
	public void setDayNo(int n){
		if (n>=1 && n<=5) this.dayNo=n;
	}
	
	public void advance (int n){
		this.dayNo+=n;
		while (this.dayNo>5){
			this.weekNo++;
			this.dayNo-=5;
		}
	}
	
	public String toString(){
		return "Week: "+this.getWeekNo()+" Day: "+this.getDayNo();
	}
	
	public static void main(String[] args){
		ProjectDate a = new ProjectDate();
		a.setDayNo(5);
		a.setWeekNo(2);
		a.advance(7);
		System.out.println(a);
	}

}
