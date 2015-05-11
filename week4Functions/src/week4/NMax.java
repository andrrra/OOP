package week4;

public class NMax {
	
	public static int max(int a, int b, int c){
		if ((a>=b)&(a>=c)) return a;
		else if ((b>=c)&(b>=a)) return b;
		else return c;
		
	}
	
	public static double max(double x, double y, double z){
		if ((x>=y)&(x>=z)) return x;
		else if ((y>=z)&(y>=x)) return y;
		else return z;
	}
	
	public static void main (String[] args){
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		double z = StdIn.readDouble();
		
		System.out.println (max(x,y,z));
		
	}

}
