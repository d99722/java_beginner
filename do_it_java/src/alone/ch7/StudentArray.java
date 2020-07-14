package alone.ch7;

public class StudentArray {

	public static void main(String[] args) {
		Student[] stud = new Student[3];
		stud[0] = new Student(1001,"James");
		stud[1] = new Student(1002,"Tomas");
		stud[2] = new Student(1003,"Edward");
		
		for (int i=0; i<stud.length; i++) {
			stud[i].showStudentInfo();
		}
		
	}

}
