package week3;

public class Sieve {
	
	public static void main (String[] args){
		int i, p=2;
		Integer[] sieved_numbers = new Integer[19];
	
		for (i=2;i<=20;i++) 
			sieved_numbers[i-2]=i;
		
		while (p<20) {
			for (i=0;i<18;i++) 
				if (sieved_numbers[i]%p==0 && sieved_numbers[i]!=p) sieved_numbers[i]=0;
			if (p>2) p+=2;
			else p++;
		}
		
		for (i=0;i<18;i++) 
			if (sieved_numbers[i]!=0) System.out.print(sieved_numbers[i]+" ");
		
	}

}
