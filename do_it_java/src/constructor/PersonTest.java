package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		personKim.name = "동";
		personKim.height = 153.0F;
		personKim.weight = 70;
		
		Person personLee = new Person("갱", 172, 79.5F);
		System.out.println(personLee.height);

	}

}
