package may1213s1;

public class ProjectDate {
	private int weekNo;
	private int dayNo;
	public ProjectDate(){
		weekNo=0;
		dayNo=1;
	}
	public int getWeekNo(){
		return weekNo;
	}
	void setWeekNo(int n){
		this.weekNo=n;
	}
	int getDayNo(){
		return dayNo;
	}
	void setDayNo(int n){
		if (n>=1 && n<=5) this.dayNo=n;
	}
	public void advance(int n){
		if (n>0) {
			if (n<=5){
				if (dayNo+n<=5) dayNo+=n;
			}
			else {
				while (n>5){
					n-=5;
					weekNo++;
					
				}
				if (dayNo+n<=5) dayNo+=n;
				else {
					weekNo++;
					n-=5;
					dayNo+=n;
				}
			}
		}
	}
	public String toString(){
		return ("Week: "+weekNo+"  Day: "+dayNo);
	}
	public static void main(String[] args){
		ProjectDate p = new ProjectDate();
		p.setDayNo(3);
		p.setWeekNo(7);
		System.out.println(p); 
		p.advance(23);
		System.out.println(p);
	}



}
