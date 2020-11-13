import javax.swing.JOptionPane;

public class Session {

	/** test
	 * 무작위 덧셈/곱셈 문제를 5개 만들어 입력창으로 시험
	 * 결과를 100점 만점으로 환산하여 출력창에 보여줌	 */
	public void test() {
		String op, message, input;
		Question q;
		int score = 0;
		for (int i = 1; i <= 5; i++) {
			// 50% 확률로 연산자 선택하기
			if (Math.random() < 0.5)
				op = "+";
			else
				op = "x";
			// 문제 풀기
			q = new Question(op);
			message = "[문제 "+i+"] "+q.leftOperand()+op+q.rightOperand()+"?";
			input = JOptionPane.showInputDialog(message);
			if (Integer.parseInt(input)==q.correctAnswer()) {
				score++;
			}
		}
		// 시험 성적 보여주기
		score *= 20;
		JOptionPane.showMessageDialog(null,"어린이의 산수 시험 성적은 "+score+"점 입니다.");		
	}

	/** practice
	 * 인수 op가 지정한 대로 곱셈 또는 덧셈 문제를 무작위로 5개 만들어 계산 연습을 시킴
	 * 오답인 경우 정답을 맞출 때 까지 반복
	 * @param op - 사용자 입력 operand	 */
	public void practice(String op) {
		Question q;
		String equation, input;
		for (int i = 1; i <= 5; i++) {
			// 1 문제 연습 서비스
			q = new Question(op);
			equation = q.leftOperand()+op+q.rightOperand()+"?";
			input = JOptionPane.showInputDialog(equation);
			while (Integer.parseInt(input) != q.correctAnswer()) {
				input = JOptionPane.showInputDialog("오답. 다시해보세요. "+equation);
			}
			JOptionPane.showMessageDialog(null,"맞았습니다! "+q.leftOperand()+" "+op+" "+q.rightOperand()+" = "+q.correctAnswer());
		}
	}

//  테스트 코드
//	public static void main(String[] args) {
//		Session s = new Session();
//		s.test();
//		s.practice("+");
//		s.practice("x");
//	}
	
}
