package Lesson6.HashMap;

import java.util.*;

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
        boolean hasKey = hashMap.containsKey(key);
        System.out.println("Key is: " + key);
        System.out.println("Does hash map contains key '" + key + "' ?:" + hasKey);
    }

    // Task 8 - Write a Java program to test if a map contains a mapping for the specified value
    void checkValue(HashMap hashMap, Object value) {
        System.out.println("\nTask 8 - test if a map contains a mapping for the specified value");
        System.out.println("Original: " + hashMap);
        // check if has value
        boolean containsValue = hashMap.containsValue(value);
        System.out.println("Does hash map contains value '" + value + "' ? : " + containsValue );
    }

    // Task 9 - Write a Java program to create a set view of the mappings contained in a map
    void createSetViewOfMappings(HashMap hashMap) {
        System.out.println("\nTask 9 - create a set view of the mappings contained in a map");
        System.out.println("Original: " + hashMap);
        // returns set view of mappings
        Set setView = hashMap.entrySet();
        System.out.println("Set view of the mappings:" + setView );
    }

    // Task 10 - Write a Java program to get the value of a specified key in a map
    void getKeyValue(HashMap hashMap, Object key) {
        System.out.println("\nTask 10 - get the value of a specified key in a map");
        System.out.println("Original: " + hashMap);
        System.out.println("Key is: " + key);
        System.out.println("What is the value for '" + key + "' ?:" + hashMap.get(key));
    }

    // Task 11 - Write a Java program to get a set view of the keys contained in this map
    void createSetViewOfKeys(HashMap hashMap) {
        System.out.println("\nTask 11 - get a set view of the keys contained in this map");
        System.out.println("Original: " + hashMap);
        // returns set view of keys
        Set setViewOfKeys = hashMap.keySet();
        System.out.println("Set view of the keys:" + setViewOfKeys );
    }

    // Task 12 - Write a Java program to get a collection view of the values contained in this map
    void getCollectionViewOfValues(HashMap hashMap) {
        System.out.println("\nTask 12 - get a collection view of the values contained in this map");
        System.out.println("Original: " + hashMap);
        // Returns a Collection view of the values contained in this map.
        System.out.println("Collection of values in the map:" + hashMap.values());
    }
}
