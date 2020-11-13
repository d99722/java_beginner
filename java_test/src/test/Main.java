package test;

class Movie {
	public void rating() {
		System.out.println("rating of movie");
	}
	public void reserve() {
		System.out.println("reserve");
	}
}

class DeepMovie extends Movie{

	@Override
	public void rating() {
		System.out.println("rating of deep movie");
	}
	
	public void deep() {
		System.out.println("deep");
	}
	
	
}


public class Main {
	public static void main(String[] args) {
		Movie m = new Movie();
		m.rating();
		m.reserve();
//		m.deep();
		
		System.out.println("***********");
		DeepMovie dm = new DeepMovie();
		dm.rating();
		dm.reserve();
		dm.deep();
		System.out.println("***********");

		m = new DeepMovie();
		m.rating();
		m.reserve();
//		m.deep();
		
//		am = new Movie();
	}

}
