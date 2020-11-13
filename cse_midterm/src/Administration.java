import javax.swing.JOptionPane;

public class Administration {
	
	private Session session;
	
	public Administration(Session s) {
		session = s;
	}

	/** serviceOn
	 * 입력창을 통하여 서비스를 선택, 제공
	 * 서비스는 무한정 반복되며, Cancel버튼을 누르면 종료한다.	 */
	public void serviceOn() {
		String message, input;
		char command;
		boolean processing = true;
		while (processing) {
			message = "다음 중 하나를 입력하세요: T(시험), +(덧셈연습), x(곱셈연습)";
			input = JOptionPane.showInputDialog(message);
			// 서비스 선택
			// Cancel 버튼을 누르면 루프를 빠져나와 서비스를 끝내야 한다.
			// 힌트: Cancel 버튼을 선택하면 (input == null) 조건을 만족한다.
			// 주의: 문자열의 비교는 == 가 아닌 equals 메소드를 써야 한다.
			if(input == null) {
				processing = false;
			} else {
				command = input.charAt(0);
				if(command=='T') {
					session.test();
				} else if (command=='+') {
					session.practice("+");
				} else if (command=='x') {
					session.practice("x");
				} else {
					JOptionPane.showMessageDialog(null, "입력오류");
				}
			}
		}
	}

}
