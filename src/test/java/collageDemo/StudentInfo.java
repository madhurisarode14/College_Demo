package collageDemo;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class StudentInfo {
    public static Student student[];
    private static DecimalFormat df = new DecimalFormat("#.##");
    static int stCount =101;
    static  int deptCount = 991;
    static String departCodes[] = {"IT","CSE","MECH","CL","ET"};
    static String departNames[] = {"Information Tech", "Computers","Mechanical","Civil", "E&TC"};
    static  char Gender[] = {'M','F'};
    static  String address[] = {"pune","Mumbai","chennai","Banglore","kolkatta"};



    public static Student getStudent(){
        Student st = new Student();
        st.setStudId(stCount);
        st.setStudName("AAAA" + stCount);
        double fees = ThreadLocalRandom.current().nextDouble(100.2,999.0);

        fees = Double.parseDouble(df.format(fees));
        st.setStudFees(fees);

        int index = ThreadLocalRandom.current().nextInt(0,address.length);
        st.setStudAddress(address[index]);

        index = ThreadLocalRandom.current().nextInt(0,2);
        st.setStudGender(Gender[index]);

        st.setMarks(getMarks());
        st.setDepartment(getDepartment());
        stCount ++;
        return st;

    }
    public static Marks getMarks(){
        int phy = ThreadLocalRandom.current().nextInt(30,99);
        int chem = ThreadLocalRandom.current().nextInt(30,99);
        int math = ThreadLocalRandom.current().nextInt(30,99);
        return new Marks(phy,chem,math);

    }
    public  static  Department  getDepartment(){
        Department department = new Department();

        department.setDepartment(deptCount);
        int index = ThreadLocalRandom.current().nextInt(0,departCodes.length);

        String departCode = departCodes[index];
        String departName = departNames[index];

        department.setDepartmentName(departName);
        department.setDepartmentCode(departCode);

        deptCount++;
        return department;
    }

    public static Student[] getListOfStudent(int num) {
        student = new Student[num];
        for(int i=0;i<num;i++) {
            student[i] = getStudent();
        }
        return student;
    }

}
