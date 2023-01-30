package Lesson6.TreeMap;
import java.util.HashMap;
import java.util.TreeMap;

class TreeMapFunctions {


    // Task 1 - Write a Java program to associate the specified value with the specified key in a Tree Map
    void createAndPrintTreeMap() {
        System.out.println("Task 1 - associate the specified value with the specified key in a TreeMap");
        // creating Tree map
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(1, "Red");
        treeMap.put(3, "Blue");
        treeMap.put(2, "Green");
        // printing out
        System.out.println("Created tree map: " + treeMap);
    }

    // Task 2- Write a Java program to copy a Tree Map content to another Tree Map
    void copyTreeToTree(TreeMap treeMap1, TreeMap treeMap2) {
        System.out.println("\nTask 2 - copy a Tree Map content to another Tree Map");
        System.out.println("Original: " + treeMap1);
        System.out.println("Other: " + treeMap2);
        treeMap2.putAll(treeMap1);
        System.out.println("Copy: " + treeMap2);
    }

    // Task 3 - Write a Java program to search a key in a Tree Map
    void searchKey(TreeMap treeMap, Object key) {
        System.out.println("\nTask 3 - Write a Java program to search a key in a Tree Map");
        System.out.println("Original: " + treeMap);
        // search key
        boolean hasKey = treeMap.containsKey(key);
        System.out.println("Key is: " + key);
        System.out.println("Does tree map contains key '" + key + "' ?: " + hasKey);
    }

    // Task 4 - Write a Java program to search a value in a Tree Map
    void searchValue(TreeMap treeMap, Object value) {
        System.out.println("\nTask 4 - Write a Java program to search a value in a Tree Map");
        System.out.println("Original: " + treeMap);
        // search value
        boolean containsValue = treeMap.containsValue(value);
        System.out.println("Does tree map contains value '" + value + "' ? : " + containsValue );
    }
}
