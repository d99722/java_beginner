package cse_project.team;

import javax.swing.JOptionPane;

public class SudokuStarter {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("난이도를 선택해주세요. 1 : 쉬움 2: 중간 3: 어려움");
		int level = Integer.parseInt(input);
		while(level != 1 && level != 2 && level != 3) {
			input = JOptionPane.showInputDialog("난이도를 선택해주세요. 1 : 쉬움 2: 중간 3: 어려움");
		}
		
		Sudoku sudoku = new Sudoku(level);
		new SudokuWriter(sudoku);
	}

}
