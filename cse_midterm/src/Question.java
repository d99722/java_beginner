
public class Question {
	
	private int left_operand;
	private int right_operand;
	private int correct_answer;
	
	/** Question
	 * constructor : 무작위로 피연산자를 정하여 문제를 만들고 문제의 정답을 기억함
	 * @param op - 사용자 입력 operand	 */
	public Question(String op) {
		// 문제 만들기
		left_operand = (int)(Math.random()*10);
		right_operand = (int)(Math.random()*10);
		if (op.equals("+")) {
			correct_answer = left_operand+right_operand;
		} else if (op.equals("x")) {
			correct_answer = left_operand*right_operand;
		}
	}
	
	/** leftOperand
	 * 왼쪽 피연산자 리턴
	 * @return - 왼쪽 피 연산자	 */
	public int leftOperand() {
		return left_operand;
	}
	
	/** rightOperand
	 * 오른쪽 피연산자 리턴
	 * @return - 오른쪽 피 연산자 */
	public int rightOperand() {
		return right_operand;
	}
	
	/** correctAnswer
	 * 문제의 정답을 리턴
	 * @return - 문제의 정답 */
	public int correctAnswer() {
		return correct_answer;
	}
	
//  테스트 코드
//	public static void main(String[] args) {
//		Question q;
//		q = new Question("+");
//		System.out.println(q.leftOperand() + " + " + q.rightOperand());
//		System.out.println("answer = " + q.correctAnswer());
//		q = new Question("x");
//		System.out.println(q.leftOperand() + " x " + q.rightOperand());
//		System.out.println("answer = " + q.correctAnswer());
//	}
}
