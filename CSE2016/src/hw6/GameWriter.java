package hw6;

import java.awt.*;
import javax.swing.*;


public class GameWriter extends JPanel{
	private Cell[][] board;
	private int size;
	private int piece_size = 30;
	private int panel_width;
	private int panel_height;
	
	/** GameWriter
	 * 생성자 - 기초배경 작업
	 * @param b - 작업할 Cell[][] */
	public GameWriter(Cell[][] b) {
		board = b;
		size = b.length;
		panel_width = piece_size * size + piece_size*2;
		panel_height = piece_size * size + piece_size*2;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Life Game");
		f.setSize(panel_width, panel_height+22);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/** paintComponent
	 * 각 cell을 상황에 맞게 칠해주는 메서드 */
	public void paintComponent(Graphics g) {
		for (int i=0; i!=size; i++) {
			for(int j=0; j!=size; j++)
				paintCell(g, board[j][i], i, j);
		}
	}
	
	/** paintCell
	 * 각 cell을 칠하고, alive한 cell이라면 내부를 색칠
	 * @param g - Graphics g
	 * @param c - 칠할 cell
	 * @param i - cell의 row
	 * @param j - cell의 col	 */
	private void paintCell(Graphics g, Cell c, int i, int j ) {
		int x_pos = piece_size + (piece_size * i);
		int y_pos = piece_size + (piece_size * j);
		g.setColor(Color.black);
		g.drawRect(x_pos, y_pos, piece_size, piece_size);
		if(c.checkAlive())
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
	}
}
