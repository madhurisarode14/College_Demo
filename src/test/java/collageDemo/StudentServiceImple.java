package collageDemo;

import java.util.Arrays;

public class StudentServiceImple implements StudentService{

    public static Student []students;

    public StudentServiceImple() {
        students = StudentInfo.getListOfStudent(10);
        System.out.println("---Randomly Generated Student Data----");
        System.out.println(Arrays.toString(students));
        System.out.println("-----------------------");
    }

    @Override
    public Student[] findTopperInCollege() {
        int topperMarks = 0;

        for (Student student : students) {
            Marks mark = student.getMarks();
            if(mark. getPhysic()<40 || mark.getChemistry()<40 || mark.getMaths()<40) {
                continue;
            }else {
                int totalMarks = mark.getPhysic() + mark.getChemistry() + mark.getMaths();
                if(topperMarks<totalMarks) {
                    topperMarks = totalMarks;
                    //st = student;
                }
            }
        }

        Student toppers[] = new Student[5];
        int ind = 0;
        for (Student student : students) {
            Marks mark = student.getMarks();

            if(mark.getPhysic()<40 || mark.getChemistry()<40 || mark.getMaths()<40) {
                continue;
            }else {
                int totalMarks = mark.getPhysic() + mark.getChemistry() + mark.getMaths();
                if(totalMarks == topperMarks) {
                    toppers[ind] = student;
                    ind++;
                }
            }
        }

        return toppers;
    }

    @Override
    public Student[] findAllFailedStudents() {
        Student failStud[] = new Student[10];
        int index = 0;
        for(Student student: students) { // 0 --1--2
            Marks marks = student.getMarks();
            if(marks.getPhysic()<40 || marks.getChemistry()<40 || marks.getMaths()< 40){
                failStud[index] = student;
                index++;
            }
        }
        return failStud;
    }
    // JustTest

    @Override
    public Student[] findAllPassedStudents() {
         Student passedStud[] = new Student[10];
         int index = 0;
        for (Student student:students){
          Marks marks = student.getMarks();
          if (marks.getPhysic()>40 && marks.getChemistry()>40 && marks.getMaths()>40){
              passedStud[index] = student;
              index++;


          }
        }
        return passedStud;
    }

    @Override
    public Student[] find3ToppersDepartWise() {
        return new Student[0];
    }

    @Override
    public Student[] find3ToppersSubjectWise() {
        return new Student[0];
    }

/*
    @Override
    public Student[] findTopperSubjectWise(String subj) {
        return new Student[0];
    }

    @Override
    public Student[] findTopperDeptWise(String deptName) {
        return new Student[0];
    }
*/

}
