import java.util.*;
import javax.swing.*;

/** Sudoku
 * model 클래스
 * 보드를 만들고 정답보드를 저장, 그 외 다양한 연산 수행 */
public class Sudoku {
	
	/** field
	 * int SIZE - 한 줄의 길이
	 * int life - 목숨의 수
	 * Cell[][] board - 사용자가 풀 보드
	 * Cell[][] answer_board - 정답 보드 */
	private int SIZE = 4;
	private int life = 5;
	private Cell[][] board = new Cell[SIZE][SIZE];
	private Cell[][] answer_board = new Cell[SIZE][SIZE];
	
	
	/** Sudoku (Constructor)
	 * 스도쿠 판을 제작하는 Construct 메서드 
	 * makeBoard()를 이용해 기본 틀을 만들고 규칙에 따라 랜덤하게 셔플 */
	public Sudoku() {
		board = makeBoard();
		shuffle(board);
		rotation(board);
		shuffle(board);
		rotation(board);
		answer_board = copyBoard(board);
	}
	
	/** makeBoard
	 * base 보드를 제작하는 메서드.
	 * shuffle된 첫 줄의 원소를 기준으로 2~4번째 줄의 원소를 지정.
	 * @return board - base board */
	private Cell[][] makeBoard() {
		
		// line 1 + shuffle
		for(int i=0; i<SIZE; i++)
			board[0][i] = new Cell(i+1);
		Collections.shuffle(Arrays.asList(board[0]));
		
		// line 2
		for(int i=0; i<SIZE; i++)		
			board[1][i] = new Cell(board[0][(i+2)%4].getNum());

		// line 3
		board[2][0] = new Cell(board[0][1].getNum());
		board[2][1] = new Cell(board[0][0].getNum());
		board[2][2] = new Cell(board[0][3].getNum());
		board[2][3] = new Cell(board[0][2].getNum());

		// line 4
		for(int i=0; i<SIZE; i++)		
			board[3][i] = new Cell(board[2][(i+2)%4].getNum());		
		
		return board;
	}
	
	/** shuffle
	 * 1~2번째 줄, 3~4번째 줄 각각에 대하여 독립적으로 random하게 shuffle하는 메서드
	 * @param c - 섞어줄 board */
	private void shuffle(Cell[][] c) {
		Cell[][] temp_board = copyBoard(c);
		Cell[][] top = {temp_board[0], temp_board[1]};
		Cell[][] bottom = {temp_board[2],temp_board[3]};
		Collections.shuffle(Arrays.asList(top));
		Collections.shuffle(Arrays.asList(bottom));
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c.length; j++) {
				if(i<2)
					board[i][j] = top[i][j];
				else
					board[i][j] = bottom[i-2][j];
			}
		}		
	}
	
	/** rotation
	 * 이차원 배열에 대하여 transpose 해주는 메서드
	 * @param c - transpose 해줄 board */
	private void rotation(Cell[][] c) {
		Cell[][] temp = new Cell[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++ ) {
				temp[i][j] = c[j][i];
			}
		}
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++ ) {
				c[i][j] = temp[i][j];
			}
		}
	}
	
	/** copyBoard
	 * 인자로 받은 board를 복사해주는 메서드
	 * @param c - 복사할 대상 board
	 * @return copied_board - 복사가 된 board */
	private Cell[][] copyBoard(Cell[][] c) {
		Cell[][] copied_board = new Cell[c.length][c[0].length];
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[0].length; j++) {
				copied_board[i][j] = new Cell(c[i][j].getNum());
			}
		}
		return copied_board;
	}
	
	/** makeHole
	 * 인자로 받은 빈 칸의 갯수에 맞춰 스도쿠에 빈 칸을 만드는 메서드
	 * @param num_of_holes - 빈 칸의 갯수 */
	public void makeHole(int num_of_holes) {
		while (num_of_holes>0) {			
			int i = (int)(Math.random()*SIZE);
			int j = (int)(Math.random()*SIZE);
			if (board[i][j].getNum() != 0) {
				board[i][j].setNum(0);
				num_of_holes--;
			}
		}
	}
	
	/** identify
	 * 사용자로부터 입력 받은 수가 정답보드의 수와 같은지 확인하는 메서드
	 * @param row - 정답을 시도할 칸의 행 정보
	 * @param col - 정답을 시도할 칸의 열 정보
	 * @return - true : 정답과 입력이 같을 때, false : 정답과 입력이 다를 때 */
	public boolean identify(int input, int row, int col) {
		int answer_num = answer_board[row][col].getNum();
		if(input == answer_num)
			board[row][col].setNum(input);
		else {
			life--;
			if(life == 0) {
				return false;
			}
			JOptionPane.showMessageDialog(null, "정답이 아닙니다. 다시 입력하세요.\nLIFE : "+life);
			return false;
		}
		return true;
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
	
	/** checkLife
	 * 목숨을 확인하여, 0이라면 새로운 게임을 진행할지 물어봄
	 * @param f - view 객체
	 * @return - true : 목숨이 0일 때, false : 아직 목숨이 남아있을 때
	 */
	public boolean checkLife(SudokuFrame f) {
		if(getLife() == 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER!");
			f.dispose();
			new NumberFrame(this, f, 1);
			return true;
		}
		return false;
	}
	
	/** askNewGame
	 * 새로운 게임을 진행할지 물어보는 메서드
	 * @param f - view 객체 */
	public void askNewGame(SudokuFrame f) {
		JOptionPane.showMessageDialog(null, "CLEAR!");
		f.dispose();
		new NumberFrame(this, f, 1);
	}
	
	public Cell[][] getBoard() { return board; }
	public int getLife() { return life; }
	
}
