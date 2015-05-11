package week3;

import java.util.Arrays;

public class TempMedian {
	public static void main (String[] args){
		int i; double median;
		Integer[] v = new Integer [args.length];  
		v[0]=Integer.parseInt(args[0]);
		for(i=1;i<args.length;i++)
			if ((args[i]).equals(".")) v[i]=v[i-1];
				else if (args[i].equals("+")) v[i]=v[i-1]+1;
				else v[i]=v[i-1]-1;
		
		for(i=0;i<args.length;i++) {
			System.out.print(v[i]+" ");
		}

		Arrays.sort(v);
		
		
				
		System.out.println();
		
		for(i=0;i<args.length;i++) {
			System.out.print(v[i]+" ");
		}
		
		System.out.println();
		
		if (v.length %2 == 0) median = ( v[v.length/2 - 1] + v[ ( v.length / 2 ) ] )/2.0;
		else median = v[(v.length / 2)];
		
		System.out.println(median);
		
		
	}
}
