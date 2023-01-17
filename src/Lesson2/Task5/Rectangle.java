package Lesson2.Task5;

class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle (double sideA, double sideB) {
        this.length=sideA;
        this.breadth=sideB;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }

    // calculate area
    double calculateArea() {
        return length*breadth;
    }
}