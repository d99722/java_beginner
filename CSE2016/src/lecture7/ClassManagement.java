package lecture7;

import javax.swing.JOptionPane;

public class ClassManagement {

	/* computeAverage
	 * 제출한 시험 점수 평균 계산
	 * @param how_many - 시험 점수의 개수 (양수)
	 * @return - 평균 점수 */
	public double computerAverage(int how_many) {
		double total_points = 0.0;
		int count = 0;
		boolean processing = true;
		while(processing) {
			String input = JOptionPane.showInputDialog("다음 시험 점수?");
			if(input == null) {
				processing = false;
			} else {
				int score = Integer.parseInt(input);
				total_points += score;
				count += 1;
			}
			System.out.println("개수 = "+count+", 누적 점수 = "+ total_points);			
		}
		if (count == 0) {
			throw new RuntimeException("computeAverage error : 계산할 점수가 없습니다.");
		}
		return total_points/count;		
	}
	
	public static void main(String[] args) {
		ClassManagement c = new ClassManagement();
		System.out.println("평균점수 = "+c.computerAverage(5));
	}
	
}
