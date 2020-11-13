package lec8;

public class SlidePuzzleBoard {
	private int size;
	private PuzzlePiece[][] board;
	private int empty_row;
	private int empty_col;
	
	public SlidePuzzleBoard(int s) {
		size = s;
		board = new PuzzlePiece[s][s];
		for (int num = 1; num!=s*s; num++) {
			PuzzlePiece p = new PuzzlePiece(num);
			int row = num / size;
			int col = num % size;
			board[size-1-row][size-1-col] = p;
		}
		empty_row = 3;
		empty_col = 3;
	}
	
	public boolean move(int w) {
		final int NOT_FOUND = -1;
		int row = NOT_FOUND;
		int col = NOT_FOUND;		
		if(found(w,empty_row-1,empty_col)) {
			row = empty_row-1;
			col = empty_col;
		}else if(found(w,empty_row+1,empty_col)) {
			row = empty_row+1;
			col = empty_col;
		}else if(found(w,empty_row,empty_col-1)) {
			row = empty_row;
			col = empty_col-1;
		} else if(found(w,empty_row,empty_col+1)) {
			row = empty_row;
			col = empty_col+1;
		}
		if (row != NOT_FOUND) {
			board[empty_row][empty_col] = board[row][col];
			empty_row = row;
			empty_col = col; 
			board[empty_row][empty_col] = null;
		}
		return row!=NOT_FOUND;

	}
	
	public boolean found(int v, int row, int col) {
		/*
		if(row==-1 || row==board.length || col==-1 || col==board.length) {
			return false;
		}
		return board[row][col].valueOf() == v;
		*/
		try {
			return board[row][col].valueOf() == v;
		} catch (Exception e) {
			return false;
		}
	}
	
	public PuzzlePiece[][] contents() {
		return board;
	}
	
}
