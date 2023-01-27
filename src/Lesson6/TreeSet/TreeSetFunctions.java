package Lesson6.TreeSet;
import java.util.TreeSet;

class TreeSetFunctions {

    // Task 1 - Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    void createAndPrintOutTreeSet () {
        System.out.println("Task 1 - create tree set and print it out");
        // creating tree set
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        // printing out
        System.out.println("Created Tree set: " + treeSet);
    }

    // Task 2 - Write a Java program to iterate through all elements in a tree set.
    void iterateThroughTreeSet(TreeSet treeSet) {
        System.out.println("\nTask 2 - iterate through the elements in tree set");
        treeSet.forEach(t -> System.out.println("Iterate through elements: " + t));
    }

    // Task 3 - Write a Java program to add all the elements of a specified tree set to another tree set.
    void addElements(TreeSet treeSet1, TreeSet treeSet2) {
        System.out.println("\nTask 3 - Write a Java program to add all the elements of a specified tree set to another tree set.");
        System.out.println("Specified tree set: " + treeSet1);
        System.out.println("Another tree set: " + treeSet2);
        // add elements
        treeSet1.addAll(treeSet2);
        System.out.println("After adding: " + treeSet1);
    }

    // Task 4 - Write a Java program to create a reverse order view of the elements contained in a given tree set.
    void reverseView(TreeSet treeSet) {
        System.out.println("\nTask 4 - Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        System.out.print("Original order: ");
        treeSet.forEach(t -> System.out.print(t + " "));
      //  Iterator<Character> iterator = treeSet1.descendingIterator();
        System.out.print("\nReverse order: ");
        treeSet.descendingSet().forEach(t -> System.out.print(t + " "));
    }

    // Task - 5 Write a Java program to get the first and last elements in a tree set
    void getFirstAndLast (TreeSet treeSet) {
        System.out.println("\n\nTask - 5 Write a Java program to get the first and last elements in a tree set.");
        System.out.println("Original tree set: " + treeSet);
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }

    // Task 6 - Write a Java program to clone a tree set list to another tree set
    void cloneTreeSet (TreeSet treeSet) {
        System.out.println("\nTask 6 - Write a Java program to clone a tree set list to another tree set.");
        System.out.println("Original tree set: " + treeSet);
        // clone tree set
        Object treeSetCloned = treeSet.clone();
        System.out.println("Cloned tree set: " + treeSetCloned);
    }
    // Task 7 -Write a Java program to get the number of elements in a tree set.
    void getSizeofTreeSet(TreeSet treeSet) {
        System.out.println("\nTask 7 -Write a Java program to get the number of elements in a tree set.");
        System.out.println("Original tree set: " + treeSet);
        System.out.println("Size of tree set: " + treeSet.size());
    }

    // Task 8 - Write a Java program to compare two tree sets.
    void compareTreeSets(TreeSet treeSet1, TreeSet treeSet2) {
        System.out.println("\nTask 8 - Write a Java program to compare two tree sets.");
        System.out.println("Original tree: " + treeSet1);
        System.out.println("Another tree: " + treeSet2);
        // compare first tree set with other by elements
        treeSet1.forEach(elem-> System.out.println(treeSet2.contains(elem)?elem+": Yes":elem+": No"));
    }

    // Task 9 - Write a Java program to find the numbers less than 7 in a tree set
    void findNumberLessThan7 (TreeSet<Integer> treeIntegers) {
        System.out.println("\nTask 9 - Elements smaller that 7: ");
        System.out.println("Original: " + treeIntegers);
        System.out.println("Result: " + treeIntegers.headSet(7, false));
    }

    // Task 10 - Write a Java program to get the element in a tree set which is greater than or equal to the given element
    void findNumberEqualOrGreaterThan (TreeSet<Integer> treeIntegers, int number) {
        System.out.println("\nTask 10 - Element equal or greater than: " + number);
        System.out.println("Original: " + treeIntegers);
        System.out.println("Result: "+ treeIntegers.ceiling(number));
    }

    // Task 11 - Write a Java program to get the element in a tree set which is less than or equal to the given element
    void findNumberEqualOrSmallerThan (TreeSet<Integer> treeIntegers, int number) {
        System.out.println("\nTask 11 - Element equal or smaller than: " + number);
        System.out.println("Original: " + treeIntegers);
        System.out.println("Result: "+ treeIntegers.floor(number));
    }

    // Task 12 - Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
    void findNumberStrictlyGreaterThan (TreeSet<Integer> treeIntegers, int number) {
        System.out.println("\nTask 12 - Element that is strictly greater than: " + number);
        System.out.println("Original: " + treeIntegers);
        System.out.println("Result: "+ treeIntegers.higher(number));
    }

    // Task 13 - Write a Java program to get an element in a tree set which is strictly less than the given element
    void findNumberStrictlySmallerThan (TreeSet<Integer> treeIntegers, int number) {
        System.out.println("\nTask 13 - Element that is strictly smaller than: " + number);
        System.out.println("Original: " + treeIntegers);
        System.out.println("Result: "+ treeIntegers.lower(number));
    }

    // Task 14 - Write a Java program to retrieve and remove the first element of a tree set
    void retrieveAndRemoveFirstElement (TreeSet<Integer> treeIntegers) {
        System.out.println("\nTask 14 - Retrieve and remove the first element: ");
        System.out.println("Original: " + treeIntegers);
        System.out.println("First element: " + treeIntegers.pollFirst());
        System.out.println("Result: "+ treeIntegers);
    }

    // Task 15 - Write a Java program to retrieve and remove the last element of a tree set
    void retrieveAndRemoveLastElement (TreeSet<Integer> treeIntegers) {
        System.out.println("\nTask 15 - Retrieve and remove the last element: ");
        System.out.println("Original: " + treeIntegers);
        System.out.println("Last element: " + treeIntegers.pollLast());
        System.out.println("Result: "+ treeIntegers);
    }

    // Task 16 - Write a Java program to remove a given element from a tree set.
    void removeSpecifiedElement (TreeSet treeSet, Object element) {
        System.out.println("\nTask 16 - Remove specified element: ");
        System.out.println("Original: " + treeSet);
        System.out.println("Element removed? : " + treeSet.remove(element));
        System.out.println("Result: "+ treeSet);
    }
}
