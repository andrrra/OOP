package week4;

public class ArrayOps {
	
    public static double findMax(double[] data) {
        double max=data[0];
        for(int i=1;i<data.length;i++) {
        	if (data[i]>data[0]) max = data[i];
        }
        return max;
    }

    public static double[] normalise(double data[]) {
       double s=0.0;
       for(int i =0;i<data.length;i++){
    	   s+=data[i];
       }
       double [] newA = new double[data.length];
       for(int i=0;i<data.length;i++){
    	   newA[i]=data[i]/s;
       }
       return newA;
    }

    public static void normaliseInPlace(double data[]) {
    	double s=0.0;
        for(int i =0;i<data.length;i++){
     	   s+=data[i];
        }
        for(int i =0;i<data.length;i++){
        	data[i]/=s;
        }
    }

    public static double[] reverse(double[] data) {
    	double[] newA = new double[data.length]; 
        for(int i=data.length-1;i>=0;i--) {
        	newA[data.length-1-i]=data[i];
        }
        return newA;
    }

    public static void reverseInPlace(double[] data) {
    	double temp;
        for(int i =0;i<=(data.length/2)-1;i++) {
        	temp=data[i];
        	data[i]=data[data.length-i-1];
        	data[data.length-i-1]=temp;
       }
    }

    public static void swap(double[] data1, double[] data2) {
    	double temp;
    	for (int i=0;i<data1.length;i++) {
    		temp = data1[i];
    		data1[i]=data2[i];
    		data2[i]=temp;
    	}
    }

}
