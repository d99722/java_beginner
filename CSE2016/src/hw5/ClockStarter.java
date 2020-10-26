package hw5;

/** 구동메서드
 * @author donggeun */
public class ClockStarter {
	public static void main(String[] args) {
		Clock clock = new Clock();
		ClockWriter writer = new ClockWriter(clock);
		new ClockController(writer).runAnimation();
	}

}
