/** SudokuStarter
 * 실행 클래스
 * @author 1조 : 이동근, 이준우 */
public class SudokuStarter {

	public static void main(String[] args) {
		Sudoku s = new Sudoku();
		SudokuFrame f = new SudokuFrame(s);
		new NumberFrame(s, f, 3);
	}
	
}
