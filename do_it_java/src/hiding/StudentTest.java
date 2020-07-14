package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이동근";
		studentLee.setStudentName("이동근");
		System.out.println(studentLee.getStudentName());

	}

}
