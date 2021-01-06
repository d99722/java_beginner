package cse_project.team;

import java.awt.event.*;
import javax.swing.*;


public class Cell extends JButton implements ActionListener {
	
	private Sudoku sudoku;
	private SudokuWriter writer;
	private int num = 0;
	private int input = 0;
	private String s = "";

	
	/** 스도쿠 보드 한칸 
	 * @param i - 각 칸에 할당 될 숫자 1~9*/
	public Cell(int n, Sudoku s, SudokuWriter w) {
		num = n;
		sudoku = s;
		writer = w;
		addActionListener(this);
	}
	/** */
	/* 정답 보드와 내가 입력한 숫자를 비교할 방법이 있을까? 
	 * 
	 * 현재 오류 있음
	 * 
	 * */
	public void actionPerformed(ActionEvent e) {
		if(num != 0) {
			JOptionPane.showMessageDialog(null, "이미 숫자가 있습니다.");
		}
		else {
			s = JOptionPane.showInputDialog("숫자를 입력하세요.");
			input = Integer.parseInt(s);
			if(!(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 4)) {
				s = JOptionPane.showInputDialog("잘못된 값 입니다. 숫자를 다시 입력하세요.");
				input = Integer.parseInt(s);
			}
			else if(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 4) {
				
				
			}
		}
	}
	
	public void numChange(int i) {
		num = i;
	}
	
	public int numOf() {
		return num;
	}
	
	public void num0() {
		num = 0;
	}

}
