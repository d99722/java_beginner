import java.awt.*;
import javax.swing.*;

/** SudokuFrame
 * view 클래스
 * 사용자에게 보여질 Sudoku판을 제작 */
public class SudokuFrame extends JFrame {
	
	private Sudoku sudoku;
	private CellButton[][] button;
	private int BUTTON_SIZE = 60;
	private int SIZE = 4;
	
	/** SudokuFrame 스도쿠 판을 제작하는 Construct 메서드 
	 * @param s - Sudoku보드를 만들고 연산을 시행하는 Sudoku 클래스 */
	public SudokuFrame(Sudoku s) {
		sudoku = s;
		button = new CellButton[SIZE][SIZE];
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(SIZE, SIZE));
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++) {
				button[i][j] = new CellButton(i, j, sudoku, this);
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
	
	/** checkLife 스도쿠 게임 중 남은 목숨을 확인하는 메서드. */
	public boolean checkLife() {
		if(sudoku.getLife() == 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER!");
			this.dispose();
			new NumberFrame(sudoku, this, 1);
			return true;
		}
		return false;
	}
	
	/** askNewGame 게임을 클리어 했을 때 새로운 게임을 시작할지 아닐지 확인하는 메서드. */
	public void askNewGame() {
		JOptionPane.showMessageDialog(null, "CLEAR!");
		this.dispose();
		new NumberFrame(sudoku, this, 1);
	}
	
	/** update
	 * board의 최신 정보를 받아와 다시 색칠해 보여주는 메서드
	 * 만약 모든 정답을 맞추었다면 새로운 게임 실행 */
	public void update() {
		setVisible(true);
		Cell[][] board = sudoku.getBoard();
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
		if(checkFinish(board)) {
			askNewGame();
		}
	}
	
	/** checkFinish
	 * board의 칸들을 탐색하며 모든 칸을 채웠는지 확인하는 메서드
	 * @param board - 대상 board
	 * @return - true : 모든 칸을 채웠을 때, false : 아직 빈 칸이 있을 때	 */
	public boolean checkFinish(Cell[][] board) {
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(board[i][j].getNum()==0)
					return false;
			}
		}
		return true;
	}
}
