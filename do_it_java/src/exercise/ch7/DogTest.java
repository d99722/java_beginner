package exercise.ch7;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("왈","진돗");
		dogs[1] = new Dog("왈2","포메");
		dogs[2] = new Dog("왈3","시츄");
		dogs[3] = new Dog("왈4","말티즈");
		dogs[4] = new Dog("왈5","치와와");
		
		for(int i=0; i<dogs.length;i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("");
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}

	}

}
