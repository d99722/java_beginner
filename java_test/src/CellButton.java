import javax.swing.*;
import java.awt.event.*;

/** CellButton
 * Controller 역할을 하게 될 스도쿠 버튼 클래스 */
public class CellButton extends JButton implements ActionListener{
	
	/** field
	 * int row - 버튼이 위치한 row 정보
	 * int col - 버튼이 위치한 col 정보
	 * Sudoku model - model 객체
	 * SudokuFrame view - view 객체 */
	private int row;
	private int col;
	private Sudoku model;
	private SudokuFrame view;
	
	
	/** CellButton
	 * 버튼 자신의 행, 열 정보를 기억하는 CellButton 클래스  
	 * @param i - i번째 행
	 * @param j - j번째 열
	 * @param s - Sudoku보드를 만들고 연산 시행
	 * @param f - Sudoku 보드 그리기 */
	public CellButton(int i, int j, Sudoku s, SudokuFrame f) {
		row = i;
		col = j;
		model = s;
		view = f;
		addActionListener(this);
	}
	
	@Override
	/** actionPerformed
	 * 클릭 발생 시, 정답인지 확인하여, 맞다면 view를 update */
	public void actionPerformed(ActionEvent e) {
		if(model.getBoard()[row][col].getNum()!=0) {
			JOptionPane.showMessageDialog(null, "이미 숫자가 있습니다");
		} else {
			new NumberFrame(model, view, 4, this);
		}
	}
	
	/** getRow
	 * row 정보 return
	 * @return - row 정보 */
	public int getRow() { return row; }
	
	/** getCol
	 * col 정보 return
	 * @return - col 정보 */
	public int getCol() { return col; }
	
}
