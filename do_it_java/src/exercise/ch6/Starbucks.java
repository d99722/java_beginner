package exercise.ch6;

public class Starbucks {
	public int m=0;
	public void drink(int money) {
		m += money;
	}
	public void showInfo() {
		System.out.println("별다방의 수입은 "+m+"원 입니다.");
	}

}
