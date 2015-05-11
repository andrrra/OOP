public class OneC {

	public static int [] remove( int [] a, int b ) {
		int n=0;
		for(int i=0;i<a.length;i++){
			if (a[i]==b) n++;
		}
		int[] r = new int[a.length-n];
		n=0;
		for (int i=0;i<a.length;i++){
			if (a[i]!=b){
				r[n]=a[i];
				n++;
			}
		}
		return r;
	}
}
