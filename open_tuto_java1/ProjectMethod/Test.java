class Print {
	public String delimiter;
	public String letter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println(this.letter);
		System.out.println(this.letter);
	}
}
public class Test {
	

	public static void main(String[] args) {
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.letter = "a";
		t1.a();
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.letter = "b";
		t2.a();
	}
}
