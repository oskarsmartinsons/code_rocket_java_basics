package Lesson6.PriorityQueue;

import java.util.PriorityQueue;
import java.util.TreeSet;

class PriorityQueueDemo {
    public static void main(String[] args) {
        // creating main PriorityQueue Chars
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>();
        priorityQueue.add('T');
        priorityQueue.add('B');
        priorityQueue.add('C');

        // creating another priority queue of Chars
        PriorityQueue<Character> priorityQueueOther = new PriorityQueue<>();
        priorityQueueOther.add('D');
        priorityQueueOther.add('A');

        // creating integer priority queue of Integers
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(7);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(3);

        // creating string priority queue
        PriorityQueue<String> priorityQueueString = new PriorityQueue<>();
        priorityQueueString.add("Red");
        priorityQueueString.add("Blue");
        priorityQueueString.add("Green");

        PriorityQueueFunctions priorityQueueFunctions = new PriorityQueueFunctions();

        // Task 1 - Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue
        priorityQueueFunctions.createAndPrintOutPriorityQueue();

        // Task 2 - Write a Java program to iterate through all elements in a priority queue.
        priorityQueueFunctions.iterateThroughPriorityQueue(priorityQueue);

        // Task 3 - Write a Java program to add all the elements of a priority queue to another priority queue
        priorityQueueFunctions.addElements(priorityQueue, priorityQueueOther);

        // Task 4 - insert given element into priority queue
        priorityQueueFunctions.insertElement(priorityQueue, 'R');

        // Task 5 - Write a Java program to remove all elements from a priority queue.
        priorityQueueFunctions.removeAllElements(priorityQueueString);

        // Task 6 -Write a Java program to get the number of elements in a priority queue.
        priorityQueueFunctions.getSizeofPriorityQueue(priorityQueue);

        // Task 7 - Write a Java program to compare two priority queues.
        priorityQueueFunctions.comparePriorityQueueElements(priorityQueue,priorityQueueOther);

        // Task 8 - Write a Java program to retrieve first elements
        priorityQueueFunctions.retrieveFirstElement(priorityQueue);

        // Task 9 - Write a Java program to retrieve and remove the first element
        priorityQueueFunctions.retrieveAndRemoveFirstElement(priorityQueue);

        // Task 10 - Write a Java program to convert a priority queue to an array.
        priorityQueueFunctions.convertPrimaryQueueToArray(priorityQueue);

        // Task 11 - Write a Java program to convert a Priority Queue elements to a string representation
        priorityQueueFunctions.convertPriorityQueueToString(priorityQueue);

        // Task 12 - Write a Java program to change priorityQueue to maximum priority queue.
        priorityQueueFunctions.changePriorityToMaxPriorityQueue(integerPriorityQueue);
    }
}
