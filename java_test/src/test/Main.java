package test;

public class Main {
	public void forTest() {
		int count = 0;
		for(count=0; count<3; count++) {
			System.out.println(count);
		}
		System.out.println(count+" at the end");
	}
	
	public void whileTest() {
		int count = 0;
		while(count<3) {
			count++;
			System.out.println(count);
		}
		System.out.println(count+" at the end");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.forTest();
		m.whileTest();
	}

}
