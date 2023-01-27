package Lesson6.PriorityQueue;

import java.util.*;

class PriorityQueueFunctions {
    // Task 1 - Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue
    void createAndPrintOutPriorityQueue () {
        System.out.println("Task 1 - create priority queue and print it out");
        // creating priority queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Blue");
        priorityQueue.add("Green");
        // printing out
        System.out.println("Created Priority Queue: " + priorityQueue);
    }

   // Task 2 - Write a Java program to iterate through all elements in a priority queue.
    void iterateThroughPriorityQueue(PriorityQueue priorityQueue) {
        System.out.println("\nTask 2 - iterate through the elements in priority queue");
        System.out.println("Original: " + priorityQueue);
        priorityQueue.forEach(t -> System.out.println("Iterate through elements: " + t));
    }

    // Task 3 - Write a Java program to add all the elements of a priority queue to another priority queue.
    void addElements(PriorityQueue priorityQueue1, PriorityQueue priorityQueue2) {
        System.out.println("\nTask 3 - Write a Java program to add all the elements of a priority queue to another priority queue.");
        System.out.println("Specified priority queue: " + priorityQueue1);
        System.out.println("Another priority queue: " + priorityQueue2);
        // add elements
        priorityQueue1.addAll(priorityQueue2);
        System.out.println("After adding: " + priorityQueue1);
    }

    // Task 4 - insert given element into priority queue
    void insertElement(PriorityQueue priorityQueue, Object element) {
        System.out.println("\nTask 4 - insert given element into priority queue");
        System.out.println("Original: " + priorityQueue);
        System.out.println("Element " + element +" inserted? " + priorityQueue.add(element));
        System.out.println("After insert: " + priorityQueue);
    }

    // Task 5 - Write a Java program to remove all elements from a priority queue.
    void removeAllElements (PriorityQueue priorityQueue) {
        System.out.println("\nTask 5 - Remove all elements: ");
        System.out.println("Original: " + priorityQueue);
        priorityQueue.clear();
        System.out.println("Result: "+ priorityQueue);
    }

    // Task 6 -Write a Java program to get the number of elements in a priority queue.
    void getSizeofPriorityQueue(PriorityQueue priorityQueue) {
        System.out.println("\nTask 6 -Write a Java program to get the number of elements in a priority queue.");
        System.out.println("Original: " + priorityQueue);
        System.out.println("Size of priority queue: " + priorityQueue.size());
    }

    // Task 7 - Write a Java program to compare two priority queues.
    void comparePriorityQueueElements(PriorityQueue priorityQueue1, PriorityQueue priorityQueue2) {
        System.out.println("\nTask 8 - Write a Java program to compare two priority queues.");
        System.out.println("Original: " + priorityQueue1);
        System.out.println("Another: " + priorityQueue2);
        // compare first queue with other by elements
        priorityQueue1.forEach(elem-> System.out.println(priorityQueue2.contains(elem)?elem+": Yes":elem+": No"));
    }

    // Task 8 - Write a Java program to retrieve first elements
    void retrieveFirstElement(PriorityQueue priorityQueue) {
        System.out.println("\nTask 8 - Write a Java program to retrieve first element: ");
        System.out.println("Original: " + priorityQueue);
        System.out.println("First element: " + priorityQueue.peek());
    }

    // Task 9 - Write a Java program to retrieve and remove the first element
    void retrieveAndRemoveFirstElement(PriorityQueue priorityQueue) {
        System.out.println("\nTask 9 - Retrieve and remove the first element: ");
        System.out.println("Original: " + priorityQueue);
        System.out.println("First element: " + priorityQueue.poll());
        System.out.println("Result: "+ priorityQueue);
    }

    // Task 10 - Write a Java program to convert a priority queue to an array.
    void convertPrimaryQueueToArray (PriorityQueue priorityQueue) {
        System.out.println("\nTask 10 - Write a Java program to convert a priority queue to an array.");
        System.out.println("Original queue: " + priorityQueue);
        // covert to array
        Object[] array = priorityQueue.toArray(new Object[0]);
        System.out.print("Priority Queue into Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Task 11 - Write a Java program to convert a Priority Queue elements to a string representation
    void convertPriorityQueueToString (PriorityQueue priorityQueue) {
        System.out.println("\n\nTask 11 - Write a Java program to convert a priority queue to String.");
        System.out.println("Original queue: " + priorityQueue);
        priorityQueue.toString();
        System.out.println("Priority Queue into String: " + priorityQueue);
    }

    // Task 12 - Write a Java program to change priorityQueue to maximum priority queue.
    void changePriorityToMaxPriorityQueue(PriorityQueue priorityQueue) {
        System.out.println("\nTask 12 - change priority queue to max priority queue");
        System.out.println("Original Priority Queue: "+ priorityQueue);
        PriorityQueue reversePQ = new PriorityQueue<>(Collections.reverseOrder());
        reversePQ.addAll(priorityQueue);
        System.out.println("Max Priority Queue: " + reversePQ);
    }
}

 /*   // Task 4 - Write a Java program to create a reverse order view of the elements contained in a given tree set.
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





    // Task 16 - Write a Java program to remove a given element from a tree set.
    void removeSpecifiedElement (TreeSet treeSet, Object element) {
        System.out.println("\nTask 16 - Remove specified element: ");
        System.out.println("Original: " + treeSet);
        System.out.println("Element removed? : " + treeSet.remove(element));
        System.out.println("Result: "+ treeSet);
    } */
