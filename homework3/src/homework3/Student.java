package homework3;

public class Student extends User{
	private String studentNumber;
	private String myLessonName;
	public Student() {
		
	}
	
	public Student(String studentNumber, String myLessonName) {
		super();
		this.studentNumber = studentNumber;
		this.myLessonName = myLessonName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getMyLessonName() {
		return myLessonName;
	}

	public void setMyLessonName(String myLessonName) {
		this.myLessonName = myLessonName;
	}
	
	
	
	

}
