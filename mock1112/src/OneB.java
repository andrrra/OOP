public class OneB {
  
    public static int longestSeq(int[] nums, int n) {
        // ADD CODE HERE
    	int s=0, max=0;
    	for (int i:nums){
    		if (i!=n) s=0;
    		else if (i==n) {
    			s++;
    			if (s>max) max=s;
    		}
    	}
    	return s;
    }
}
