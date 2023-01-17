package Lesson2.Task4;
import static java.lang.Math.sqrt;
class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    // calculate perimeter
    double calculatePerimeter() {
        return side1+side2+side3;
    }

    // calculate area
    double calculateArea() {
        double semiPerimeter =  calculatePerimeter()/2;
        return sqrt(semiPerimeter*
                (semiPerimeter-side1)*
                (semiPerimeter-side2)*
                (semiPerimeter-side3));
    }
}