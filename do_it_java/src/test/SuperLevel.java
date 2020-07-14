package test;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("날라댕깁니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("천장뚫어");
		
	}

	@Override
	public void turn() {
		System.out.println("돌아뻐려~");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*S*U*P*E*R**L*E*V*E*L**Users");
		
	}

}
