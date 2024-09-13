package assignment4;

import java.io.IOException;

public class StudentSortingApplication {
 public static void main(String[] args) throws IOException {

  StudentService service = new StudentService();
  service.readList();
  service.sortArrays(service.students);
service.findElement(service.students);
service.copyElements(service.students);
 }
}



///Read file done
/// convert data into an string array done 
/// isolate the course name by using the POJO done
/// make an object out of each group of students working on.
/// write each object into a file
//// sort each file by grade in descending order
//// deal with null values 