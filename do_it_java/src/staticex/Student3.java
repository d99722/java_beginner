package staticex;

public class Student3 {
	private static int serialNum = 1000;		// private 변수로 변경
	int studentCardNum;
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCardNum = studentID + 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {					// serialNum의 get() 메서드
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {	// serialNum의 set() 메서드
		Student3.serialNum = serialNum;
	}
}
