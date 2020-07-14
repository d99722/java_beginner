package exercise.ch6;

public class People {
	public String name;
	public int money;
	
	public People(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void drinkStar(Starbucks star, int value) {
		System.out.println(name+"님이 별다방 커피를 마셨습니다.");
		star.drink(value);
		this.money -= value;
	}
	
	public void drinkBean(Beanbucks bean, int value) {
		System.out.println(name+"님이 콩다방 커피를 마셨습니다.");
		bean.drink(value);
		this.money -= value;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 잔고는 "+money+"원 입니다.");
	}
	
	public static void main(String[] args) {
		People kim = new People("kim",10000);
		People lee = new People("lee",8000);
		Starbucks star = new Starbucks();
		Beanbucks bean = new Beanbucks();
		kim.drinkStar(star, 1000);
		kim.drinkBean(bean, 1500);
		kim.showInfo();
		lee.drinkBean(bean, 8000);
		lee.showInfo();
		star.showInfo();
		bean.showInfo();
	}

}
