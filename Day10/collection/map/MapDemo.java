package Day10.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<String,Integer>();
        marks.put("Science", 50);
        marks.put("Maths", 50);
        marks.put("English", 50);
        marks.put("Science", 60); 
        marks.put("Science", 60); 
        //duplicates value will be replaced/updated
        marks.put(null, 60); 
        marks.put("Test1", null); 
        marks.put("Test2", null); 
        //multiple null values allowed
         System.out.println("Maths".hashCode());
        System.out.println(marks);

        marks.remove("Test1");
        marks.remove("Test2");

        System.out.println("\nprinting by to string\n");
        System.out.println(marks);

        System.out.println("\nprinting by to string\n");
        System.out.println(marks);



        


}    
    
}
