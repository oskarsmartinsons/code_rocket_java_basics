package Lesson5.LinkedList;

import java.util.*;

class LinkedList_Task_1_22 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("White");
        colors.add("Green");

        // Task 1 - add elements and print out linked list
        System.out.println("Task 1 - adds last element and print out: ");
        System.out.println("Original: " + colors);
        colors.addLast("Gold");
        System.out.println("After: " + colors);


        // Task 2 - iterate through linked list
        System.out.println("\nTask 2: ");
        colors.forEach(c-> System.out.println("Iterate through linked list: " + c));

        // Task 3 - iterate through linked list starting from specified position
        Iterator pos = colors.listIterator(1);
        System.out.println("\nTask 3 - iterate through starting from specified position: ");
        while(pos.hasNext()) {
            System.out.println("Element: " + pos.next());
        }

        // Task 4 - iterate through linked list starting from specified position
        Iterator posEnd = colors.descendingIterator();
        System.out.println("\nTask 4 - iterate through linked list in reverse order ");
        colors.descendingIterator().forEachRemaining(c-> System.out.println("Element: " + c));

        // Task 5 - add new element at specified position
        int index = 2;
        System.out.println("\nTask 5 - add new element at specified position: " + index);
        System.out.println("Original: " + colors);
        colors.add(index, "Bronze");
        System.out.println("After: " + colors);

        // Task 6 - insert new element at first and last position
        System.out.println("\nTask 6 - insert new element at first and last position: ");
        System.out.println("Original: " + colors);
        colors.addFirst("Pale");
        colors.addLast("Neon");
        System.out.println("After: " + colors);

        // Task 7 - insert new element at front of linked list
        System.out.println("\nTask 7 - insert new element at the front of linked list 'offerFirst()': ");
        System.out.println("Original: " + colors);
        colors.offerFirst("Silver");
        System.out.println("After: " + colors);

        // Task 8 - insert new element at front of linked list
        System.out.println("\nTask 8 - insert new element at the end of linked list 'offerLast()': ");
        System.out.println("Original: " + colors);
        colors.offerLast("Metal");
        System.out.println("After: " + colors);

        // Task 9 - insert new list with some elements in existing linked list
        LinkedList<String> newColors = new LinkedList<String>();
        newColors.add("Aqua");
        newColors.add("Cyan");
        System.out.println("\nTask 9 - insert new list with some elements in existing linked list at specified position: ");
        System.out.println("Original: " + colors);
        colors.addAll(2,newColors);
        System.out.println("After: " + colors);

        // Task 10 - get first and last occurrence of specified element in linked list
        String element = "White";
        System.out.println("\nTask 10 - get first and last occurrence of specified element in linked list: " + element);
        System.out.println("Original: " + colors);
        int firstOcc = colors.indexOf(element);
        int lastOcc = colors.lastIndexOf(element);
        System.out.println("Fist Occurrence at index: " + firstOcc);
        System.out.println("Last Occurrence at index: " + lastOcc);

        // Task 11 - print element position and value from linked list
        System.out.println("\nTask 11 - print element position and value from linked list: ");
        colors.forEach(c-> System.out.println(colors.indexOf(c) + " " + c));

        // Task 12 - remove element at specified index from linked list
        int removeInd = 0;
        System.out.println("\nTask 12 - remove element at specified index from linked list: " + removeInd);
        System.out.println("Original: " + colors);
        colors.remove(0);
        System.out.println("After: " + colors);

        // Task 13 - remove first and last element from linked list
        System.out.println("\nTask 13 - remove first and last element from linked list: ");
        System.out.println("Original: " + colors);
        colors.removeFirst();
        colors.removeLast();
        System.out.println("After: " + colors);

        // Task 14 - remove all elements from linked list
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("A");
        myList.add("B");
        System.out.println("\nTask 14 - remove all elements from linked list ");
        System.out.println("Original: " + myList);
        myList.clear();
        System.out.println("After: " + myList);

        // Task 15 - swap elements in linked list
        System.out.println("\nTask 15 - swap elements in linked list: first with second");
        System.out.println("Original: " + colors);
        Collections.swap(colors, 0,1);
        System.out.println("After: " + colors);

        // Task 16 - shuffle elements in linked list
        System.out.println("\nTask 16 - shuffle elements in linked list: ");
        System.out.println("Original: " + colors);
        Collections.shuffle(colors);
        System.out.println("After: " + colors);

        // Task 17 - join two linked lists
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.add(1);
        listOne.add(2);
        LinkedList<Integer> listTwo = new LinkedList<>();
        listTwo.add(3);
        listTwo.add(4);

        System.out.println("\nTask 17 - join two linked lists: ");
        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
        listOne.addAll(listTwo);
        System.out.println("List One + Two " + listOne );

        // Task 18 - clone linked lists into another
        LinkedList<Character> listMain = new LinkedList<>();
        listMain.add('A');
        listMain.add('B');
        LinkedList<Character> listCloned = new LinkedList<>();
        listCloned = (LinkedList<Character>) listMain.clone();

        System.out.println("\nTask 18 - clone linked lists into another: ");
        System.out.println("List Main: " + listMain);
        System.out.println("List Cloned: " + listCloned);

        // Task 19 - retrieve and remove first element from linked list
        System.out.println("\nTask 19 - retrieve and remove first element from linked list - removeFirst() or pollFirst()");
        System.out.println("Original: " + colors);
        System.out.println("First Element: " + colors.removeFirst());
        System.out.println("After: " + colors);

        // Task 20 - retrieve and but don't remove first element from linked list
        System.out.println("\nTask 20 - retrieve but don't remove first element from linked list - getFirst() or peekFirst()\" ");
        System.out.println("Original: " + colors);
        System.out.println("First Element: " + colors.getFirst());
        System.out.println("After: " + colors);

        // Task 21 - retrieve and but don't remove last element from linked list
        System.out.println("\nTask 20 - retrieve but don't remove last element from linked list - getFirst() or peekFirst()");
        System.out.println("Original: " + colors);
        System.out.println("Last Element: " + colors.getFirst());
        System.out.println("After: " + colors);

        // Task 22 - check if element exists in linked list
        System.out.println("\nTask 22 - check if element exists in linked list");
        System.out.println("Original: " + colors);
        System.out.println("Contains 'White' ? " + colors.contains("White"));

        // Task 23 - convert linked list to array list
        System.out.println("\nTask 23 - convert linked list to array list");
        System.out.println("Original: " + colors);
        List<String> colorList1 = colors.stream().toList();
        List<String> colorList2 = new ArrayList<String>(colors);
        System.out.println("Converted to List using stream().toList(): " + colorList1);
        System.out.println("Converted to List: " + colorList2);

        // Task 24 - compare two linked lists
        System.out.println("\nTask 24 - compare two linked lists");

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(2);

        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(1);
        linkedList2.add(3);
        linkedList2.add(2);

        System.out.println("Linked List 1: " + linkedList1);
        System.out.println("Linked List 2: " + linkedList2);

        System.out.println("Are the lists the same? : " + linkedList1.equals(linkedList2));

        // Task 25 - check if linked list is empty
        System.out.println("\nTask 25 - check if linked list is empty");
        System.out.println("Original: " + colors);
        System.out.println("Is linked list empty? " + colors.isEmpty());

        // Task 26 - replace element in linked list
        System.out.println("\nTask 26 - replace element in linked list");
        System.out.println("Original: " + colors);
        System.out.println("Replace element Nr.2 with 'Brown' :");
        colors.set(2,"Brown");
        System.out.println(colors);
    }
}
