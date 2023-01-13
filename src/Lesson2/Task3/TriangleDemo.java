package Lesson2.Task3;

public class TriangleDemo {
    public static void main(String[] args) {
        //create triangle
        Triangle myTriangle=Triangle.createTriangle(3,4,5);
        //perform calculations
        double perimeter = Triangle.calculatePerimeter(myTriangle);
        double area = Triangle.calculateArea(myTriangle);
        //print out
        System.out.println("Perimeter of triangle is: " + perimeter);
        System.out.println("Area of triangle is: " + area);
    }
}

