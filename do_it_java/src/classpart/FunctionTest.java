package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1+"+"+num2+"="+sum);
		
		int n1 = minus(num1, num2);
		System.out.println(n1);
		
		int n2 = multiply(num1, num2);
		System.out.println(n2);
		
		double n3 = divide(num1, num2);
		System.out.println(n3);

	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double divide(double n1, double n2) {
		if (n2 == 0) {
			return 0;
		}
		double result = n1 / n2;
		return result;
	}

}
