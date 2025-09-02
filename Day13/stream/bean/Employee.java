package Day13.stream.bean;



import Day13.stream.data.ConstData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends ConstData {

    private int empId;
    private String empFirstName;
    private String empLastName;
    private double empSalary;
    private String empJoinDay;
    private Date joiningDate;
    private Date empDob;
    private String empPanId;
    private String workingDept;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpJoinDay() {
        return empJoinDay;
    }

    public void setEmpJoinDay(String empJoinDay) {
        this.empJoinDay = empJoinDay;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }

    public String getEmpPanId() {
        return empPanId;
    }

    public void setEmpPanId(String empPanId) {
        this.empPanId = empPanId;
    }

    public String getWorkingDept() {
        return workingDept;
    }

    public void setWorkingDept(String workingDept) {
        this.workingDept = workingDept;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empSalary=" + empSalary +
                ", empJoinDay='" + empJoinDay + '\'' +
                ", joiningDate=" + joiningDate +
                ", empDob=" + empDob +
                ", empPanId='" + empPanId + '\'' +
                ", workingDept='" + workingDept + '\'' +
                '}';
    }


    public Employee(int empId, String empFirstName, String empLastName, double empSalary, String empJoinDay, Date joiningDate, Date empDob, String empPanId, String workingDept) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empSalary = empSalary;
        this.empJoinDay = empJoinDay;
        this.joiningDate = joiningDate;
        this.empDob = empDob;
        this.empPanId = empPanId;
        this.workingDept = workingDept;
    }


    public static List<Employee>  createEmployees(int noOfEmp){

        List<Employee> emp= new ArrayList();
        noOfEmp= noOfEmp>10?10:noOfEmp;
        try{
            while(noOfEmp>0){
                int id=++ConstData.id1;
                String fistName=FIRSTNAME[getRandNo(FIRSTNAME.length-1)];
                String lastName=LASTNAME[getRandNo(LASTNAME.length-1)];
                Double salary=SALARY[getRandNo(SALARY.length-1)];
                String joinDay=DAYS[getRandNo(6)];

                int uniqueRand=0;
                while(uniqueRand==ConstData.id2)
                    uniqueRand=  getRandNo(9);
                ConstData.id2=uniqueRand;

                String pan=ALPHANUMID[uniqueRand];
                String empDept=DEPT[getRandNo(DEPT.length-1)];


                emp.add(new Employee(id,fistName,lastName,salary,joinDay,null,null,pan,empDept));
                noOfEmp--;
            }

        }catch(Exception e){
            System.out.println("Employee initData"+e.getMessage());
         //   e.printStackTrace();
        }
        return emp;
    }

    public static int getRandNo( int max) {
        return (int) (Math.random() * max);
    }
    public static int getRandNo(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
