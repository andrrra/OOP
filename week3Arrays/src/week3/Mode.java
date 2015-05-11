package week3;

public class Mode {
	public static void main (String[] args) {
		Integer[] dataset = new Integer[args.length];
		Integer [] count = new Integer[10];
		int i; String x; int mode=0;
		for (i=0;i<=9;i++) count[i]=0;
		
		for(i=0;i<args.length;i++) {
			dataset[i]=Integer.parseInt(args[i]);
			count[dataset[i]]++;
		}
		
		for (i=0;i<=9;i++) {
				x = "";
				for (int j=1;j<=count[i];j++) x+=".";
				System.out.println("["+i+"s: "+count[i]+"] " + x);
				if (count[i]>=mode) mode=i;
		}
		
		System.out.println("Mode: "+mode);
		
		
	}

}
