package Lesson2.Task6v1;

import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;
    public Area (double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public static double getArea(double length, double breadth) {
        return length*breadth;
    }
    public static double[] setDim( ) {
        // input length
        Scanner side1 = new Scanner(System.in);
        System.out.println("Enter rectangular length: ");
        double length = side1.nextDouble();
        // input breadth
        Scanner side2 = new Scanner(System.in);
        System.out.println("Enter rectangular breadth: ");
        double breadth = side2.nextDouble();
        // create array
        double array[] = {length, breadth};
        return array;
    }
}
