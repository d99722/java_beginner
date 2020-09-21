import java.text.*;

public class Homework1{
	public static void main(String[] args) {
		int principal = Integer.parseInt(args[0]);
		int actualPrincipal = principal*1000000;
		int year = Integer.parseInt(args[1]);
		int month = year*12;
		double interest = Double.parseDouble(args[2]);
		double monthInterest = interest/1200;
		double temp = Math.pow((1 + monthInterest), month);
		double monthReturn = Math.floor((temp * actualPrincipal * monthInterest) / (temp - 1));
		double totalReturn = monthReturn*48;
		
		DecimalFormat formatter = new DecimalFormat("0");
		
		System.out.println("자유은행 대출 상환금 계산 서비스에 오심을 환영합니다.");
		System.out.println();
		System.out.println("손님의 대출원금은 "+principal+"백만원입니다.");
		System.out.println("연이자율 "+interest+"%로 "+year+"년 동안");
		System.out.println("매월 원리금 균등으로 "+formatter.format(monthReturn)+"원씩 상환하셔야 합니다.");
		System.out.println("총 상환금액은 "+formatter.format(totalReturn)+"원 입니다.");
		System.out.println();
		System.out.println("저희 자유은행은 항상 여러분과 함께 합니다.");
		System.out.println("또 들려주세요.");
		

		
	}
}