public class OneB {

    public static double meanColSums(int[][] matrix) {
    	int colnr=matrix[0].length;
    	int r = 0;
    	for(int i=0;i<colnr;i++){
    		for(int j=0;j<matrix.length;j++){
    			r+=matrix[j][i];
    		}
    	}
    	return((double) r/colnr);
    } 
    
    public static void main(String[] args){
    	System.out.println(meanColSums (new int[][] {{12,1},{2,5},{8,1}} ));
    	System.out.println(meanColSums (new int[][] {{12,1,14}, {2,5,5}, {8,1,2}} ));
    	System.out.println(meanColSums (new int[][] {{1,0,0,0,0}} ));
    	System.out.println(meanColSums (new int[][] {{0}} ));
    }
}
