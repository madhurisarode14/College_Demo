package collageDemo;

public class Department {
    private  int department;
    private String departmentName;
    private  String departmentCode;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "department=" + department +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Department(int department, String departmentName, String departmentCode) {
        this.department = department;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}
