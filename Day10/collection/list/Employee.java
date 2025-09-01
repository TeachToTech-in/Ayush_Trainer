package Day10.collection.list;


public class Employee  {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.salary = sal;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString(){
        return "id:"+this.id+" name:"+ this.name +" sal:"+this.salary;
    }



}
 