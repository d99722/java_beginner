package java_tutorials.overloading;


public class OverloadingDemo2 extends OverloadingDemo {
	
	void A (String arg1, String arg2) {
		System.out.println(("sub class : void"));
	}
	
	void A () {
		System.out.println("sub : void A()");
	}

	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("co everybody");
		od.A("co,","co");

	}

}
