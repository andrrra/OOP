
public class QuestionOneTester {
	
	public static void main (String[] args){
		int[] a = {1,2,3};
		System.out.println(OneA.harmonicMean(a));
		double[] b = {3,3,6,2,8,9};
		double[] b2=OneB.movingAvg(b,3);
		for(double i:b2)
			System.out.print(i+" ");
		
	}

}
