import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NumberButton extends JButton implements ActionListener{
	
	private String tag;
	private int value;
	private NumberFrame ctrl;
	
	/** NumberButton 
	 * 버튼의 태그와 값을 저장하는 Construct 메서드
	 * @param t - 버튼의 tag 값
	 * @param v - 버튼의 value 값
	 * @param n - NumberFrame 클래스
	 * */
	public NumberButton(String t, int v, NumberFrame n) {
		tag = t;
		value = v;
		ctrl = n;
		addActionListener(this);
	}
	
	/** getTag tag 값을 리턴하는 메서드*/
	public String getTag() { return tag; }
	/** getTag value 값을 리턴하는 메서드*/
	public int getValue() { return value; }
	

	/** actionPerformed 메서드
	 * 버튼을 눌렀을 때 선택창의 버튼인지 입력창의 버튼인지 판단
	 * 판단 후 알맞는 이벤트 실행
	 * @param e - 액션 이벤트 */
	public void actionPerformed(ActionEvent e) {
		if (value == 0 && tag != "input") {
			JOptionPane.showMessageDialog(null, "Game을 종료합니다.");
			System.exit(0);
		} else if (value == 0 && tag == "input") {
			ctrl.dispose();
		} else if (tag == "continue") {
			ctrl.continueCtrl();
		} else if(tag == "level") {
			ctrl.levelCtrl(getValue());
		} else {
			ctrl.inputCtrl(getValue());
		}
		
	}
	

}
