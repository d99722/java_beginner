
public class DrawArt {

	public static void main(String[] args) {
		AsciiArtWriter writer = new AsciiArtWriter();
		System.out.println("ASCII Arts");
		System.out.println();
		writer.printBee();
		writer.printBee("hi");
		writer.printBee("hi","hello");
		writer.printButterfly();
		writer.printLadybug();
	}

}
