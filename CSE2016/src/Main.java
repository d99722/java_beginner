import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int sum = 0;
	
	public int recur(int a, int b) {
		if (a==1) {
			sum += b;
		} else {
			while (a!=b+1) {
				recur(a-1, b-1);
				b--;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Main ma = new Main();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		for (int i = count; i>0; i--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			results.add(ma.recur(a,b));
			sum = 0;
		}
		
		for (int result : results) {
			System.out.println(result);
		}
		
	}	
}