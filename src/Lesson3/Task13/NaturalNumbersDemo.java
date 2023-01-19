package Lesson3.Task13;

class NaturalNumbersDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        NaturalNumbers naturalNumbers = new NaturalNumbers(userInput.inputNumber());
        naturalNumbers.displayCubeValues();
    }
}
