package Lesson2.Task19;

public class AlphabetDemo {
    public static void main(String[] args) {
        String myInput = UserInput.input();
        Alphabet alphabet = new Alphabet();
        alphabet.myString = myInput;
        alphabet.getOccurances();
    }
}
