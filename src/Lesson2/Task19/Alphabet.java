package Lesson2.Task19;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    String myString;
    Integer counter;

    Map<Character,Integer> myMap;

   // public Map<Character,Integer> getOccurances() {
   public void getOccurances() {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (int i = 0; i < myString.length(); i++) {
              Integer counter = myMap.get(myString.charAt(i));
              if (counter == null) {
                myMap.put(myString.charAt(i), 1);
               }
               else {
                   myMap.put(myString.charAt(i), counter + 1);
               }
        }
        for (Map.Entry<Character, Integer> me : myMap.entrySet()) {
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
