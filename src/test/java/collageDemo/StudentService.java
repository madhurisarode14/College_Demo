package collageDemo;

public interface StudentService {

    public Student[] findTopperInCollege();
   // public Student[] findTopperSubjectWise(String subj);
  //  public Student[] findTopperDeptWise(String deptName);
    public Student[] findAllFailedStudents();
    public Student[] findAllPassedStudents();
    public Student[] find3ToppersDepartWise();
    public Student[] find3ToppersSubjectWise();

}
