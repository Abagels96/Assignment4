package assignment4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CourseSorting implements Comparator<Student> {


    @Override
    public int compare(Student a, Student b) {

        if (b.getCourseName().compareTo(a.getCourseName()) != 0) {
           // System.out.println(b.getCourseName());
        }


        return a.getCourseName().compareTo(b.getCourseName());
    }


}






