package java_tutorials.scope;

class C {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v);
		System.out.println(v);
	
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
