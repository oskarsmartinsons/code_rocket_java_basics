package Lesson6.TreeMap;
import com.sun.source.tree.Tree;

import java.util.*;

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

    // Task 5 - Write a Java program to get all keys from the given a Tree Map
    void getAllKeysKeys(TreeMap treeMap) {
        System.out.println("\nTask 5 - Write a Java program to get all keys from the given a Tree Map");
        System.out.println("Original: " + treeMap);
        // returns all keys
        Set setViewOfKeys = treeMap.keySet();
        System.out.println("All keys:" + setViewOfKeys );
    }

    // Task 6 - Write a Java program to delete all elements from a given Tree Map.
    void removeAllElements(TreeMap treeMap) {
        System.out.println("\nTask 6 - delete all elements from a given Tree Map");
        System.out.println("Original: " + treeMap);
        treeMap.clear();
        System.out.println("Empty/cleared tree map: " + treeMap);
    }

    // Task 7 - Write a Java program to sort keys in Tree Map by using comparator.
    void sortKeys(TreeMap treeMap) {
        System.out.println("\nTask 7 - Write a Java program to sort keys in Tree Map by using comparator.");
        System.out.println("Original: " + treeMap);
        TreeMap sortedTreeMap = new TreeMap(Comparator.reverseOrder());
        sortedTreeMap.putAll(treeMap);
        System.out.println("Sorted tree map: " + sortedTreeMap);
    }

    // Task 8 - Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
    void leastAndGreatestKeyEntry(TreeMap treeMap) {
        System.out.println("\nTask 8 - get a key-value mapping associated with the greatest key and the least key in a map");
        System.out.println("Original: " + treeMap);
        System.out.println("Least key-value: " +  treeMap.firstEntry());
        System.out.println("Greatest key-value: " +  treeMap.lastEntry());
    }

    // Task 9 - Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
    void lowestFirstAndHighestLastKey(TreeMap treeMap) {
        System.out.println("\nTask 9 - get the first (lowest) key and the last (highest) key currently in a map.");
        System.out.println("Original: " + treeMap);
        System.out.println("First (Lowest) key: " +  treeMap.firstKey());
        System.out.println("Last (Highest) key: " +  treeMap.lastKey());
    }

    // Task 10 -Write a Java program to get a reverse order view of the keys contained in a given map
    void reverseOrderViewOfKeys(TreeMap treeMap) {
        System.out.println("\nTask 10 - get a reverse order view of the keys contained in a given map.");
        System.out.println("Original: " + treeMap);
        // Returns a reverse order NavigableSet view of the keys contained in this map.
        System.out.println("Reverse key set view: " + treeMap.descendingKeySet());
    }

    // Task 11 - Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key
    void pairsWithKeySmallerOrEqual(TreeMap treeMap, int key) {
        System.out.println("\nTask 11 - get a key-value mapping associated with the greatest key less than or equal to the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.floorEntry(key));
    }

    // Task 12 - Write a Java program to get the greatest key less than or equal to the given key
    void keySmallerOrEqualThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 12 - get the greatest key less than or equal to the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.floorKey(key));
    }

    // Task 13 - Write a Java program to get the portion of a map whose keys are strictly less than a given key.
    void portionFromMapLessThanKey(TreeMap treeMap, int key) {
        System.out.println("\nTask 13 - get the portion of a map whose keys are strictly less than a given key. " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.headMap(key));
    }

    // Task 14 - Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
    void portionFromMapLessOrEqualThanKey(TreeMap treeMap, int key) {
        System.out.println("\nTask 14 - get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key" + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.headMap(key, true));
    }

    // Task 15 - Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
    void leastKeyGreaterThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 15 - get the least key strictly greater than the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.higherKey(key));
    }

    // Task 16 - Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
    void pairsWithKeySmallerThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 16 - get a key-value mapping associated with the greatest key strictly less than the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.headMap(key));
    }

    // Task 17 - Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
    void greatestKeyLessThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 17 - get the greatest key strictly less than the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.lowerKey(key));
    }

    // Task 18 - Write a Java program to get NavigableSet view of the keys contained in a map
    void getNavigableSetView (TreeMap treeMap) {
        System.out.println("\nTask 18 - get NavigableSet view of the keys contained in a map");
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.navigableKeySet());
    }

    // Task 19 - Write a Java program to remove and get a key-value mapping associated with the least key in a map.
    void getAndRemoveFirstPair(TreeMap treeMap) {
        System.out.println("\nTask 19 - remove and get a key-value mapping associated with the least key in a map.");
        System.out.println("Original: " + treeMap);
        System.out.println("Least key: " + treeMap.pollFirstEntry());
        System.out.println("Result: "+ treeMap);
    }

    // Task 20 - Write a Java program to remove and get a key-value mapping associated with the greatest key in a map.
    void getAndRemoveLastPair(TreeMap treeMap) {
        System.out.println("\nTask 20 - remove and get a key-value mapping associated with the greatest key in a map.");
        System.out.println("Original: " + treeMap);
        System.out.println("Greatest key: " + treeMap.pollLastEntry());
        System.out.println("Result: "+ treeMap);
    }

    // Task 21 - Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)
    void portionOfKeysInRange(TreeMap treeMap, int fromKey, int toKey) {
        System.out.println("\nTask 21 - get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)");
        System.out.println("Original: " + treeMap);
        SortedMap subMap = treeMap.subMap(fromKey, toKey);
        System.out.println("Result: " + subMap);
    }
    // Task 22 - Write a Java program to get the portion of a map whose keys range from a given key to another key
    void portionOfKeysInRangeExclusive(TreeMap treeMap, int fromKey, int toKey) {
        System.out.println("\nTask 22 - get the portion of a map whose keys range from a given key, to another key");
        System.out.println("Original: " + treeMap);
        SortedMap subMap = treeMap.subMap(fromKey, false, toKey, false);
        System.out.println("Result: " + subMap);
    }

    // Task 23 - Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    void portionOfGreaterOrEqualKeysThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 23 - get a portion of a map whose keys are greater than or equal to a given key.");
        System.out.println("Original: " + treeMap);
        System.out.println("Result: " + treeMap.tailMap(key));
    }

    // Task 24 - Write a Java program to get a portion of a map whose keys are greater than to a given key
    void portionOfGreaterKeysThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 24 - get a portion of a map whose keys are greater than to a given key");
        System.out.println("Original: " + treeMap);
        System.out.println("Result: " + treeMap.tailMap(key, false));
    }

    // Task 25 - Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key
    void pairWithKeyGreaterOrEqualThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 25 - get a key-value mapping associated with the least key greater than or equal to the given key: " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.ceilingEntry(key));
    }

    // Task 26 - Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key
    void leastKeyGreaterOrEqualThanGiven(TreeMap treeMap, int key) {
        System.out.println("\nTask 26 - get the least key greater than or equal to the given key. : " + key);
        System.out.println("Original: " + treeMap);
        System.out.println("Result: "+ treeMap.ceilingKey(key));
    }
}