package Lesson2.Task27_28;

import java.util.List;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // get numbers and put in list
        List<Double> numbers = calculator.enterNumbers();
        // get min number
        double minNumber = calculator.returnMin(numbers);
        // get average
        double average = calculator.returnAvg(numbers);
        // print out
        System.out.println("The smallest value is " + minNumber);
        System.out.println("The average value is " + average);
    }
}