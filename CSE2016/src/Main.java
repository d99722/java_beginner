import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		int count = 0;
		int newN = n/100*100;
				
		while (newN%f != 0) {
			newN++;
			count++;
		}
		
		if (count<10) {
			System.out.println("0"+count);
		} else {
			System.out.println(count);
		}
	}
}
