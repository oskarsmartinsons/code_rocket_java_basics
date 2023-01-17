package Lesson2.Task5;

class RectangleDemo {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(4,5);
        Rectangle secondRectangle = new Rectangle(5,8);
        double areaFirst = firstRectangle.calculateArea();
        double areaSecond = secondRectangle.calculateArea();

        System.out.println("Area of the first rectangular: " + areaFirst);
        System.out.println("Area of the second rectangular: " + areaSecond);
    }
}