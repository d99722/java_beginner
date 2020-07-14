public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One"); // String
		System.out.println(1); // integer
		System.out.println(true); // boolean
		System.out.println(false); // boolean
		
		String foo = "Hello world";
		// String true = "Hello world"; -> 불가능... reserved word
		
		System.out.println(foo.contains("world"));
		System.out.println(foo.contains("dgboy"));
		// contains - 해당 문자열이 포함되어있는가? > boolean return

	}

}
