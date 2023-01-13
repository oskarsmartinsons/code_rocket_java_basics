package Lesson2.Task7;

public class AverageDemo {
    public static void main(String[] args) {
        //get inputs
        double first = 2;
        double second = 3;
        double third = 4;
        // pass parameters to constructor
        Average average = new Average(first,second,third);
        // call method to calculate and print out
        average.calculateAverage(average);
    }
}
