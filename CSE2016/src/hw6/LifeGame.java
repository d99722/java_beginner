package hw6;

public class LifeGame {
	
	private Cell[][] board;
	
	/** LifeGame
	 * int 생성자 - size크기의 기본 Cell[][] 생성
	 * @param size - Cell[][] 가로세로 길이	 */
	public LifeGame(int size) {
		makeBoard(size);
	}
	
	/** LifeGame
	 * char 생성자 - cmd에 맞는 Cell[][] 생성
	 * @param cmd - 생성할 형태의 커맨드 */
	public LifeGame(char cmd) {
		if(cmd == 'b') {
			makeBoard(5);
			for(int i=1; i<4; i++)
				board[2][i].makeAlive();
		}
		
		if(cmd=='t') {
			makeBoard(6);			
			for (int i=2; i<5; i++)
				board[2][i].makeAlive();
			for (int i=1; i<4; i++)
				board[3][i].makeAlive();
		}
		
		if(cmd=='l') {
			makeBoard(6);
			board[1][1].makeAlive();
			board[1][2].makeAlive();
			board[2][1].makeAlive();
			board[3][4].makeAlive();
			board[4][3].makeAlive();
			board[4][4].makeAlive();
		}
		
		if(cmd=='p') {
			makeBoard(17);
			board[2][4].makeAlive();
			board[2][5].makeAlive();
			board[2][11].makeAlive();
			board[2][12].makeAlive();
			board[3][5].makeAlive();
			board[3][6].makeAlive();
			board[3][10].makeAlive();
			board[3][11].makeAlive();
			board[4][2].makeAlive();
			board[4][5].makeAlive();
			board[4][7].makeAlive();
			board[4][9].makeAlive();
			board[4][11].makeAlive();
			board[4][14].makeAlive();
			board[5][2].makeAlive();
			board[5][3].makeAlive();
			board[5][4].makeAlive();
			board[5][6].makeAlive();
			board[5][7].makeAlive();
			board[5][9].makeAlive();
			board[5][10].makeAlive();
			board[5][12].makeAlive();
			board[5][13].makeAlive();
			board[5][14].makeAlive();
			board[6][3].makeAlive();
			board[6][5].makeAlive();
			board[6][7].makeAlive();
			board[6][9].makeAlive();
			board[6][11].makeAlive();
			board[6][13].makeAlive();
			board[7][4].makeAlive();
			board[7][5].makeAlive();
			board[7][6].makeAlive();
			board[7][10].makeAlive();
			board[7][11].makeAlive();
			board[7][12].makeAlive();
			board[9][4].makeAlive();
			board[9][5].makeAlive();
			board[9][6].makeAlive();
			board[9][10].makeAlive();
			board[9][11].makeAlive();
			board[9][12].makeAlive();
			board[10][3].makeAlive();
			board[10][5].makeAlive();
			board[10][7].makeAlive();
			board[10][9].makeAlive();
			board[10][11].makeAlive();
			board[10][13].makeAlive();
			board[11][2].makeAlive();
			board[11][3].makeAlive();
			board[11][4].makeAlive();
			board[11][6].makeAlive();
			board[11][7].makeAlive();
			board[11][9].makeAlive();
			board[11][10].makeAlive();
			board[11][12].makeAlive();
			board[11][13].makeAlive();
			board[11][14].makeAlive();
			board[12][2].makeAlive();
			board[12][5].makeAlive();
			board[12][7].makeAlive();
			board[12][9].makeAlive();
			board[12][11].makeAlive();
			board[12][14].makeAlive();
			board[13][5].makeAlive();
			board[13][6].makeAlive();
			board[13][10].makeAlive();
			board[13][11].makeAlive();
			board[14][4].makeAlive();
			board[14][5].makeAlive();
			board[14][11].makeAlive();
			board[14][12].makeAlive();
		}
	}
	
	/** makeBoard
	 * 기본 Cell[][]을 제작하는 메서드
	 * @param size - Cell[][]의 가로 세로 길이 */
	private void makeBoard(int size){
		board = new Cell[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				board[i][j] = new Cell();
			}
		}
	}
	
	/** getBoard
	 * Cell[][]을 리턴해주는 메서드
	 * @return - Cell[][] */
	public Cell[][] getBoard(){
		return board;
	}
	
	/** change
	 * 세대가 올라갈 때의 변화를 계산하는 메서드 */
	public void change() {
		Cell[][] temp = new LifeGame(board.length).getBoard();
	
		for(int row=0; row<board.length; row++) {
			for(int col=0; col<board.length; col++) {
				int cnt = adjacentCheck(row, col);
				
				if(board[row][col].checkAlive()) {
					temp[row][col].makeAlive();
					if(cnt!=2 && cnt!=3)
						temp[row][col]=new Cell();
				} else {
					if(cnt==3)
						temp[row][col].makeAlive();
				}
			}
		}
		
		for(int row=0; row<board.length; row++) {
			for(int col=0; col<board.length; col++)
				board[row][col] = temp[row][col];
		}
	}
	
	/** adjacentCheck
	 * 인접한 8개의 Cell 중 alive한 Cell의 갯수를 count하는 메서드
	 * @param row - 중앙 Cell의 row
	 * @param col - 중앙 Cell의 col
	 * @return - 주위의 alive한 cell의 갯수 */
	public int adjacentCheck(int row, int col) {
		int cnt = 0;
		
		if(row-1 != -1 && col-1 !=-1) {
			if(board[row-1][col-1].checkAlive())
				cnt++;					
		}
		if(row-1 != -1) {
			if(board[row-1][col].checkAlive())
				cnt++;
		}
		if(row-1 != -1 && col+1 != board.length) {
			if(board[row-1][col+1].checkAlive())
				cnt++;
		}
		if(col-1 != -1) {
			if(board[row][col-1].checkAlive())
				cnt++;
		}
		if(col+1 != board.length) {
			if(board[row][col+1].checkAlive())
				cnt++;
		}
		if(row+1 != board.length && col-1 != -1) {
			if(board[row+1][col-1].checkAlive())
				cnt++;
		}
		if(row+1 != board.length) {
			if(board[row+1][col].checkAlive())
				cnt++;
		}
		if(row+1 != board.length && col+1 != board.length) {
			if(board[row+1][col+1].checkAlive())
				cnt++;
		}
		return cnt;
	}
	
	/* 
	// test
	public static void main(String[] args) {
		
		LifeGame g = new LifeGame('t');
		Cell[][] board = g.getBoard();
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j].checkAlive()+" ");
			}
			System.out.println();
		}
		g.change();
		System.out.println();
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j].checkAlive()+" ");
			}
			System.out.println();
		}
		
	}
	*/
	
}
