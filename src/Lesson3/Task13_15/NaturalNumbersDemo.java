package Lesson3.Task13_15;

class NaturalNumbersDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        NaturalNumbers naturalNumbers = new NaturalNumbers(userInput.inputNumber());
        naturalNumbers.displayCubeValues();
        naturalNumbers.displayMultiplicaitonTable();
        naturalNumbers.displayOddNumbers();
    }
}
