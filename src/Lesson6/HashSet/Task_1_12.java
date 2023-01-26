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
        System.out.print("Hash set into array list: " + arrayList);


        // 10. Write a Java program to compare two hash set.

        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.

        // 12.Write a Java program to remove all of the elements from a hash set.
    }
}
