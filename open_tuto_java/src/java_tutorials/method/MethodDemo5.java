package java_tutorials.method;

public class MethodDemo5 {
	
	public static void numbering(int init, int limit) {
		int i = init;
		while (i<limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(3,5);
		numbering(2,10);

	}

}