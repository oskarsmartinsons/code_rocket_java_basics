package Lesson6.HashMap;

import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        // create hash map for tasks
        HashMap<Integer, Character> hashMap = new HashMap<>();
        hashMap.put(1, 'T');
        hashMap.put(3, 'A');
        hashMap.put(2, 'D');
        hashMap.put(4, 'B');

        // create another hash map for tasks
        HashMap<Integer, Character> hashMapOther = new HashMap<>();
        hashMapOther.put(5, 'P');
        hashMapOther.put(6, 'E');


        HashMapFunctions hashMapFunctions = new HashMapFunctions();

        // Task 1 - Write a Java program to append the specified element to the end of a hash set.
        hashMapFunctions.createAndPrintOutHashSet();

        // Task 2 - Write a Java program to count the number of key-value (size) mappings in a map.
        hashMapFunctions.getSizeOfHashMap(hashMap);

        // Task 3 - Write a Java program to copy all of the mappings from the specified map to another map
        hashMapFunctions.copyMapToMap(hashMap, hashMapOther);

        // Task 4 - Remove all elements from hash map.
        hashMapFunctions.removeAllElementsHashMap(hashMapOther);

        // Task 5 check if Hashmap is empty
        hashMapFunctions.checkIfEmpty(hashMapOther);

        // Task 6 - Write a Java program to get a shallow copy of a HashMap instance
        hashMapFunctions.copyHashMap(hashMap);

        // Task 7 - Write a Java program to test if a map contains a mapping for the specified key
        hashMapFunctions.checkKey(hashMap, 2);

        // Task 8 - Write a Java program to test if a map contains a mapping for the specified value
        hashMapFunctions.checkValue(hashMap,'D' );

        // Task 9 - Write a Java program to create a set view of the mappings contained in a map
        hashMapFunctions.createSetViewOfMappings(hashMap);

        // Task 10 - Write a Java program to get the value of a specified key in a map
        hashMapFunctions.getKeyValue(hashMap, 3);

        // Task 11 - Write a Java program to get a set view of the keys contained in this map
        hashMapFunctions.createSetViewOfKeys(hashMap);

        // Task 12 - Write a Java program to get a collection view of the values contained in this map
        hashMapFunctions.getCollectionViewOfValues(hashMap);
    }
}
