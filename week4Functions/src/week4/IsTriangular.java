package week4;

public class IsTriangular {
	
	public static boolean isTri(double a, double b, double c){
		if ((a+b<=c)||(a+c<=b) || (b+c<=a)) return false;
		return true;
	}
	
	public static void main(String[] args) {
//		library pulling some dumb shit
//	    double a = StdIn.readDouble();
//	    double b = StdIn.readDouble();
//	    double c = StdIn.readDouble();
		
		int N = args.length;
		double[] nums = new double[N];
		for(int i = 0; i<N; i++){
		    nums[i] = Double.parseDouble(args[i]);
		}


		if (isTri(nums[0], nums[1], nums[2])) {
		    System.out.printf("%s, %s and %s could be the lengths of a triangle\n", nums[0], nums[1], nums[2]);
		} 
		else {
		    System.out.println("Not a triangle.");
	    }
	}
}


