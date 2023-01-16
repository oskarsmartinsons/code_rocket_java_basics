package Lesson2.Task7;

import java.util.Scanner;

public class Average {
    private final double first;
    private final double second;
    private final double third;

    public Average(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public double getFirst() {return first;}
    public double getSecond() {return second;}
    public double getThird() {return third;}
    static void calculateAverage() {
        System.out.println("Calculate average of thee numbers:");
        Average average = new Average( input(), input(), input());
        double result = (average.getFirst() + average.getSecond()+ average.getThird())/3;
        System.out.println("Average of three numbers is:  " + result);
    }
    static double input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        return input.nextDouble();
    }
}
