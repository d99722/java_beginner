package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이동근");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김경화");
		System.out.println(studentKim.serialNum);
		System.out.println(studentKim.studentName+" 학번 : "+studentKim.studentID);

	}

}
