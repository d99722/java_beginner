package lec7_lab6;

/** BounceController - 상자 안에서 움직이는 공 제어 */
public class BounceController { 
	private MovingBall ball1;  // 공 객체 (Model)
	private MovingBall ball2;  // 공 객체 (Model)
	private Box box;
	private AnimationWriter writer; // 애니메이션 객체 (Output-View)

	private int left;
	private int right;
	private int top;
	private int bottom;
	
	/** Constructor BounceController 컨트롤러 초기화 
	 * @param b1 - 공1 객체 (Model)
	 * @param b2 - 공2 객체 (Model)
	 * @param b - 박스 객체 (Model)
	 * @param w - 애니메이션 객체 (Output-View)  */
	public BounceController(MovingBall b1, MovingBall b2, Box b, AnimationWriter w) { 
		ball1 = b1;
		ball2 = b2;
		box = b;
		writer = w;
		
		left = box.sizeOf()/10*4;
		right = box.sizeOf()/10*6;
		top = box.sizeOf()/10*5;
		bottom = box.sizeOf()/30*16;
	}

	/** distance
	 * 공 사이의 거리를 계산해주는 메서드
	 * @param x1 - 공1의 x좌표
	 * @param y1 - 공1의 y좌표
	 * @param x2 - 공2의 x좌표
	 * @param y2 - 공2의 y좌표
	 * @return - 공1과 공2 사이의 거리	 */
	public double distance(int x1, int y1, int x2, int y2) {
		int x_distance = Math.abs(x1-x2);
		int y_distance = Math.abs(y1-y2);
		double square = Math.pow(x_distance, 2) + Math.pow(y_distance, 2);
		double distance = Math.sqrt(square);
		return distance;
	}
	
	/** boxTopCheck
	 * 장애물의 상단과 부딪혔는지 확인
	 * @param b - 확인할 공
	 * @return - true : 부딪혔을 때, false : 부딪히지 않았을 때	 */
	public boolean boxTopCheck(MovingBall b) {
		if(left<=b.xPosition() && b.xPosition()<=right && Math.abs(top-b.yPosition())<=b.radiusOf())
			return true;
		else
			return false;
	}
	
	/** boxBottomCheck
	 * 장애물의 하단과 부딪혔는지 확인
	 * @param b - 확인할 공
	 * @return - true : 부딪혔을 때, false : 부딪히지 않았을 때	 */
	public boolean boxBottomCheck(MovingBall b) {
		if(left<=b.xPosition() && b.xPosition()<=right && Math.abs(bottom-b.yPosition())<=b.radiusOf())
			return true;
		else
			return false;
	}
	
	/** runAnimation - 내부 시계를 활용하여 애니메이션 구동 */
	public void runAnimation() { 
		int time_unit = 1;    // 애니메이션 스텝의 시간 단위 
		int painting_delay = 20;  // 다시 그리기 사이의 지연 시간 간격
		while (true) { 
			delay(painting_delay);
			if(boxTopCheck(ball1) || boxBottomCheck(ball1)) {ball1.changeDirectionY();}
			if(boxTopCheck(ball2) || boxBottomCheck(ball2)) {ball2.changeDirectionY();}
			double distance = distance(ball1.xPosition(), ball1.yPosition(), ball2.xPosition(), ball2.yPosition());
			if(distance<=ball1.radiusOf()+ball2.radiusOf()) {
				ball1.changeDirection();
				ball2.changeDirection();
			}
			
            ball1.move(time_unit);
            ball2.move(time_unit);
            System.out.println("A -- "+ball1.xPosition() + ", " + ball1.yPosition());
            System.out.println("B -- "+ball2.xPosition() + ", " + ball2.yPosition());
            writer.repaint();
        }
	}

	/** delay - how_long millisecond 동안 실행 정지  */
	private void delay(int how_long) { 
		try { Thread.sleep(how_long); }
		catch (InterruptedException e) { }
	}
}

