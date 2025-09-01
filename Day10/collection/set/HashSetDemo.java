package Day10.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
           
    Set<String> set = new HashSet<String>();

    set.add("Ayush");
    set.add("Rahul");
    set.add("Satyam");
    set.add("Satyam");//duplicates not allowed
    set.add("Vishal");
    set.add(null); // one null value allowed

    System.out.println(set);
    //Insertion order not preserved  
    //It will insert automatically based on hasCode

    set.remove("Satyam");

    System.out.println("Set size:"+set.size());
    
    
    }

}
