package Lesson2.Task5;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(4,5);
        Rectangle secondRectangle = new Rectangle(5,8);
        double areaFirst = Rectangle.calculateArea(firstRectangle);
        double areaSecond = Rectangle.calculateArea(secondRectangle);

        System.out.println("Area of the first rectangular: " + areaFirst);
        System.out.println("Area of the second rectangular: " + areaSecond);
    }
}
