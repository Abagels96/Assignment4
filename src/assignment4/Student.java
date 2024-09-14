package assignment4;

public class  Student {

	@Override
	public String toString() {
		return "Student{ StudentId=" + StudentId +
				"," +
				"name='" + name + '\'' +

				", studentGrade=" + studentGrade +
				", courseName='" + courseName + '\'' +
				'}';
	}

	public Student(int studentId,String name, int studentGrade, String courseName) {
		super();
		this.StudentId = studentId;
		this.name = name;

		this.studentGrade = studentGrade;
		this.courseName = courseName;
	}

	private String name;
	private int StudentId;
	private int studentGrade;
	private String courseName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



}



