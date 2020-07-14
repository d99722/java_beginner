package java_tutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		System.out.println("switch(3)");
		switch(3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		int val = 3;
		if (val == 1) {
			System.out.println("one");
		} else if (val == 2) {
			System.out.println("two");
		} else if (val == 3){
			System.out.println("three");
		}

	}

}
