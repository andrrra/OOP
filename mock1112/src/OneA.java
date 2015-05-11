public class OneA {

    public static double geometricMean(int[] nums) {
        // ADD CODE HERE
    	int k=1; 
    	for(int n:nums)
    		k*=  n;
    	return Math.pow(k, 1.0/nums.length);
    }
}
