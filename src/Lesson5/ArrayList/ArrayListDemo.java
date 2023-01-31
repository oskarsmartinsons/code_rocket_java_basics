package Lesson5.ArrayList;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        // create String array list for tasks
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        // create another String array list for the tasks
        ArrayList<String> newColors = new ArrayList<>();
        newColors.add("Golden");
        newColors.add("Pink");

        ArrayListFunctions arrayListFunctions = new ArrayListFunctions();

        // Task 1 - add elements and print out array
        arrayListFunctions.addElementAndPrintOut(colors, "Purple");

        // Task 2 - iterate through array
        arrayListFunctions.iterateThroughArrayList(colors);

        // Task 3 - add new element at first position
        arrayListFunctions.addElementAtFirstPosition(colors,"Yellow");

        // Task 4 - retrieve  element at specific index
        arrayListFunctions.retrieveElementAtGivenIndex(colors, 3);

        // Task 5 - Update specific array element by given element
        arrayListFunctions.replaceElement(colors, "Black", "White");

        // Task 6 - Write a Java program to remove the third element from a array list.
        arrayListFunctions.removeElement(colors, 2);

        // Task 7 - search element in array
        arrayListFunctions.isElementPresent(colors, "Red");

        // Task 8 - sort elements in array list
        arrayListFunctions.sortElements(colors);

        // Task 9 - copy array list into another using
        arrayListFunctions.copyArrayListIntoAnother(colors,newColors);

        // Task 10 - shuffle array list elements
        arrayListFunctions.shuffleArrayList(colors);

        // Task 11 - reverse array list elements
        arrayListFunctions.reverseArrayList(colors);
    }
}
