package Lesson2.Task4;

class TriangleDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        double perimeter=triangle.calculatePerimeter();
        double area = triangle.calculateArea();
        //print out
        System.out.println("Perimeter of triangle is: " + perimeter);
        System.out.println("Area of triangle is: " + area);
    }
}