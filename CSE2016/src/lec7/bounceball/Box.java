package lec7.bounceball;

public class Box {
	
	private int BOX_SIZE;
	
	/** Constructor Box
	 * 상자 생성
	 * @param size - 상자의 크기	 */
	public Box(int size) {
		BOX_SIZE = size;
	}
	
	/** inHorizontalContact
	 * 공이 x축 방향으로 좌/우 벽에 도달 여부를 리턴
	 * @param x_position - 공의 x좌표
	 * @return 공의 좌표가 벽과 같거나 벗어나 있으면 true, 그렇지 않으면 false	 */
	public boolean inHorizontalContact(int x_position) {
		return (x_position <= 0) || (x_position >= BOX_SIZE);
	}
	
	/** inVerticalContact
	 * 공이 y축 방향으로 상/하 벽에 도달 여부를 리턴
	 * @param y_position - 공의 x좌표
	 * @return 공의 좌표가 벽과 같거나 벗어나 있으면 true, 그렇지 않으면 false	 */
	public boolean inVerticalContact(int y_position) {
		return (y_position <= 0) || (y_position >= BOX_SIZE);
	}
	
	/** sizeOf
	 * 	상자의 크기를 리턴
	 * @return - 상자의 크기 */
	public int sizeOf() {
		return BOX_SIZE;
	}

}
