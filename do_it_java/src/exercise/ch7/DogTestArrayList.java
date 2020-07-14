package exercise.ch7;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("왈","진돗"));
		dogs.add(new Dog("왈2","포메"));
		dogs.add(new Dog("왈3","시츄"));
		dogs.add(new Dog("왈4","말티즈"));
		dogs.add(new Dog("왈5","치와와"));
		
		for(int i =0; i<dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}
