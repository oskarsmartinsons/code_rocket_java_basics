package Lesson3.Task30_31;

class IntegerCheckerDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int[] numbers = userInput.inputInteger();
        IntegerChecker integerChecker = new IntegerChecker(numbers[0],numbers[1],numbers[2]);
        integerChecker.checkDifference(); // Task 30
        integerChecker.checkOrder();      // Task 31
    }
}