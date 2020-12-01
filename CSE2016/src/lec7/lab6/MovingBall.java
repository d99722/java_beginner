package lec7.lab6;

/** MovingBall - 2차원 상자에서 움직이는 공 */
public class MovingBall {
	private int x_pos; // 공의 중심 x 좌표 
	private int y_pos; // 공의 중심 y 좌표 
	private int radius; // 공의 반지름 
	
	private int x_velocity; // 속도 x축 
	private int y_velocity; // 속도 y축 
	
	private Box container;
	
	/** Contructor MovingBall - 공 만들기 
	 * @param x_initial - 공의 중심 x 좌표
	 * @param y_initial - 공의 중심 y 좌표
	 * @param r - 공의 반지름 
	 * @param box - 공이 살고 있는 상자
	 * @param x_velo - 공의 x축 속도
	 * @param y_velo - 공의 y축 속도 */
	public MovingBall(int x_initial, int y_initial, int r, Box box, int x_velo, int y_velo) {
		x_pos = x_initial;
		x_pos = y_initial;
		radius = r;
		container = box;
		x_velocity = x_velo;
		y_velocity = y_velo;
	}
	
	/** xPosition - 공의 x축 위치 리턴 */
	public int xPosition() {
		return x_pos;
	}
	
	/** yPosition - 공의 y축 위치 리턴 */
	public int yPosition() {
		return y_pos;
	}
	
	/** radiusOf - 공의 반지름 리턴 */
	public int radiusOf() {
		return radius;
	}
	
	
	/** move - time_unit 만큼 공을 이동, 벽에 부딪치면 방향을 바꿈
	 * @param time_units - 프레임 사이의 시간 */
	public void move(int time_units) {
		x_pos = x_pos + x_velocity * time_units;
		if (container.inHorizontalContact(x_pos))
			x_velocity = - x_velocity;
		y_pos = y_pos + y_velocity * time_units;
		if (container.inVerticalContact(y_pos))
			y_velocity = - y_velocity;
	}
	
	/** changeDirection
	 * 공의 상하좌우 방향 전환	 */
	public void changeDirection() {
		x_velocity = -x_velocity;
		y_velocity = -y_velocity;
	}
	
	/** changeDirectionY
	 * 공의 상하 방향 전환	 */
	public void changeDirectionY() {
		y_velocity = -y_velocity;
	}
	
}


