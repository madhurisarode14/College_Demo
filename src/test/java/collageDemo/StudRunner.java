package collageDemo;

import java.util.Arrays;

public class StudRunner {

    public static void main(String[] args) {
        StudentServiceImple studentServiceImple = new StudentServiceImple();

        Student st[] = studentServiceImple.findTopperInCollege();
        System.out.println("College Topper : " + Arrays.toString(st));
     // Student failstud[]  = studentServiceImple.findAllFailedStudents();
     //  System.out.println("failedstudentlist:" + Arrays.toString(failstud));
       // Student passstud[]  = studentServiceImple.findAllPassedStudents();
       // System.out.println("pasedstudentlist:" + Arrays.toString(passstud));
    }
}
