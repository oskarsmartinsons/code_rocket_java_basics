package Lesson6.TreeMap;

import java.util.HashMap;
import java.util.TreeMap;

class TreeMapDemo {
    public static void main(String[] args) {
        // create tree map for tasks
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(1, 'T');
        treeMap.put(3, 'A');
        treeMap.put(2, 'D');
        treeMap.put(4, 'B');

        // create another tree map for tasks
        TreeMap<Integer, Character> treeMapOther = new TreeMap<>();
        treeMapOther.put(5, 'P');
        treeMapOther.put(6, 'E');

        TreeMapFunctions treeMapFunctions = new TreeMapFunctions();

        // Task 1 - Write a Java program to associate the specified value with the specified key in a Tree Map
        treeMapFunctions.createAndPrintTreeMap();

        // Task 2- Write a Java program to copy a Tree Map content to another Tree Map
        treeMapFunctions.copyTreeToTree(treeMap, treeMapOther);

        // Task 3 - Write a Java program to search a key in a Tree Map
        treeMapFunctions.searchKey(treeMap, 2);

        // Task 4 - Write a Java program to search a value in a Tree Map
        treeMapFunctions.searchValue(treeMap, 'D');

    }
}
