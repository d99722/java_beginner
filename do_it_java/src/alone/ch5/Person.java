package alone.ch5;

public class Person {
	int age;
	String name;
	boolean married;
	int numberOfKids;
	
	public static void main(String[] args) {
		Person james = new Person();
		james.age = 40;
		james.name = "James";
		james.married = true;
		james.numberOfKids = 3;
		
		System.out.println("나이 : "+james.age);
		System.out.println("이름 : "+james.name);
		System.out.println("결혼 여부 : "+james.married);
		System.out.println("자녀 수 : "+james.numberOfKids);
	}
}