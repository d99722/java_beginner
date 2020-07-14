package exercise.ch7;

public class Q3 {
	public static void main(String[] args) {
		int[] even = new int[] {2,4,6,8,10};
		int total = 0;
		for(int num : even) {
			total += num;
		}
		System.out.println(total);
	}

}
