package Lesson6.HashSet;
import java.util.HashSet;

class HashSetDemo {
        public static void main(String[] args) {
            // create hash set with Strings
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("Red");
            hashSet.add("Blue");
            hashSet.add("Green");

            // create second hash set for operations
            HashSet<String> hashSetOther = new HashSet<>();
            hashSetOther.add("Black");
            hashSetOther.add("Blue");
            hashSetOther.add("Red");

            // create hash set with Chars
            HashSet<Character> hashSetChar = new HashSet<>();
            hashSetChar.add('A');
            hashSetChar.add('B');
            hashSetChar.add('C');

            HashSetFunctions hashSetFunctions = new HashSetFunctions();

            // Task 1 - Write a Java program to append the specified element to the end of a hash set.
            hashSetFunctions.addElementInHashSet(hashSet, "Gold");

            // Task 2 - Write a Java program to iterate through all elements in a hash list.
            hashSetFunctions.iterateThroughHashSet(hashSet);

            // Task 3 - Write a Java program to get the number of elements in a hash set.
            hashSetFunctions.getSizeOfHashSet(hashSet);

            // Task 4 - Empty hash set.
            hashSetFunctions.emptyHashSet(hashSetChar);

            // Task 5 check if Hashset is empty
            hashSetFunctions.checkIfEmpty(hashSetChar);

            // Task 6 - clone hash set
            hashSetFunctions.cloneHashSet(hashSet);

            // Task 7 - Write a Java program to convert a hash set to an array.
            hashSetFunctions.convertHashSetToArray(hashSet);

            // Task 8 - Write a Java program to convert a hash set to a tree set.
            hashSetFunctions.convertHashSetToTreeSet(hashSet);

            // Task 9 - Write a Java program to convert a hash set to a List/ArrayList.
            hashSetFunctions.convertHashSetToArrayList(hashSet);

            // 10. Write a Java program to compare two hash set.
            hashSetFunctions.compareTwoHashSets(hashSet,hashSetOther);

            // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
            hashSetFunctions.compareAndRetainEqualElements(hashSet, hashSetOther);

            // 12.Write a Java program to remove all the elements from a hash set.
            hashSetFunctions.removeAllElements(hashSet);
    }
}
