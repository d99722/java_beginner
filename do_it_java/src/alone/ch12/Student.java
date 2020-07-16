package alone.ch12;

public class Student {
	private String studentId;
	private String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return this.studentId+":"+this.studentName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.studentId == stu.studentId) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	
	
}
