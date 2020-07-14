package cooperation;

public class Taxi {
	int driverCode;
	int money;
	
	public Taxi(int driverCode) {
		this.driverCode = driverCode;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(driverCode+"번 택시의 수입은 "+money+"원 입니다.");
	}
}
