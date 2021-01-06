package cse_project.team;

import java.awt.*;
import javax.swing.*;

public class SudokuWriter extends JFrame {
	private Sudoku sudoku;
	private Cell[][] board;
	private int button_size = 60;
	private int size = 4;
	
	
	/** */
	public SudokuWriter(Sudoku s) {
		sudoku = s;
		board = sudoku.board();
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(size, size));
		
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				cp.add(board[j][i]);
			}
		
		this.update();
		setTitle("Sudoku Puzzle");
		setSize(size * button_size + 10, size * button_size + 10);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/** 보드 상태 업데이트 */
	public void update() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(board[j][i].numOf() != 0) {
					board[j][i].setBackground(Color.white);
					board[j][i].setText("" + (board[j][i].numOf()));
				}
				else {
					board[j][i].setBackground(Color.white);
					board[j][i].setText("");
				}
					
			} 
		}
	}
	
	/** */
	public void displaySudoku() {
		this.repaint();
	}
}
