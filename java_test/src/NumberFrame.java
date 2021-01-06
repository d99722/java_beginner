import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class NumberFrame extends JFrame {
	
	private String msg;
	private Sudoku model;
	private SudokuFrame view;
	private CellButton button;
	private int BUTTON_SIZE = 100;
	
	/** NumberFrame 난이도 등의 선택창을 그리는 Construct 메서드 
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
				buttons[i] = new NumberButton("continue",i,this);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
		} else if(size == 3) {
			msg = "select level";
			for(int i=0; i<=size; i++) {
				buttons[i] = new NumberButton("level", i, this);
				buttons[i].setFocusPainted(false);
				buttons[i].setFocusable(false);
			}
		} else {
			msg = "select input";
			for(int i=0; i<=size; i++) {
				buttons[i] = new NumberButton("input", i, this);
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
	/** NumberFrame Sudoku 게임의 한 칸에 대한 선택창을 그리는 Construct 메서드 
	 * @param s - Sudoku보드를 만들고 연산을 시행하는 Sudoku 클래스
	 * @param f - Sudoku판을 그리는 SudokuFrame 클래스
	 * @param size - 버튼의 개수. 개수에 따라 선택창의 역할이 달라짐. 
	 * @param b - CellButton 클래스*/
	public NumberFrame(Sudoku s, SudokuFrame f, int size, CellButton b) {
		this(s,f,size);
		button = b;		
	}
	
	/** levelCtrl 게임 난이도를 설정하는 메서드
	 * @param value - 난이도 값*/
	public void levelCtrl(int value) {
		if(value == 1) {
			model.makeHole(6);
			view.update();
			this.dispose();
		} else if (value == 2) {
			model.makeHole(8);
			view.update();
			this.dispose();
		} else {
			model.makeHole(10);
			view.update();
			this.dispose();
		}
	}
	
	/** inputCtrl 입력된 값이 정답과 같은지 확인하는 메서드. 만약 틀릴경우 Life 1 감소.
	 * @param value - 입력할 값 */
	public void inputCtrl(int value) {
		if(model.identify(value, button.getRow(), button.getCol())) {
			view.update();
			this.dispose();
		} else {
			if(view.checkLife())
				this.dispose();
		}
	}
	
	/** continueCtrl 게임을 재시작 했을때 보드를 새로 보여주는 메서드 */
	public void continueCtrl() {
		this.dispose();
		Sudoku s = new Sudoku();
		SudokuFrame f = new SudokuFrame(s);
		new NumberFrame(s, f, 3);
	}

}
