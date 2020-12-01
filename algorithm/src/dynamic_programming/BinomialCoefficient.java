package dynamic_programming;

public class BinomialCoefficient {
	
	public int Calculate(int n, int k) {
		int[][] b = new int[n+1][k+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=k; j++) {
				System.out.println(i+", "+j);
				if(j==0 || j==i)
					b[i][j] = 1;
				else {
					try {
						b[i][j] = b[i-1][j-1] + b[i-1][j];						
					} catch (Exception e) {
						b[i][j] = 0;
					} 
				}
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		return b[n][k];
	}
	
	public static void main(String[] args) {
		System.out.println(new BinomialCoefficient().Calculate(4, 2));
	}

}
