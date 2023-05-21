public class Employee {
    private int empNum;
    private String empName;

     // Static variables
     public static final int NUM_WORKING_DAYS = 5;
     public static final String WEEKEND_DAYS = "Friday and Saturday";

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

}
