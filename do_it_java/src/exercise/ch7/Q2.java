package exercise.ch7;

public class Q2 {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0;i<alphabets.length; i++, ch++) {
			alphabets[i]=ch;
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println((char)(alphabets[i]+32)+", "+(int)(alphabets[i]+32));
		}
		
		
	}

}
