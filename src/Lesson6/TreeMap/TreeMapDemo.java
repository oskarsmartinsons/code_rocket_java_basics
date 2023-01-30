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
        treeMap.put(8, 'O');

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

        // Task 5 - Write a Java program to get all keys from the given a Tree Map
        treeMapFunctions.getAllKeysKeys(treeMap);

        // Task 6 - Write a Java program to delete all elements from a given Tree Map.
        treeMapFunctions.removeAllElements(treeMapOther);

        // Task 7 - Write a Java program to sort keys in Tree Map by using comparator.
        treeMapFunctions.sortKeys(treeMap);

        // Task 8 - Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        treeMapFunctions.leastAndGreatestKeyEntry(treeMap);

        // Task 9 - Write a Java program to get the first (lowest) key and the last (highest) key currently in a map
        treeMapFunctions.lowestFirstAndHighestLastKey(treeMap);

        // Task 10 -Write a Java program to get a reverse order view of the keys contained in a given map
        treeMapFunctions.reverseOrderViewOfKeys(treeMap);

        // Task 11 - Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key
        treeMapFunctions.pairsWithKeySmallerOrEqual(treeMap, 5);

        // Task 12 - Write a Java program to get the greatest key less than or equal to the given key
        treeMapFunctions.keySmallerOrEqualThanGiven(treeMap, 5);

        // Task 13 - Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        treeMapFunctions.portionFromMapLessThanKey(treeMap, 4);

        // Task 14 - Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
        treeMapFunctions.portionFromMapLessOrEqualThanKey(treeMap, 4);

        // Task 15 - Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        treeMapFunctions.leastKeyGreaterThanGiven(treeMap, 3);

        // Task 16 - Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
        treeMapFunctions.pairsWithKeySmallerThanGiven(treeMap, 4);

        // Task 17 - Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
        treeMapFunctions.greatestKeyLessThanGiven(treeMap, 4);

        // Task 18 - Write a Java program to get NavigableSet view of the keys contained in a map
        treeMapFunctions.getNavigableSetView(treeMap);

        // Task 19 - Write a Java program to remove and get a key-value mapping associated with the least key in a map.
        treeMapFunctions.getAndRemoveFirstPair(treeMap);

        // Task 20 - Write a Java program to remove and get a key-value mapping associated with the greatest key in a map.
        treeMapFunctions.getAndRemoveLastPair(treeMap);

        // Task 21 - Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)
        treeMapFunctions.portionOfKeysInRange(treeMap, 2,3);

        // Task 22 - Write a Java program to get the portion of a map whose keys range from a given key to another key
        treeMapFunctions.portionOfKeysInRangeExclusive(treeMap,2,3);

        // Task 23 - Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        treeMapFunctions.portionOfGreaterOrEqualKeysThanGiven(treeMap, 3);

        // Task 24 - Write a Java program to get a portion of a map whose keys are greater than to a given key
        treeMapFunctions.portionOfGreaterKeysThanGiven(treeMap, 3);

        // Task 25 - Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key
        treeMapFunctions.pairWithKeyGreaterOrEqualThanGiven(treeMap,3);

        // Task 26 - Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key
        treeMapFunctions.leastKeyGreaterOrEqualThanGiven(treeMap,3);
    }
}
