package Lesson2.Task19;

import java.util.*;

class Alphabet {
    private final String myString;
    public Alphabet(String myString) {
        this.myString = myString;
    }
   public HashMap<Character, Integer> getOccurrences() {
      //  Integer counter;
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (int i = 0; i < myString.length(); i++) {
              Integer counter = myMap.get(myString.charAt(i));
              if (counter == null) {
                myMap.put(myString.charAt(i), 1);
               }
               else {
                   myMap.put(myString.charAt(i), counter + 1);
               }
        }
       return myMap;
   }

    // sort hash map
    HashMap<Character, Integer> sortMyMap (HashMap<Character, Integer> unsortedMap ) {
        // Create a list
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(unsortedMap.entrySet());

        // Sort the list using lambda expression
        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
        Collections.reverse(list);

        // Create sorted hash map
        HashMap<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> l : list) {
            sortedMap.put(l.getKey(), l.getValue());
        }
        return sortedMap;
    }

    // Printing without using Lambda
    void printHaspMap (HashMap<Character,Integer> myMap) {
        for (Map.Entry<Character, Integer> m : myMap.entrySet()) {
            // Printing
            System.out.print(m.getKey() + ":");
            System.out.println(m.getValue());
        }
    }

    //  Printing with using Lambda
    void printWithLambda(HashMap<Character,Integer> myMap) {
        myMap.forEach((c,i)->printRow(c,i));
    }
    void printRow (Character c, Integer i) {
        System.out.println(c + ":" + i);
    }

}
