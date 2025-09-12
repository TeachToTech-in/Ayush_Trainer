package Day14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,null,1000);
        Employee emp2 = new Employee(2,"Rahul",3000);
        Employee emp3 = new Employee(3,"Shyam",2000);
        Employee emp4 = new Employee(4,"satyam",2000);
        Employee emp5 = new Employee(5,"Rahul",2000);

       List<Employee> empList =  List.of(emp1,emp2,emp3,emp4,emp5);

        System.out.println("emplist size:"+empList.size());


       for(Employee emp:empList){
                if("Rahul".equals(emp.getName())){
                    System.out.println(emp);
                }
       }


//1.Print size of empList
//2.find emp with name Rahul and print on console
//3.Print Rahul Salary on screen

/* 

             /*  ArrayList<Employee> empList =new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        */
/*
        System.out.println(empList);
         Employee maxSalEmp = null;
        double maxSal = 0;
        for(Employee emp:empList){
            
             if(maxSal < emp.getSal()){
                 maxSal = emp.getSal();
                maxSalEmp = emp;
             }
        }

        System.out.println("\nmax sal emp"+maxSalEmp);
   */     
//empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)));

    }
}
