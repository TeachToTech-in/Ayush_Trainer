package Day13.stream.driver;

import Day13.stream.bean.Employee;
import java.util.Comparator;
import java.util.List;

public class StreamApp {
 public static void main(String[] args) {
        System.out.println( "Employess.......................................................\n");
        List<Employee> emps= Employee.createEmployees(10);
        emps.forEach(System.out::println);
        System.out.println( "\nSorted based on name.......................................................");
        emps.stream().sorted(Comparator.comparing(Employee::getEmpFirstName)).forEach(System.out::println);
        System.out.println( "\nsorted base on reverse name.......................................................");
        emps.stream().sorted(Comparator.comparing(Employee::getEmpFirstName).reversed()).forEach(System.out::println);
        System.out.println( "\nsum of salaries.......................................................");
        System.out.println( emps.stream().mapToDouble(Employee::getEmpSalary).sum());
        System.out.println( "\nsum of salaries simple.......................................................");
        System.out.println( emps.stream().mapToDouble(i->i.getEmpSalary()).sum());
        System.out.println( "\nsum of salaries reducer.......................................................");
        System.out.println( emps.stream().mapToDouble(Employee::getEmpSalary).reduce(0,(a,b) ->a+b ) );
        System.out.println( "\nsum of salaries .......................................................");
        System.out.println(emps.stream().map(Employee::getEmpSalary).reduce(0.0,(a,b) ->a+b ) );
        System.out.println( "\nsum of salaries .......................................................");
        System.out.println(emps.stream().map(i->i.getEmpSalary()).reduce(0.0,(a,b) ->a+b ) );
    }
    
}
