package hw5;

/** ClockController
 * Controller */
public class ClockController {
	
	private ClockWriter writer;
	
	public ClockController(ClockWriter w) {
		writer = w;
	}
	
	/** runAnimation
	 * 1초 간격으로 다시 그림	 */
	public void runAnimation() {
		int painting_delay = 1;
		while(true) {
			delay(painting_delay);
			writer.repaint();
		}
	}
	
	/** delay
	 * 지연 시간 설정
	 * @param how_long - 지연 시간	 */
	private void delay(int how_long) {
		try {Thread.sleep(how_long);}
		catch (InterruptedException e) {}
	}
}
