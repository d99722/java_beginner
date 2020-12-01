package lec7;

public class NumberTheory {

	public int isPrime(int n) {
		if(n<2)
			throw new RuntimeException("isPrime error : 부적절한 인수"+n);
		else {
			boolean item_found = false;
			int current = n/2;
			while(!item_found && current >1) {
				if(n%current == 0) {
					item_found = true;
				} else {
					current = current-1;
				}
			}
			if (item_found)
				return current;
			else
				return 1;
		}
	}
	
	public static void main(String[] args) {
		NumberTheory math = new NumberTheory();
		System.out.println(math.isPrime(7));
		System.out.println(math.isPrime(9));
		System.out.println(math.isPrime(389));
	}
}
