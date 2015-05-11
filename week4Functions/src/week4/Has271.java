package week4;

public class Has271 {
	public static boolean has271(int[] nums){
		int ok=0;
		for(int i=0;i<nums.length-2;i++){
			if (( nums[i]+5==nums[i+1] ) && (nums[i]-1==nums[i+2])) ok=1;
		}
		if (ok==0) return false;
			else return true;
	}
	
	public static void main (String[] args){
		int [] nums = new int[args.length];
		for (int i=0;i<args.length;i++){
			nums[i]=Integer.parseInt(args[i]);
		}
		System.out.println(has271(nums));
	}

}
