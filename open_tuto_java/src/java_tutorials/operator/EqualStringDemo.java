package java_tutorials.operator;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
	}

}
