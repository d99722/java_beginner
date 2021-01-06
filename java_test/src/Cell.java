/** Cell
 * 할당된 숫자를 기억하는 한 칸 Cell 클래스 */
public class Cell {
	
	/** field
	 * int number - 칸에 할당된 숫자 */
	private int number;
	
	/** Cell (Constructor)
	 * @param i - 칸에 할당될 숫자 */
	public Cell(int i) {
		number = i; 
	}
	
	/** getNum
	 * 이 칸의 number return
	 * @return - 이 칸의 number */
	public int getNum() { return number; }
	
	/** setNum() 이 칸의 숫자 변경
	 * @param i - 변경할 숫자 */
	public void setNum(int i) {	number = i; }
	
}
