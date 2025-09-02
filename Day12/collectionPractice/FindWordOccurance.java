package Day12.collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class FindWordOccurance{
    public static void main(String[] args) {
        String s= "Hello is the First Program in the java";

        //splitting my sentance with sapce 
        //it will return String array
        String[] myString = s.split(" ");

        Map<String,Integer> occurance  = new HashMap<>();

        for (String word : myString) {
            //checking if the word is already there
            if(occurance.containsKey(word)){
                int curCount = occurance.get(word);
                //if word is already there 
                //get the current count increase the no of count by 1
                occurance.put(word, ++curCount);
            }else{
                //if word is not there directly put count as 1
                occurance.put(word, 1);
            }
        }
        System.out.println(occurance);
        
    }

}