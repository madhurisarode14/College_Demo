package collageDemo;

public class Student {
    private int studId;
    private  String studName;
    private  char studGender;
    private  double studFees;
    private  String studAddress;
    private Marks marks;
    private  Department department;

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studGender=" + studGender +
                ", studFees=" + studFees +
                ", studAddress='" + studAddress + '\'' +
                ", \n marks=" + marks +
                ", \n department=" + department +
                '}';
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public char getStudGender() {
        return studGender;
    }

    public void setStudGender(char studGender) {
        this.studGender = studGender;
    }

    public double getStudFees() {
        return studFees;
    }

    public void setStudFees(double studFees) {
        this.studFees = studFees;
    }

    public String getStudAddress() {
        return studAddress;
    }

    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student() {
    }

    public Student(int studId, String studName, char studGender, double studFees, String studAddress, Marks marks, Department department) {
        this.studId = studId;
        this.studName = studName;
        this.studGender = studGender;
        this.studFees = studFees;
        this.studAddress = studAddress;
        this.marks = marks;
        this.department = department;
    }
}
