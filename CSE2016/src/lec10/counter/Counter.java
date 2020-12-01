package lec10.counter;

public class Counter {
	
	private int count;
	
	public Counter(int start) {
		count = start;
	}
	
	public void increment() {
		count++;
	}
	
	public int countOf() {
		return count;
	}

}
