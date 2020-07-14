package exercise.ch4;

public class Q4 {

	public static void main(String[] args) {
		for (int line=1; line<=4; line++) {
			for (int space=0; space<4-line; space++) {
				System.out.print(" ");
			}
			for (int star=1; star<=(2*line)-1; star++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
