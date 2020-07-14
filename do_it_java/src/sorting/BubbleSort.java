package sorting;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("Bubble Sort Ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("Bubble Sort Descending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Bubble Sort 입니다.");
	}
}
