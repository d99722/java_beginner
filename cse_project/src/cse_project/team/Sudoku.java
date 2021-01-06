package cse_project.team;

import java.util.Random;

public class Sudoku {
	private SudokuWriter writer;
	private int size = 4;
	private Cell[][] board = new Cell[size][size];
	private int[] row = new int[size];
	private int level;


	
	/** 스도쿠 보드 
	 * @param i - 스도쿠 레벨 */
	public Sudoku(int i) {
		level = i;
		board = makeBoard();
	}
	
	/** 스도쿠 보드 제작 */
	private Cell[][] makeBoard() {
		shuffleRow();
		
		/* 0번째 행 1,2,3,4*/
		/* 1번째 행 3,4,1,2*/
		/* 2번째 행 2,3,4,1*/
		/* 3번째 행 4,1,2,3*/
		
		row[0] = 1;
		row[1] = 2;
		row[2] = 3;
		row[3] = 4;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < size; j++) {
				board[j][i] = new Cell(row[(j+2*i)%4], this, writer);
			}
		}
		
		row[0] = 2;
		row[1] = 3;
		row[2] = 4;
		row[3] = 1;
		
		for(int i = 2; i < 4; i++) {
			for(int j = 0; j < size; j++) {
				board[j][i] = new Cell(row[(j+2*i)%4], this, writer);
			}
		}
		
		shuffleBoard(board);
		rotation(board);
		shuffleBoard(board);
		rotation(board);
		makeHole(level);
		
		return board;
		
	}
	
	/** 처음 한 줄 무작위 배열 */
	private void shuffleRow() {
		int temp[] = new int[size];
		System.arraycopy(row, 0, temp, 0, size);
		Random rand = new Random();
		for(int i = temp.length - 1; i > 0; i--) {
			int randIdx = rand.nextInt(i+1);
			int t = temp[randIdx];
			temp[randIdx] = temp[i];
		    temp[i] = t;
		}
		for(int i = 0; i < size; i++) {
			row[i] = temp[i];
		}
	}
	
	/** 규칙에 따라 보드 섞기 
	 * @param b - 섞을 보드 */
	public void shuffleBoard(Cell[][] b) {
		board = b;
		Cell[][] temp = new Cell[2][4];
		
		for(int i = 0; i < 2; i++) {
			int a = (int)(Math.random()*2);
			temp[0] = board[2*i];
			temp[1] = board[2*i+1];
			
			if(a == 0) {
				board[2*i] = temp[0];
				board[2*i+1] = temp[1];
			}
			else {
				board[2*i] = temp[1];
				board[2*i+1] = temp[0];
			}
		}
	}
	
	/** 보드 90도 회전 
	 * @param b - 회전시킬 보드 */
	private void rotation(Cell[][] b) {
		board = b;
		Cell[][] temp = new Cell[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++ ) {
				temp[i][j] = board[j][i];
			}
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++ ) {
				board[i][j] = temp[i][j];
			}
		}
	}

	/** 문제 보드에 빈칸 뚫기
	 *  @param b - 구멍 뚫을 보드
	 *  @param t - 난이도 */
	public void makeHole(int t) {
		int no_of_hole = 0;
		int num1 = 0;
		int num2 = 0;
		no_of_hole = t;

		if(t == 1) {
			no_of_hole = 6;
		}
		else if(t == 2) {
			no_of_hole = 8;
		}
		else if(t == 3){
			no_of_hole = 10;
		}
		// r에 구멍 만들기
		while(no_of_hole > 0) {
				num1 = (int)(Math.random() * 4);
				num2 = (int)(Math.random() * 4);
				if(board[num1][num2].numOf() != 0) {
					board[num1][num2].num0();
					no_of_hole--;
				}
			}
		}
	
	/** board 복사해서 리턴 */
	public Cell[][] board() {
		Cell[][] r = new Cell[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				r[i][j] = board[i][j];
			}
		}
		return r;
	}
	
	/** 검사 */
	public boolean check() {
		boolean result = false;
		
		
		
		return result;
	}
	
}
