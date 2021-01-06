import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/** NumberButton
 * 사용자의 숫자 선택과 관련하여 프로그램을 컨트롤 */
public class NumberButton extends JButton implements ActionListener{
	
	
	/** field
	 * String tag - 버튼의 용도를 구분할 태그
	 * (level - 게임 시작 시 고르는 레벨과 관련, input - 게임 중 사용자의 선택과 관련, continue - 게임 후 재게임 여부와 관련)
	 * Sudoku model - model 객체
	 * SudokuFrame view - view 객체
	 * NumberFrame select_view - 두 번째 view 객체 */
	private String tag;
	private int value;
	private Sudoku model;
	private SudokuFrame view;
	private NumberFrame select_view;
	
	/** NumberButton (Constructor)
	 * tag와 value를 갖고 있는 NumberButton 생성
	 * @param t - tag
	 * @param v - value
	 * @param s - model 객체
	 * @param f - view 객체
	 * @param n - 두 번째 view 객체
	 */
	public NumberButton(String t, int v, Sudoku s, SudokuFrame f, NumberFrame n) {
		tag = t;
		value = v;
		model = s;
		view = f;
		select_view = n;
		addActionListener(this);
	}

	/** actionPerformed 메서드
	 * 버튼을 눌렀을 때 선택창의 버튼인지 입력창의 버튼인지 판단
	 * 판단 후 알맞는 이벤트 실행
	 * @param e - 액션 이벤트 */
	public void actionPerformed(ActionEvent e) {
		if (value == 0 && tag != "input") {
			JOptionPane.showMessageDialog(null, "Game을 종료합니다.");
			System.exit(0);
		} else if (value == 0 && tag == "input") {
			select_view.dispose();
		} else if (tag == "continue") {
			continueCtrl();
		} else if(tag == "level") {
			levelCtrl(getValue());
		} else {
			inputCtrl(getValue());
		}
		
	}
	
	/** levelCtrl 
	 * 게임 난이도를 설정하는 메서드
	 * @param value - 난이도 값*/
	public void levelCtrl(int value) {
		if(value == 1) {
			model.makeHole(6);
			view.update();
			select_view.dispose();
		} else if (value == 2) {
			model.makeHole(8);
			view.update();
			select_view.dispose();
		} else {
			model.makeHole(10);
			view.update();
			select_view.dispose();
		}
	}
	
	/** inputCtrl 
	 * 입력된 값이 정답과 같은지 확인하는 메서드. 만약 틀릴경우 Life 1 감소.
	 * @param value - 입력할 값 */
	public void inputCtrl(int value) {
		if(model.identify(value, select_view.getButton().getRow(), select_view.getButton().getCol())) {
			view.update();
			select_view.dispose();
		} else {
			if(model.checkLife(view))
				select_view.dispose();
		}
	}
	
	/** continueCtrl 
	 * 게임을 재시작 했을때 보드를 새로 보여주는 메서드 */
	public void continueCtrl() {
		select_view.dispose();
		Sudoku s = new Sudoku();
		SudokuFrame f = new SudokuFrame(s);
		new NumberFrame(s, f, 3);
	}
	
	public String getTag() { return tag; }
	public int getValue() { return value; }
	

}
