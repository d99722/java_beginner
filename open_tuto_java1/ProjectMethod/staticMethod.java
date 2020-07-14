class Print {
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}
public class staticMethod {
	

	public static void main(String[] args) {
//		Print.a("-"); //Print 소속 : static을 넣어주어야 함 (class)
//		Print.b("-");
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a(); // t1 소속 : static을 빼주어야 함 (instance)
		t1.b();
		
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
	}
}
