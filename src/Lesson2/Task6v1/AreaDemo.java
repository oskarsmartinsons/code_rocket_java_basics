package Lesson2.Task6v1;
public class AreaDemo {
    public static void main(String[] args) {
        double dimensions[] = Area.setDim();
        Area  area = new Area( dimensions[0], dimensions[1]);
        System.out.println("Area of rectangular: " + Area.getArea(area.getLength(), area.getBreadth()));
    }
}
