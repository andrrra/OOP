package week4;

public class ArrayFront9 {
	
	public static boolean arrayFront9(int[] nums) {
		int ok=0;
		if (nums.length<4) {
			for (int i =0;i<nums.length;i++) {
				if (nums[i]==9) ok=1;
			}
		}
		else if ( (nums[0]==9) || (nums[1]==9) || (nums[2]==9) || (nums[3]==9)) ok=1;
			else ok=0;
		if (ok==1) return true;
		else return false;

	}
	
	public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }

}
