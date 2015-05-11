package week2;

public class MultiplesLoopRange {
	public static void main (String[] args) {
		int x = Integer.parseInt (args[0]);
		int y = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]);
		int i;
		if (x<y) {
			for (i=x;i<=y;i++) 
				if (i%d==0) System.out.print(i+" ");
			}
		else if (x==y) {
			if (x%d==0) System.out.print(x);
			}
		else {
			for (i=x;i>=y;i--) 
				if ( i%d == 0 ) System.out.print(i+" ");
			}
	}
}
