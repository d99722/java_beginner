package test;

public class StarCounter {

	public static void main(String[] args) {
		int lineCount = 7;
		
		
		for(int i=1; i<=lineCount; i+=2) {
			for(int q = 1; q<=(lineCount-i)/2; q++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int q = (lineCount-i)/2; q>=1; q--) {
				System.out.print(" ");
			}
			System.out.println("");
			
		}
	}

}
