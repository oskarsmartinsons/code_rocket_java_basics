package Lesson6.HashSet;

import java.util.*;

class HashSetFunctions {

        // Task 1 - Write a Java program to append the specified element to the end of a hash set.
        void addElementInHashSet(HashSet hashSet, Object elem) {
                System.out.println("Task 1 - add element at the end of the has set");
                System.out.println("Before: " + hashSet);
                hashSet.add(elem);
                System.out.println("After: " + hashSet);
        }

        // Task 2 - Write a Java program to iterate through all elements in a hash list.
        void iterateThroughHashSet(HashSet hashSet) {
                System.out.println("\nTask 2 - iterate through the elements through has set");
                Iterator<String> iterator = hashSet.iterator();
                while (iterator.hasNext()) {
                        System.out.println("Iterate through elements: " + iterator.next());
                }
        }

        // Task 3 - Write a Java program to get the number of elements in a hash set.
        void getSizeOfHashSet(HashSet hashSet) {
                System.out.println("\nTask 3 - get the number of elements in hash set");
                System.out.println("Original: " + hashSet);
                int size = hashSet.size();
                System.out.println("Size of Original: " + size);
        }

        // Task 4 - Empty hash set.
        void emptyHashSet (HashSet hashSet) {
                System.out.println("\nTask 4  - empty hash set: ");
                System.out.println("Original: " + hashSet);
                hashSet.clear();
                System.out.println("Empty/cleared  hashset: " + hashSet);
        }

        // Task 5 check if Hashset is empty
        void checkIfEmpty(HashSet hashSet) {
                System.out.println("\nTask 5 - check if hash set is empty:");
                System.out.println("Original: " + hashSet);
                // check if empty
                boolean isEmpty = hashSet.isEmpty();
                System.out.println("Is cloned hash set empty? " + isEmpty);
        }

        // Task 6 - clone hash set
        void cloneHashSet (HashSet hashSet) {
                System.out.println("\nTask 6 - clone hash set");
                System.out.println("Original: " + hashSet);
                // clone hash se
                HashSet<String> cloned = (HashSet) hashSet.clone();
                System.out.println("Cloned : " + cloned);
        }

        // Task 7 - Write a Java program to convert a hash set to an array.
        void convertHashSetToArray (HashSet hashSet) {
                System.out.println("\nTask 7 - Write a Java program to convert a hash set to an array.");
                System.out.println("Original hash set: " + hashSet);
                // covert to array
                Object[] array = hashSet.toArray(new String[0]);
                System.out.print("Hash set into Array: ");
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
        }

        // Task 8 - Write a Java program to convert a hash set to a tree set.
        void convertHashSetToTreeSet(HashSet hashSet) {
                System.out.println("\n\nTask 8 - Write a Java program to convert a hash set to a tree set.");
                System.out.println("Original hash set: " + hashSet);
                // covert to Tree Set
                Set<String> treeSet = new TreeSet<>(hashSet);
                System.out.print("Hash set into tree set: ");
                for (String t : treeSet) {
                        System.out.print(t + " ");
                }
        }

        // Task 9 - Write a Java program to convert a hash set to a List/ArrayList.
        void convertHashSetToArrayList (HashSet hashSet) {
                System.out.println("\n\nTask 9 - Write a Java program to convert a hash set to a List/ArrayList.");
                System.out.println("Original hash set: " + hashSet);
                // covert to Array List
                List<String> arrayList = new ArrayList<>(hashSet);
                System.out.print("Hash set into array list: " + arrayList + "\n");
        }

        // 10. Write a Java program to compare two hash set.
        void compareTwoHashSets (HashSet hashSet1, HashSet hashSet2) {
                System.out.println("\nTask 10 - Write a Java program to compare two hash set.");
                System.out.println("Original: " + hashSet1);
                System.out.println("Comparable: " + hashSet2);
                // compare if both hash sets are equal
                boolean isEqual = hashSet1.equals(hashSet2);
                System.out.println("Are hash sets equal ? " + isEqual);
                System.out.println("Which elements are equal in Original and Comparable hash set: " );
                // compare first hash set with other by elements
                hashSet1.forEach(elem-> System.out.println(hashSet2.contains(elem)?elem+": Yes":elem+": No"));
        }

        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
        void compareAndRetainEqualElements(HashSet hashSet1, HashSet hashSet2) {
                System.out.println("\nTask 11 - Retain elements which are the same in both hash sets: ");
                System.out.println("Original: " + hashSet1);
                System.out.println("Comparable: " + hashSet2);
                // retain all elements that are equal
                hashSet1.retainAll(hashSet2);
                System.out.println("Same: " + hashSet1);
        }

        // 12.Write a Java program to remove all the elements from a hash set.
        void removeAllElements (HashSet hashSet) {
                System.out.println("\nTask 12 - Write a Java program to remove all of the elements from a hash set.");
                System.out.println("Original: " + hashSet);
                hashSet.clear();
                System.out.println("Cleared hash set: " + hashSet);
        }
}
