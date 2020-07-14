package test;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("살짝 점프합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("못돌지롱.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("The AdvancedLevel User");
		
	}

}
