package dynamic_programming;

public class MinimumMultiple {
	
	public int[][] minmult(int n, int[] d){
		int[][] m = new int[d.length][d.length-1];
		int j = 0;
		int min = 9999999;
		
		for(int i=0; i<n; i++)
			m[i][i] = 0;
		
		for(int diag=1; diag<=n; diag++) {
			for(int i=0; i<=n-diag; i++) {
				j=i+diag;
				for(int k=i; k<j; k++) {
					if(m[i][k]+m[k+1][j]+d[i]*d[k+1]*d[j+1] < min) {
						min = m[i][k]+m[k+1][j]+d[i]*d[k+1]*d[j+1];
						m[i][j] = min;
					}
				}
				min=9999999;
			}
		}
		
		return m;
	}
	
	public void printArr(int[][] d) {
		for (int i=0; i<d.length; i++) {
			for(int j=0; j<d[0].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		int[] d = {5,2,3,4,6,7,8};
		MinimumMultiple m = new MinimumMultiple();
		int[][] result = m.minmult(d.length-2, d);
		m.printArr(result);
	}

}
