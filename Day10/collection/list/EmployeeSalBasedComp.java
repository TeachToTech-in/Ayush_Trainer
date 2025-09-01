package Day10.collection.list;

import java.util.Comparator;

public class EmployeeSalBasedComp implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        //make the > to < than to reverse the sorting order i.e decresing order
        if (o1.getSalary() > o2.getSalary())
            return 1;
        else if(o1.getSalary() == o2.getSalary())
            return 0;
        else
            return -1;
    }
    
}