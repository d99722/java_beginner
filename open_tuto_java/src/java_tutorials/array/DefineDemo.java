package java_tutorials.array;

public class DefineDemo {

	public static void main(String[] args) {
		
		String[] classGroup = {"이동근", "김경화", "박준휘", "이고잉"};
		int [] scoreGroup = {30, 20, 15, 49};
		for (int i=0; i<4; i++) {
			if (scoreGroup[i]>25) {
				System.out.println(classGroup[i]+" 학생은 합격입니다.");
			} else {
				System.out.println(classGroup[i]+" 학생은 불합격입니다.");
			}
		}
	}

}
