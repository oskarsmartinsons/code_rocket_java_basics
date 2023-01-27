package Lesson6.HashMap;

import java.util.HashMap;
import java.util.HashSet;

class HashMapFunctions {

    // Task 1 - Write a Java program to associate the specified value with the specified key in a HashMap.
    void createAndPrintOutHashSet() {
        System.out.println("Task 1 - associate the specified value with the specified key in a HashMap");
        // creating hash map
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "Red");
        hashMap.put(2, "Blue");
        hashMap.put(3, "Green");
        // printing out
        System.out.println("Created  hash map: " + hashMap);
    }

    // Task 2 - Write a Java program to count the number of key-value (size) mappings in a map.
    void getSizeOfHashMap(HashMap hashMap) {
        System.out.println("\nTask 2 - get the number of key/value pairs in hash map");
        System.out.println("Original: " + hashMap);
        int size = hashMap.size();
        System.out.println("Size of Original: " + size);
    }

    // Task 3 - Write a Java program to copy all of the mappings from the specified map to another map
    void copyMapToMap(HashMap hashMap1, HashMap hashMap2) {
        System.out.println("\nTask 3 - copy all of the mappings from the specified map to another map");
        System.out.println("Original: " + hashMap1);
        System.out.println("Other: " + hashMap2);
        hashMap2.putAll(hashMap1);
        System.out.println("Copy: " + hashMap2);
    }

    // Task 4 - Remove all elements from hash map.
    void removeAllElementsHashMap (HashMap hashMap) {
        System.out.println("\nTask 4 - Remove all elements from hash map:");
        System.out.println("Original: " + hashMap);
        hashMap.clear();
        System.out.println("Empty/cleared  hashset: " + hashMap);
    }

    // Task 5 check if Hashmap is empty
    void checkIfEmpty(HashMap hashMap) {
        System.out.println("\nTask 5 check if Hashmap is empty: ");
        System.out.println("Original: " + hashMap);
        // check if empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is hash map empty? " + isEmpty);
    }

    // Task 6 - Write a Java program to get a shallow copy of a HashMap instance
    void copyHashMap (HashMap hashMap) {
        System.out.println("\nTask 6 - get a shallow copy of a HashMap instance");
        System.out.println("Original: " + hashMap);
        // cloned
        HashMap<Integer, Character> cloned = (HashMap) hashMap.clone();
        System.out.println("Cloned (copy) : " + cloned);
    }

    // Task 7 - Write a Java program to test if a map contains a mapping for the specified key
    void checkKey(HashMap hashMap, Object key) {
        System.out.println("\nTask 7 - test if a map contains a mapping for the specified key");
        System.out.println("Original: " + hashMap);
        // check if has key
        hashMap.get(key);
        System.out.println("Key is: " + key);
        System.out.println("Value for the key: " + hashMap.get(key));
    }
}
