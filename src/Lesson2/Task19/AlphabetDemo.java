package Lesson2.Task19;

import java.util.HashMap;

public class AlphabetDemo {
    public static void main(String[] args) {
        String myInput = UserInput.input();
        Alphabet alphabet = new Alphabet(myInput);
        // get frequency
        HashMap<Character,Integer> freq = alphabet.getOccurrences();
        // sort
        HashMap<Character,Integer> sorted = alphabet.sortMyMap(freq);
        // print sorted
        System.out.println("---- Sorted ----");
        alphabet.printHaspMap(sorted);

        System.out.println("---- Sorted (printed with Lambda)---");
        alphabet.printWithLambda(sorted);
    }
}
