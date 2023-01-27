package Lesson6.TreeSet;

import java.util.TreeSet;

class TreeSetDemo {
    public static void main(String[] args) {
        // creating main tree set of Chars
        TreeSet<Character> treeSet1 = new TreeSet<>();
        treeSet1.add('A');
        treeSet1.add('B');
        treeSet1.add('C');

        // creating another tree set of Chars
        TreeSet<Character> treeSet2 = new TreeSet<>();
        treeSet2.add('D');
        treeSet2.add('A');

        // creating integer tree set of Integers
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        treeSetIntegers.add(1);
        treeSetIntegers.add(4);
        treeSetIntegers.add(7);
        treeSetIntegers.add(8);
        treeSetIntegers.add(10);

        TreeSetFunctions treeSetFunctions = new TreeSetFunctions();

        // Task 1 - Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        treeSetFunctions.createAndPrintOutTreeSet();

        // Task 2 - Write a Java program to iterate through all elements in a tree set.
        treeSetFunctions.iterateThroughTreeSet(treeSet1);

        // Task 3 - Write a Java program to add all the elements of a specified tree set to another tree set.
        treeSetFunctions.addElements(treeSet1,treeSet2);

        // Task 4 - Write a Java program to create a reverse order view of the elements contained in a given tree set.
        treeSetFunctions.reverseView(treeSet1);

        // Task 5 - Write a Java program to get the first and last elements in a tree set
        treeSetFunctions.getFirstAndLast(treeSet1);

        // Task 6 - Write a Java program to clone a tree set list to another tree set
        treeSetFunctions.cloneTreeSet(treeSetIntegers);

        // Task 7 -Write a Java program to get the number of elements in a tree set.
        treeSetFunctions.getSizeofTreeSet(treeSet1);

        // Task 8 - Write a Java program to compare two tree sets.
        treeSetFunctions.compareTreeSets(treeSet1, treeSet2);

        // Task 9 - Write a Java program to find the numbers less than 7 in a tree set
        treeSetFunctions.findNumberLessThan7(treeSetIntegers);

        // Task 10 - Write a Java program to get the element in a tree set which is greater than or equal to the given element
        treeSetFunctions.findNumberEqualOrGreaterThan(treeSetIntegers,5);

        // Task 11 - Write a Java program to get the element in a tree set which is less than or equal to the given element
        treeSetFunctions.findNumberEqualOrSmallerThan(treeSetIntegers, 9);

        // Task 12 - Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
        treeSetFunctions.findNumberStrictlyGreaterThan(treeSetIntegers, 7);

        // Task 13 - Write a Java program to get an element in a tree set which is strictly less than the given element
        treeSetFunctions.findNumberStrictlySmallerThan(treeSetIntegers, 8);

        // Task 14 - Write a Java program to retrieve and remove the first element of a tree set
        treeSetFunctions.retrieveAndRemoveFirstElement(treeSetIntegers);

        // Task 15 - Write a Java program to retrieve and remove the last element of a tree set
        treeSetFunctions.retrieveAndRemoveLastElement(treeSetIntegers);

        // Task 16 - Write a Java program to remove a given element from a tree set.
        treeSetFunctions.removeSpecifiedElement(treeSet1, 'A');

    }
}
