package assignment4;

import java.io.*;
import java.util.*;


public class StudentService {
	Student[] students= new Student[100];
	int i=0;
	CourseSorting courseSorting = new CourseSorting();
	public void readList() throws IOException {
		BufferedReader reader = null;
		try {
			//opening the file
			reader = new BufferedReader(new FileReader("student-master-list.csv"));
			reader.readLine();
			String lines = "";
			while ((lines = reader.readLine()) != null) {
				System.out.println(lines);
				String[] studentList = lines.split(",");
				System.out.println(Arrays.toString(studentList));

				Integer myIntVal = Integer.parseInt(studentList[0]);
				Integer anotherIntVal = Integer.parseInt(studentList[3]);
				System.out.println(myIntVal);
				System.out.println(anotherIntVal);

				Student student = new Student(myIntVal, studentList[1], anotherIntVal, studentList[2]);

				students[i] = student;
				i++;

				System.out.println(Arrays.toString(students));

			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			assert reader != null;
			reader.close();
		}


		// sort using comparators for the strings that represent the
	}

	public void sortArrays(Student[] students){

Arrays.sort(students, courseSorting);
System.out.println(Arrays.toString(students));
System.out.println("sorted by course");

	}


	public void findElement(Student[] students){
		String correctValue="APMTH";
		String anotherCorrectValue="COMPSCI";
		String lastCorrectValue="STAT";
		Student foundStudent = null;
ArrayList arrayList = new ArrayList();
arrayList.addAll(Arrays.asList(students));
System.out.println(arrayList);
		for(Student student : students){

			if(student.getCourseName().startsWith(correctValue)){System.out.println(arrayList.indexOf(student));
				System.out.println("These are the indexes for APMTH");}

			if (student.getCourseName().startsWith(anotherCorrectValue)){System.out.println(arrayList.indexOf(student));
				System.out.println("These are the indexes for COMPSCI");}

			if (student.getCourseName().startsWith(lastCorrectValue)){System.out.println(arrayList.indexOf(student));
				System.out.println("These are the indexes for STAT");}


		}






	}
	public void copyElements(Student[] students) throws IOException {
Student [] apStudents= new Student[33];

apStudents= Arrays.copyOfRange(students,0,32);


for (Student student :apStudents) {

Arrays.sort(apStudents,new Comparator<Student>() {
	@Override
	public int compare(Student a, Student b) {
		if(b.getStudentGrade()==a.getStudentGrade()){return 0;}
		else if(b.getStudentGrade()>a.getStudentGrade()){return 1;}
        return -1;
    }
});

}
System.out.println(Arrays.toString(apStudents));

Student[] compSciStudents= new Student[33];
compSciStudents= Arrays.copyOfRange(students,33,66);
for (Student student :compSciStudents) {
	Arrays.sort(compSciStudents,new Comparator<Student>() {
		@Override
		public int compare(Student a, Student b) {
			if(b.getStudentGrade()==a.getStudentGrade()){return 0;}
			else if(b.getStudentGrade()>a.getStudentGrade()){return 1;}
			return -1;
		}
	});
}
System.out.println(Arrays.toString(compSciStudents));

	Student[] statStudents= new Student[33];
 statStudents= Arrays.copyOfRange(students,67,99);
 for(Student student :statStudents){
	 Arrays.sort(statStudents,new Comparator<Student>() {
		 @Override
		 public int compare(Student a, Student b) {
			 if(b.getStudentGrade()==a.getStudentGrade()){return 0;}
			 else if(b.getStudentGrade()>a.getStudentGrade()){return 1;}
			 return -1;
		 }
	 });
 }
System.out.println(Arrays.toString(statStudents));
		BufferedWriter writer = new BufferedWriter(new FileWriter("course1.csv"));
for(int i=0; i<compSciStudents.length; i++){
	Student student = compSciStudents[i];
	writer.write(student.toString());
	writer.newLine();
	writer.flush();
		}
writer.close();
BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.csv"));

for(int i=0; i<statStudents.length; i++){
	Student student = statStudents[i];
	writer2.write(student.toString());
	writer2.newLine();
	writer2.flush();
}
writer2.close();
BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.csv"));
for(int i=0; i<apStudents.length; i++){
	Student student = apStudents[i];




	writer3.write(student.toString());
	writer3.newLine();
	writer3.flush();
}

writer3.close();



	}








}