class Calculate{
	public double change(double c){
		return (9.0/5.0) * c + 32;
	}
}


public class Last{
	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
		int mYear = Integer.parseInt(args[1]);
		double m = mYear*12;
		double rYear = Double.parseDouble(args[2]);
		double r = rYear/12;
		
		
		double temp = Math.pow((1+r), mYear);
		System.out.println(temp);
		double monthReturn = (temp * p * 1000000 * r) / (temp - 1);
		
//		int monthReturn = 0;
		int totalReturn = 0;
		System.out.println("자유은행 대출 상환금 계산 서비스에 오심을 환영합니다.");
		System.out.println();
		System.out.println("손님의 대출원금은 "+p+"백만원입니다.");
		System.out.println("연이자율 "+rYear+"로 "+m+"년 동안");
		System.out.println("매월 원리금 균등으로 "+monthReturn+"원씩 상환하셔야 합니다.");
		System.out.println("총 상환금액은 "+totalReturn+"원 입니다.");
		System.out.println();
		System.out.println("저희 자유은행은 항상 여러분과 함께 합니다.");
		System.out.println("또 들려주세요.");
		

		
	}
}
