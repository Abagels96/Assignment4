package assignment4;

public class  Student {

	@Override
	public String toString() {
		return   StudentId+ ","+ name +"," + courseName+","+ studentGrade ;
	}

	public Student(int studentId,String name, String courseName,int studentGrade) {
		super();
		this.StudentId = studentId;
		this.name = name;
		this.courseName = courseName;
		this.studentGrade = studentGrade;

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



