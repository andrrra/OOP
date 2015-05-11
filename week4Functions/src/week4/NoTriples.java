package week4;

public class NoTriples {
	public static boolean noTriples(int[] nums) {
		int ok=1;
		if (nums.length<3) ok=1;
		else if (nums.length==3 && nums[0]==nums[1] && nums[0]==nums[2]) ok=0;
		else {	
			for (int i =0;i<nums.length-2;i++){
				if ((nums[i]==nums[i+1]) && (nums[i]==nums[i+2])) ok=0;
				}
			}
		if (ok==0) return false;
		else return true; 
	}
	
	public static void main (String[] args){
		int[] nums = new int[args.length];
		for(int i=0;i<args.length;i++){
			nums[i]=Integer.parseInt(args[i]);
		}
		System.out.println(noTriples(nums));
	}

}
