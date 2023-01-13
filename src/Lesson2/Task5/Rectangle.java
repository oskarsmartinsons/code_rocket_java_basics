package Lesson2.Task5;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle (double sideA, double sideB) {
        this.length =sideA;
        this.breadth =sideB;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }

    // calculate area
    static double calculateArea(Rectangle rectangle) {
        return rectangle.getLength()*rectangle.getBreadth();
    }
}
