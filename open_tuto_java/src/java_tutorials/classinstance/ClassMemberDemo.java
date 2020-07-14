package java_tutorials.classinstance;

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
		// 클래스 메소드가 클래스 변수에 접근 - 가능 
	}
	
	static void static_instace() {
//		System.out.println(instance_variable);
		// 클래스 메소드가 인스턴스 변수에 접근 - 불가능 
	}
	
	void instance_static() {
		System.out.println(static_variable);
		// 인스턴스 메소드가 클래스 변수에 접근 - 가능 
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
		// 인스턴스 메소드가 인스턴스 변수에 접근 - 가능 
	}
}
public class ClassMemberDemo {

	public static void main(String[] args) {
		// *인스턴스를 이용한 접근* 
		C1 c = new C1();
		c.static_static();
		c.static_instance();
		c.instance_static();
		c.instance_instance();
		
		C1.static_static();
		C1.static_instance();
		C1.instance_static();
		C1.instance_instance();

	}

}
