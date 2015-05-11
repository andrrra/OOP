
public class Position {
	
	private int pageNo, lineNo;
	
	public Position(){
		pageNo=1;
		lineNo=1;
	}
	
	public int getPageNo(){
		return pageNo;
	}
	public void setPageNo(int n){
		this.pageNo=n;
	}
	public int getLineNo(){
		return lineNo;
	}
	public void setLineNo(int n){
		this.lineNo=n;
	}
	public void advance(int n){
		if (n+this.lineNo<=25) this.lineNo+=n;
		else {
			while (n+this.lineNo>25){
				pageNo++;
				n-=25;
			}
			lineNo+=n;
		}
	}
	public String toString(){
		return ("Page: "+this.pageNo+ " Line: "+this.lineNo);
	}
	public static void main (String[] args){
		Position p = new Position();
		p.setLineNo(4);
		p.setPageNo(3);
		p.advance(83);
		System.out.print(p);
		
	}


}
