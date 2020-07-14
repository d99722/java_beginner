public class Test {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5};
		double sum = 0;
		double[] avgNumbers = new double[5];
		for (int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
			avgNumbers[i] = sum/(i+1);
		}
		for (double n : avgNumbers) {
			System.out.println(n);
		}
		
	}
}