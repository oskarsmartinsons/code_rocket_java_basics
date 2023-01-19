package Lesson3.Task12;

class NaturalNumberCalculatorDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        NaturalNumberCalclulator calculator = new NaturalNumberCalclulator(userInput.inputNumber());
        int sum = calculator.sumNumbers();
        float avg =calculator.avg();
        System.out.println("Sum of 5 numbers is: " + sum);
        System.out.println("Average of 5 numbers is: " + avg);
    }
}
