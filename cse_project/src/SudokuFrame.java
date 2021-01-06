import java.awt.*;
import javax.swing.*;

/** SudokuFrame
 * 사용자에게 보여질 스도쿠 보드와 관련 된 view 클래스 */
public class SudokuFrame extends JFrame {
	
	/** field
	 * Sudoku model - model 객체
	 * CellButton[][] - CellButton 2차원 배열
	 * int BUTTON_SIZE - button 크기
	 * int SIZE - 한 줄의 크기 */
	private Sudoku model;
	private CellButton[][] button;
	private int BUTTON_SIZE = 60;
	private int SIZE = 4;
	
	/** SudokuFrame (Constructor)
	 * 사용자에게 보여질 스도쿠 판을 그리는 메서드
	 * @param s - model 객체 */
	public SudokuFrame(Sudoku s) {
		model = s;
		button = new CellButton[SIZE][SIZE];
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(SIZE, SIZE));
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++) {
				button[i][j] = new CellButton(i, j, model, this);
				button[i][j].setFocusPainted(false);
				button[i][j].setFocusable(false);
				cp.add(button[i][j]);
			}
		setTitle("Sudoku Game");
		setSize(SIZE * BUTTON_SIZE + 20, SIZE * BUTTON_SIZE + 20);
		setLocation(770, 450);
		setVisible(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/** update
	 * board의 최신 정보를 받아와 다시 색칠해 보여주는 메서드
	 * 만약 모든 정답을 맞추었다면 새로운 게임 실행 */
	public void update() {
		setVisible(true);
		Cell[][] board = model.getBoard();
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				button[i][j].setOpaque(true);
				button[i][j].setBackground(Color.white);
				if((i<2 && j>1) || (i>1 && j<2))
					button[i][j].setBackground(Color.lightGray);
				if(board[i][j].getNum() != 0) {
					button[i][j].setText("" + (board[i][j].getNum()));
				}
				else {
					button[i][j].setText("");
				}
			} 
		}
		if(model.checkFinish(board)) {
			model.askNewGame(this);
		}
	}
	
	
	
	
}
