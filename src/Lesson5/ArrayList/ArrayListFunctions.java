package Lesson5.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrayListFunctions {

    // Task 1 - add elements and print out array
    void addElementAndPrintOut(ArrayList arrayList, Object element){
        System.out.println("Task 1 - add element and print out list: \n" + arrayList);
        arrayList.add(element);
        System.out.println("After: " + arrayList);
    }

    // Task 2 - iterate through array
    void iterateThroughArrayList(ArrayList arrayList) {
        System.out.println("\nTask 2: iterate through array");
        arrayList.forEach(c -> System.out.println("Iterate through array: " + c));
    }

    // Task 3 - add new element at first position
    void addElementAtFirstPosition(ArrayList arrayList, Object element) {
        System.out.println("\nTask 3 - add new element at first position: ");
        System.out.println("Original: " + arrayList);
        arrayList.add(0, element);
        System.out.println("Result: " + arrayList);
    }

    // Task 4 - retrieve  element at specific index
    void retrieveElementAtGivenIndex(ArrayList arrayList, int index) {
        System.out.printf("\nTask 4 - retrieve element at index %d ", index);
        System.out.println("\nOriginal: " + arrayList);
        System.out.println("Result: " + arrayList.get(index));
    }

    // Task 5 - Update specific array element by given element
    void replaceElement(ArrayList arrayList, Object oldElement, Object newElement) {
        System.out.printf("\nTask 5 - Update specific array element '%s' by given element '%s': ", oldElement, newElement);
        System.out.println("\nOriginal: " + arrayList);
        // get the index of the old element
        int getPosition = arrayList.indexOf(oldElement);
        // replace index with new element
        arrayList.set(getPosition, newElement);
        System.out.println("Result: " + arrayList);
    }

    // Task 6 - Write a Java program to remove the third element from a array list.
    void removeElement(ArrayList arrayList, int index) {
        System.out.printf("\nTask 6 - remove the %d element from a array list", index);
        System.out.println("\nOriginal: " + arrayList);
        arrayList.remove(index);
        System.out.println("After: " + arrayList);
    }

    // Task 7 - search element in array
    void isElementPresent(ArrayList arrayList, Object element) {
        System.out.printf("\nTask 7 - is element '%s' in array ?", element);
        System.out.println("\nOriginal: " + arrayList);
        System.out.println("Answer: " + arrayList.contains(element));
    }

    // Task 8 - sort elements in array list
    void sortElements(ArrayList arrayList) {
        System.out.println("\nTask 8 - sort elements in array list");
        System.out.println("Original: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted: " + arrayList);
    }

    // Task 9 - copy array list into another
    void copyArrayListIntoAnother(ArrayList arrayList1, ArrayList arrayList2) {
        System.out.println("\nTask 9 - copy array list (list 2) into another (list1)");
        System.out.println("Original: " + arrayList1);
        System.out.println("New array list : " + arrayList2);
        Collections.copy(arrayList1, arrayList2);
        System.out.println("Copied array list: " + arrayList1);
    }

    // Task 10 - shuffle array list elements
    void shuffleArrayList(ArrayList arrayList) {
        System.out.println("\nTask 10 - shuffle array list elements : ");
        System.out.println("Before: " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("After: " + arrayList);
    }

    // Task 11 - reverse array list elements
    void reverseArrayList(ArrayList arrayList) {
        System.out.println("\nTask 11 - reverse array elements:");
        System.out.println("Before: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After: " + arrayList);
    }
}
