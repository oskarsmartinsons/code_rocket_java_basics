package Lesson2.Task6;
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
    public static double returnArea(double length, double breadth) {
        return length*breadth;
    }
}
