package assignment4;

public class Student implements Comparable<Student>{
	
public Student(String name, int studentId, int studentGrade, String courseName) {
		super();
		this.name = name;
		this.StudentId  = studentId;
		this.studentGrade = studentGrade;
		this.courseName = courseName;
	}
public Student() {
	// TODO Auto-generated constructor stub
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
public int compareTo(String that) {
	
	if(this.courseName >that.courseName) {
		
	// TODO Auto-generated method stub
	return 0;
}

}

}
