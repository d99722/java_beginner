package dynamic_programming;

public class ZeroOneKSP {
	
	private int[] profit;
	private int[] weight;
	private int max_weight;
	private int current_weight;
	private int[][] ksp;
	
	public ZeroOneKSP(int[] p, int[] w, int mw) {
		profit = p;
		weight = w;
		max_weight = mw;
		current_weight = max_weight;
		ksp = new int[p.length+1][mw+1];
	}
	
	public void ksp() {
		for(int i=3; i>0;) {
			for(int w=30; w>0;  ) {
				System.out.println(i+","+w);
				if(weight[i]>w) {
					ksp[i][w] = ksp[i-1][w];
				} else {
					if(profit[i]+ksp[i-1][w-weight[i]]>ksp[i-1][w]) {
						ksp[i][w] = profit[i]+ksp[i-1][w-weight[i]];
						i -= 1;
						w -= weight[i];
					}
					else
						ksp[i][w] = ksp[i-1][w];
				}
				System.out.println(ksp[3][30]);
			}
		}		
	}
	
	public static void main(String[] args) {
		int[] profit = {0, 50,60,140};
		int[] weight = {0, 5,10,20};
		
		ZeroOneKSP z = new ZeroOneKSP(profit, weight, 30);
		z.ksp();
	}
	
}
