package assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class StudentService {
	String[] students= new String[100];
	int i=0;
	
	public void readList() throws IOException  {
	BufferedReader reader=null;
	try {
		//opening the file
		 reader= new BufferedReader(new FileReader("student-master-list.csv"));
		 
		 String lines= "";
		 while ((lines=reader.readLine() )!=null) {
			 System.out.println(lines);
			String[] studentList = lines.split(",");
			System.out.println(Arrays.toString(studentList)) ;
			
			
			
			
			
		 
			
		 }
Student student= new Student();
		 


	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
        assert reader != null;
        reader.close();
	}

	}

}