package assignment4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CourseSorting implements Comparator<Student> {


    @Override
    public int compare(Student a, Student b) {

        if (b.getCourseName().compareTo(a.getCourseName()) != 0) {

            return a.getCourseName().compareTo(b.getCourseName());
        } else if (a.getCourseName().equals(b.getCourseName()) && a.getCourseName().matches("\\w\\w\\w\\w\\w\\s\\d\\d\\d")) {


        if( b.getStudentGrade()> a.getStudentGrade()){
            return 1;
        }
        else if (b.getStudentGrade()< a.getStudentGrade()){
        return -1;}
        return 0;
        }


            return Integer.compare(a.getStudentGrade(), b.getStudentGrade());
        }


    }







