/** Cell
 * 할당된 숫자를 기억하는 한 칸 Cell 클래스 */
public class Cell {
	
	/** field
	 * int number - 칸에 할당된 숫자 */
	private int number;
	
	/** Cell (Constructor)
	 * 칸에 숫자를 할당해 줌
	 * @param i - 칸에 할당될 숫자 */
	public Cell(int i) {
		number = i; 
	}
	
	public int getNum() { return number; }
	public void setNum(int i) {	number = i; }
	
}
