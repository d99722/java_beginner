import java.text.DecimalFormat;

public class MathOperations {
	
	/* inverse
	 * i의 역수를 리턴
	 * @param i - 정수
	 * @return d - i의 역수 */
	public double inverse(int i) {
		double d = 1.0/i;
		return d;
	}
	
	/* printInverse
	 * i의 역수를 표준 실행창에 프린트
	 * (소수점 이하는 세째자리까지 표시)
	 * @param i - 정수 */
	public void printInverse(int i) {
		double d = inverse(i);
		DecimalFormat formatter = new DecimalFormat("0.000");
		System.out.println(formatter.format(d));
	}
	
	/* printInverse
	 * i의 역수를 pattern 문자열이 제시한 포맷으로 표준 실행창에 프린트
	 * @param i - 정수
	 * @param pattern - 문자열 포맷, 포맷은 소수점 둘째자리까지 표시하는 경우 "0.00" */
	public void printInverse(int i, String pattern) {
		double d = inverse(i);
		DecimalFormat formatter = new DecimalFormat(pattern);
		System.out.println(formatter.format(d));
	}
	
	/* printInverse
	 * i의 역수를 DecimalFormat 객체가 제시한 포맷으로 표준 실행창에 프린트
	 * @param i - 정수
	 * @param f - DecimalFormat 객체 */
	public void printInverse(int i, DecimalFormat f) {
		double d = inverse(i);
		System.out.println(f.format(d));
	}
}
