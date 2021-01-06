import javax.swing.*;
import java.awt.event.*;

/** CellButton
 * 사용자의 스도쿠 버튼 선택과 관련하여 프로그램 컨트롤 */
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
	
	
	/** CellButton (Constructor)
	 * 버튼 자신의 행, 열 정보를 기억하는 CellButton 클래스  
	 * @param i - row 정보
	 * @param j - col 정보
	 * @param s - model 객체
	 * @param f - view 객체 */
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
	
	public int getRow() { return row; }
	public int getCol() { return col; }
	
}
