package Lesson2.Task38;

public class TriangleHelperDemo {
    public static void main(String[] args) {
        double [] sides = UserInput.inputSides();
        TriangleHelper triangleHelper = new TriangleHelper(sides[0],sides[1],sides[2]);
        double area = triangleHelper.calculateArea();
        System.out.println("The area of the triangle is: " + area);
    }
}
