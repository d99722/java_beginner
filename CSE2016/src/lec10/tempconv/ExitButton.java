package lec10.tempconv;

import java.awt.event.*;
import javax.swing.*;

public class ExitButton extends JButton implements ActionListener {
	
	/** ExitButton - 종료 컨트롤러 
	 * @param my_label - 버튼에 붙는 라벨 */
	public ExitButton(String my_label) {
		super(my_label);
		addActionListener(this);
	}
	
	/** actionPerformed - '버튼 누르기' 액션 이벤트를 처리
	 * @param e - 이벤트  */
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
