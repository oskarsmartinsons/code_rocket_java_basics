package Lesson5.ArrayList;

import java.util.*;

class ArrayList_Task_1_22 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        // Task 1 - add elements and print out array
        System.out.println("Task 1 - add elements and print out: \n" + colors);

        // Task 2 - iterate through array
        System.out.println("\nTask 2: ");
        colors.forEach(c-> System.out.println("Iterate through array: " + c));

        // Task 3 - add new element at first position
        colors.add(0,"Yellow");
        System.out.println("\nTask 3 - add element at first position: \n" + colors);

        // Task 4 - retrieve  element at specific index
        System.out.printf("\nTask 4 - retrieve element at index %d: \n%s\n",  3, colors.get(3));

        // Task 5 - update (replace) specific element with another
        int updateInd = 4;
        colors.set(updateInd,"Grey");
        System.out.printf("\nTask 5 - update element at index %d: \n%s\n", updateInd, colors );

        // Task 6 - remove element from array
        int removeInd = 2;
        colors.remove(removeInd);
        System.out.printf("\nTask 6 - remove element at index %d: \n%s\n", removeInd, colors );

        // Task 7 - search element in array
        String searchFor = "Red";
        boolean isPresent = colors.contains(searchFor);
        System.out.printf("\nTask 7 - is element '%s' in array ?  \n%s\n", searchFor,  isPresent );

        // Task 8 - sort elements in array
        Collections.sort(colors);
        System.out.printf("\nTask 8 - sorted array asc (Collections class): \n%s\n", colors );

        // Task 9 - copy array list into another using clone ()
        ArrayList<String> newColors = new ArrayList<>();
        newColors.add("Golden");
        newColors.add("Pink");

        System.out.println("\nTask 9 - copy array list into another");
        System.out.println("Original: " + colors);
        System.out.println("New colors : " + newColors);

        Collections.copy(colors, newColors);
        System.out.println("Copied array: " + colors);

        // Task 10 - shuffle array list elements
        System.out.println("\nTask 10 - shuffle elements : ");
        System.out.println("Before: " + colors);
        Collections.shuffle(colors);
        System.out.println("After: " + colors);


        // Task 11 - reverse array list elements
        System.out.println("\nTask 11 - reverse array elements:");
        System.out.println("Before: " + colors);
        colors.sort(Comparator.reverseOrder());
        System.out.println("After: " + colors );

        // Task 12 - extract array list elements
        List<String> subColors = new ArrayList<String>();
        int startInd = 1;
        int endInd =3;
        subColors=colors.subList(startInd,endInd);
        System.out.printf("\nTask 12 - extract elements from %d - %d : \n%s\n", startInd, endInd, subColors);

        // Task 13 - compare two array list elements
        List<String> colorsOther = new ArrayList<String>();
        colorsOther.add("Yellow");
        colorsOther.add("Red");
        colorsOther.add("Grey");
        colorsOther.add("Green");
        colorsOther.add("Blue");

        System.out.printf("\nTask 13 - Are arrays equal ? : \n%s\n", colors.equals(colorsOther));
        System.out.println("Original: " + colors);
        System.out.println("Other: " + colorsOther);


        // Task 14 - swap array list elements
        int swapInd1 = 0;
        int swapInd2 = 4;
        Collections.swap(colors,swapInd1,swapInd2);
        System.out.printf("\nTask 14 - swap element with index %d to index %d: \n%s\n", swapInd1, swapInd2, colors);

        // Task 15 - join two arrays
        List<String> colorsExtra = new ArrayList<String>();
        colorsExtra.add("Aqua");
        colorsExtra.add("Cyan");

        System.out.println("\nTask 15 - join two arrays");

        System.out.println("New Colors: " + colorsExtra);
        System.out.println("Old Colors: " + colors);

        colorsExtra.addAll(colors);
        System.out.println("Joined New + Old colors: " + colorsExtra);

        // Task 16 - clone array list into another array
        ArrayList<String> clonedColors = new ArrayList<>();
        System.out.println("\nTask 16 - clone array list with .clone()" );
        System.out.println("Original colors: " + colors);

        clonedColors = (ArrayList<String>) colors.clone();
        System.out.println("Cloned array: " + clonedColors);

        // Task 17 - empty array list
        List<Integer> listToEmpty= new ArrayList<Integer>();
        listToEmpty.add(1);
        listToEmpty.add(3);
        listToEmpty.add(2);
        System.out.println("\nTask 17 - empty array list:");
        System.out.println("Before: " + listToEmpty);
        listToEmpty.clear();
        System.out.println("After: " + listToEmpty );

        // Task 18 - test if array list is empty?
        System.out.println("\nTask 18 - is array list empty?");
        System.out.println(colorsOther.isEmpty());
        System.out.println("Original: " + colors);

        // Task 19 - trim capacity of current size
        System.out.println("\nTask 19 - trim capacity to array list current size");
        System.out.println("Original: " + colors + ", Current Size : " + colors.size());
        colors.trimToSize();
        System.out.println("Trim to size: " + colors + ", Trimmed Size: " + colors.size());

        // Task 20 - increase the size
        System.out.println("\nTask 20 - increase the size");
        System.out.println("Original: " + colors + ", Current Size : " + colors.size());
        colors.ensureCapacity(10);
        System.out.println("Increased capacity: " + colors + ", Increased    : " + colors.size());

        // Task 21 - replace the second element with specified element
        System.out.println("\nTask 21 - replace second element with specified element");
        System.out.println("Original: " + colors);
        colors.set(2,"Orange");
        System.out.println("After: " + colors);

        // Task 22 - print elements using position
        System.out.println("\nTask 22 - print out element using position ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Using 'fori' : " + colors.get(i));
        }
    }
}
