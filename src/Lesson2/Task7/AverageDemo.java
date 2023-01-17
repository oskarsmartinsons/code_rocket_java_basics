package Lesson2.Task7;

public class AverageDemo {
    public static void main(String[] args) {
        // get inputs
        double first = UserInput.input();
        double second = UserInput.input();
        double third = UserInput.input();
        // create object and pass parameters
        Average average = new Average(first,second,third);
        // calculate
        average.calculateAverage();
    }
}