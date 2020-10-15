package algorithm;

public class Graph {
	public void floyd(int n, int[][] w, int[][] d) {
		int i,j,k;
		d = w;
		for(k=1; k<n; k++) {
			for(i=1; i<n; i++) {
				for(j=1; j<n; j++) {
					if (d[i][j]>900 && (d[i][k]+d[k][j])>900) {
						d[i][j] = 999;
					} else {
						d[i][j] = Math.min(d[i][j], (d[i][k]+d[k][j]));						
					}
					printPath(d);
					System.out.println();
				}
			}
		}
		printPath(d);
	}
	
	public void printPath(int[][] d) {
		for (int i=0; i<d.length; i++) {
			for(int j=0; j<d.length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] d = null;
		int[][] w = {{0,1,999,1,5},{9,0,3,2,999},{999,999,0,4,999},{999,999,2,0,3},{3,999,999,999,0}};
		Graph tester = new Graph();
		tester.floyd(5, w, d);
//		System.out.println(w.length);
	}
}
