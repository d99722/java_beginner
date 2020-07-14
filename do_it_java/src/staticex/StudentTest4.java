package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이동근");
		System.out.println(Student2.getSerialNum()); // *
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
		
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김경화");
		System.out.println(studentKim.getSerialNum()); // * : serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		System.out.println(studentKim.studentName+" 학번 : "+studentKim.studentID);


	}

}
