package java_tutorials.abstractclass.example1;
abstract class A{
	public abstract int b();
	
//	public abstract int C() {
//		System.out.println("Hello");
//	}
	
	public void d() {
		System.out.println("world");
	}
	
}

class B extends A{
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();
		System.out.println(obj.b());
		obj.d();

	}

}
