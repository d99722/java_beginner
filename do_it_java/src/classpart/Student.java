package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "이동근";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	public String toString() {
		return studentName+", "+studentID;
	}
	
}
