package Lesson6.HashSet;

import java.util.*;

public class Task_1_12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");

        // Task 1 - Write a Java program to append the specified element to the end of a hash set.
        System.out.println("Task 1 - add element at the end of the has set");
        System.out.println("Before: " + hashSet);
        hashSet.add("White");
        System.out.println("After: " + hashSet);

        // Task 2 - Write a Java program to iterate through all elements in a hash list.
        System.out.println("\nTask 2 - iterate through the elements through has set");
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterate through elements: " + iterator.next());
        }

        // Task 3 - Write a Java program to get the number of elements in a hash set. .
        System.out.println("\nTask 3 - get the number of elements in hash set");
        System.out.println("Original: " + hashSet);
        int size = hashSet.size();
        System.out.println("Size of Original: " + size);

        // Task 4,5,6 - Write a Java program to empty an hash set.
        System.out.println("\nTask 4,5,6 - clone hash set, empty hash set, check if it is empty");
        System.out.println("Original: " + hashSet);
        // clone hash set
        HashSet<String> cloned = (HashSet)hashSet.clone();
        System.out.println("Cloned : " + cloned);
        // clear hash set
        cloned.clear();
        System.out.println("Empty/Clear Cloned hashset: " + cloned);
        // check if empty
        boolean isEmpty = cloned.isEmpty();
        System.out.println("Is cloned hash set empty? " + isEmpty);

        // Task 7 - Write a Java program to convert a hash set to an array. .
        System.out.println("\nTask 7 - Write a Java program to convert a hash set to an array.");
        System.out.println("Original hash set: " + hashSet);
        // covert to array
        String[] array = hashSet.toArray(new String[0]);
        System.out.print("Hash set into Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Task 8 - Write a Java program to convert a hash set to a tree set.
        System.out.println("\nTask 8 - Write a Java program to convert a hash set to a tree set.");
        System.out.println("Original hash set: " + hashSet);
        // covert to Tree Set
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.print("Hash set into tree set: ");
        for (String t : treeSet) {
            System.out.print(t + " ");
        }
        System.out.println();

        // Task 9 - Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("\nTask 9 - Write a Java program to convert a hash set to a List/ArrayList.");
        System.out.println("Original hash set: " + hashSet);
        // covert to Array List
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.print("Hash set into array list: " + arrayList +"\n");


        // 10. Write a Java program to compare two hash set.
        System.out.println("\nTask 10 - Write a Java program to compare two hash set.");
        System.out.println("Original: " + hashSet);
        // create other hash set to compare with original
        HashSet<String> otherHashSet = new HashSet<>();
        otherHashSet.add("White");
        otherHashSet.add("Black");
        otherHashSet.add("Red");

        System.out.println("Other hash set: " + otherHashSet);

        // compare if both hash sets are equal
        boolean isEqual = hashSet.equals(otherHashSet);
        System.out.println("Are hashsets equal ? " + isEqual);
        System.out.println("Which elements are equal in Original and Other hash set: " );
        // compare first hash set with other by elements
        hashSet.forEach(elem-> System.out.println(otherHashSet.contains(elem)?elem+": Yes":elem+": No"));

        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
        System.out.print("Task 11 - Retain elements which are the same in both hash sets: ");
        // retain all elements that are equal
        hashSet.retainAll(otherHashSet);
        System.out.println(hashSet);

        // 12.Write a Java program to remove all of the elements from a hash set.
        System.out.println("\nTask 12 - Write a Java program to remove all of the elements from a hash set.");
        System.out.println("Original: " + hashSet);
        hashSet.clear();
        System.out.println("Cleared hash set: " + hashSet);
    }
}
