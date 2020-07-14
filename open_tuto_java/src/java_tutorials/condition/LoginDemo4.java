package java_tutorials.condition;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("egoing") || id.equals("dgboy") || id.equals("gang")) 
				&& password.equals("1111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
