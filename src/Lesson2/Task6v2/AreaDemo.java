package Lesson2.Task6v2;

class AreaDemo {
    public static void main(String[] args) {
        // get inputs
        double length = UserInput.input();
        double breadth = UserInput.input();
        // create object Area and pass parameters
        Area area = new Area(length, breadth);
        // calculation
        double result = area.returnArea();
        // print out
        System.out.println("Area of rectangular is: " + result);
    }
}