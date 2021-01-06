package dynamic_programming;

public class Floyd {

	public double[][] shortest(int n, double w[][]) {
		double[][] d = w;
		int[][] p = new int[5][5];
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(d[i][j]>d[i][k]+d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
						p[i][j] = k+1;
					}
					else
						d[i][j] = d[i][j];
				}
			}
		}
		printArr(p);
		printPath(p, 5, 3);
		System.out.println();
		return d;
	}

	public void printPath(int[][] p, int i, int j) {
		if(p[i-1][j-1]!=0) {
			printPath(p, i, p[i-1][j-1]);
			System.out.println(p[i-1][j-1]);
			printPath(p,p[i-1][j-1],j);
		}
	}
	
	
	public void printArr(int[][] d) {
		for (int i=0; i<d.length; i++) {
			for(int j=0; j<d[0].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public void printArr(double[][] d) {
		for (int i=0; i<d.length; i++) {
			for(int j=0; j<d[0].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		double inf = Double.POSITIVE_INFINITY;
		double[][] w = {{0,1,inf,1,5},{9,0,3,2,inf},{inf,inf,0,4,inf},{inf,inf,2,0,3},{3,inf,inf,inf,0}};
		Floyd f = new Floyd();
		double[][] d = f.shortest(w.length, w);
		f.printArr(d);
	}
	
}
