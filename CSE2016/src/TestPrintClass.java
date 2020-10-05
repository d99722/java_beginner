
public class TestPrintClass {
	public static void main(String[] args) {
		PrintClass p = new PrintClass();
		p.printB();
		p.printB();
		new PrintClass().printB();
		PrintClass q = p;
		q.printB();
	}
}
