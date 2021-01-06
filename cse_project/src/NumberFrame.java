import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/** NumberFrame
 * 사용자가 숫자를 선택할 때와 관련된 view 클래스 */
public class NumberFrame extends JFrame {
	
	/** field
	 * String msg - 사용자에게 보여줄 메세지
	 * Sudoku model - model 객체
	 * SudokuFrame view - view 객체
	 * CellButton button - 선택된 버튼
	 * int BUTTON_SIZE - 버튼의 크기 */
	private String msg;
	private Sudoku model;
	private SudokuFrame view;
	private CellButton button;
	private int BUTTON_SIZE = 100;
	
	/** NumberFrame (Constructor)
	 * 다양한 숫자 선택창을 만드는 메서드
	 * @param s - Sudoku보드를 만들고 연산을 시행하는 Sudoku 클래스
	 * @param f - Sudoku판을 그리는 SudokuFrame 클래스
	 * @param size - 버튼의 개수. 개수에 따라 선택창의 역할이 달라짐. */
	public NumberFrame(Sudoku s, SudokuFrame f, int size) {
		model = s;
		view = f;
		NumberButton[] buttons = new NumberButton[size+1];

		if(size == 1) {
			msg = "new game?";
			for(int i=0; i<=size; i++) {
				buttons[i] = new NumberButton("continue",i, model, view, this);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
		} else if(size == 3) {
			msg = "select level";
			for(int i=0; i<=size; i++) {
				buttons[i] = new NumberButton("level", i, model, view, this);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
		} else {
			msg = "select input";
			for(int i=0; i<=size; i++) {
				buttons[i] = new NumberButton("input", i, model, view, this);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
		}
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		
		
		for (int i=1; i<=size; i++) {
			if(size == 1) {
				buttons[i].setText("New Game");
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}else {				
				buttons[i].setText(""+i);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
			p1.add(buttons[i]);
		}
		
		buttons[0].setText("EXIT");
		buttons[0].setFocusPainted(false);
		buttons[0].setFocusable(false);
		if(size == 4)
			buttons[0].setText("CLOSE");
			buttons[0].setFocusPainted(false);
			buttons[0].setFocusable(false);
		p2.add(buttons[0]);
		
		cp.add(p1, BorderLayout.CENTER);
		cp.add(p2, BorderLayout.SOUTH);
		
		setTitle(msg);
		setSize((size*BUTTON_SIZE)+20, BUTTON_SIZE + 20);
		setVisible(true);
		setLocation(700, 350);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	/** NumberFrame (Constructor)
	 * 다양한 숫자 선택창을 만드는 메서드
	 * @param s - Sudoku보드를 만들고 연산을 시행하는 Sudoku 클래스
	 * @param f - Sudoku판을 그리는 SudokuFrame 클래스
	 * @param size - 버튼의 개수. 개수에 따라 선택창의 역할이 달라짐. 
	 * @param b - CellButton 클래스*/
	public NumberFrame(Sudoku s, SudokuFrame f, int size, CellButton b) {
		this(s,f,size);
		button = b;
	}
	
	public CellButton getButton() { return button; }
	
	

}
