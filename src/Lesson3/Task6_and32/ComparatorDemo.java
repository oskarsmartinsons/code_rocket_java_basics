package Lesson3.Task6_and32;

class ComparatorDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        float[] numbers = userInput.input();
        Comparator comparator = new Comparator();
        comparator.compareNumbers(numbers[0],numbers[1]);
    }
}
