package Lesson2.Task4;

public class TriangleConstructorDemo {
    public static void main(String[] args) {
        // create triangle
        TriangleConstructor myTriangle = new TriangleConstructor (3,4,5);

        // calculations
        double perimeter = TriangleConstructor.calculatePerimeter(myTriangle);
        double area = TriangleConstructor.calculateArea(myTriangle);

        //print out
        System.out.println("Perimeter of triangle is: " + perimeter);
        System.out.println("Area of triangle is: " + area);


    }
}
