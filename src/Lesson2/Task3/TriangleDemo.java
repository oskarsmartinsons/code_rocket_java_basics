package Lesson2.Task3;

class TriangleDemo {
    public static void main(String[] args) {
        // create triangle and set sides
        Triangle triangle = new Triangle();
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        // call calculation methods
        double perimeter = triangle.calculatePerimeter();
        double area = triangle.calculateArea();
        //print out
        System.out.println("Perimeter of triangle is: " + perimeter);
        System.out.println("Area of triangle is: " + area);
    }
}