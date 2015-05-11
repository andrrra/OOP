package week5ObjectsAndDataTypes;

public class NbyN {

	public static int[][] nbyn(int N) {
		if (N==0) return null; 
		else {
		int i, j;
		int [][] matrix = new int [N][N];
		for (i=0;i<N;i++){
			for(j=0;j<N;j++){
				if (i==j) matrix[i][j]=i;
				else matrix[i][j]=0;
			}
		}
		return matrix;}
	}

	public static void main (String[] args) {
		int N = 10;
		int[][] mat;
		mat = nbyn(N);
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat.length; ++j)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
}