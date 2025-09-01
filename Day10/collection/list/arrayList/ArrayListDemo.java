package Day10.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

    List<String> arr = new ArrayList<String>();

    arr.add("Ayush");
    arr.add("Arun");
    arr.add("Rakesh");
    arr.add("Rahul");
    arr.add("Satyam");
    arr.add("Sumit");
    arr.add("Sumit");//duplicates are allowed

    arr.add(3,"don");

    System.out.println("ArrayList size:"+arr.size()); 
    System.out.println(arr); 
    //if you print any Object directly by default it's toString will run

    arr.remove("Satyam");
    arr.remove(1);//removing Arun
    System.out.println("ArrayList size:"+arr.size() +"\n"+ arr); 
    // elements will be inserted same way we do
    //i.e insertion order is preserved

    System.out.println("\nPrint using for loop\n ");
    for(int i =0;i<arr.size();i++)
        System.out.println(arr.get(i));


    System.out.println("\nPrint using foreach loop\n ");
    for(String name : arr)
        System.out.println(name);

    System.out.println("\nPrint using Iterator\n");

    Iterator<String> it =arr.iterator();
    while (it.hasNext()) 
        System.out.println(it.next());

    
    
    }

    
}
