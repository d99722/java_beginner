package hw6;

public class Cell {
	
	private boolean alive;
	
	/** Cell
	 * 생성메서드 - 초기값 false로 초기화 */
	public Cell() {
		alive = false;
	}
	
	/** makeAlive
	 * alive값을 true로 바꿔주는 메서드 */
	public void makeAlive() {
		alive = true;
	}
	
	/** checkAlive
	 * Cell의 alive값 리턴
	 * @return - alive */
	public boolean checkAlive() {
		return alive;
	}
}
