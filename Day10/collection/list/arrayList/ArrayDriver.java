package Day10.collection.list.arrayList;

import Day10.collection.list.Employee;
import Day10.collection.list.EmployeeSalBasedComp;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDriver {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Satyam", 2000);
        Employee emp2 = new Employee(2, "Ayush", 3000);
        Employee emp3 = new Employee(3, "satyam", 3000);
        Employee emp4 = new Employee(4, "shivam", 5000);
        Employee emp5 = new Employee(5, "sharik", 3000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        double tempSalary = 0;
        Employee highEmployee = null;
        for (Employee emp : list) {
            if (tempSalary < emp.getSalary()) {
                tempSalary = emp.getSalary();
                highEmployee = emp;
            }
        }
        System.out.println("Max salary employee:" + highEmployee);

        //add 5 Employees
        //find mx salary employee
        //find 2nd highest salary empl>h

        Collections.sort(list,new EmployeeSalBasedComp());
        System.out.println("\nMax salary by comparator"+list.get(list.size()-1));

        System.out.println("\n2nd Max salary by comparator"+list.get(list.size()-2));
    }

}
