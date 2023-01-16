package Lesson2.Task3;

import static java.lang.Math.sqrt;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // create Triangle method
    static Triangle createTriangle (double sideA, double sideB, double sideC){
        Triangle myTriangle = new Triangle();
        myTriangle.setSide1(sideA);
        myTriangle.setSide2(sideB);
        myTriangle.setSide3(sideC);
        return myTriangle;
    }

    // calculate perimeter
    static double calculatePerimeter (Triangle triangle) {
        return triangle.getSide1()+triangle.getSide2()+triangle.getSide3();
    }
    // calculate area
    static double calculateArea (Triangle triangle) {
        double semiPerimeter =  calculatePerimeter(triangle)/2;
        return sqrt(semiPerimeter*
                (semiPerimeter- triangle.getSide1())*
                (semiPerimeter- triangle.getSide2())*
                (semiPerimeter-triangle.getSide3()));
    }
}