package Lesson2.Task6v2;

import java.util.Scanner;

public class AreaOther {
    private final double length;
    private final double breadth;
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public AreaOther(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public static double returnArea(AreaOther area) {
        return area.getLength() * area.getBreadth();
    }
    public static double input() {
        Scanner inputDimension = new Scanner(System.in);
        System.out.println("Enter rectangular dimension: ");
        return inputDimension.nextDouble();
    }
}
