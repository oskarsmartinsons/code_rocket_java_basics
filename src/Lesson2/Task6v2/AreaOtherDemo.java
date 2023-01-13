package Lesson2.Task6v2;
public class AreaOtherDemo {
    public static void main(String[] args) {
        // get inputs
        double length = AreaOther.input();
        double breadth = AreaOther.input();
        // create object Area and pass parameters
        AreaOther areaOther = new AreaOther(length,breadth);
        // calculation
        double area = AreaOther.returnArea(areaOther);
        // print out
        System.out.println("Area of rectangular is: " + area);
    }
}
