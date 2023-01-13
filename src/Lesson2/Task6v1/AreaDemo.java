package Lesson2.Task6v1;
public class AreaDemo {
    public static void main(String[] args) {
        // without parameters in constructor
        double dimensions[] = Area.setDim();
        Area area = new Area();
        area.setLength(dimensions[0]);
        area.setBreadth(dimensions[1]);
        System.out.println("Area of rectangular: " + Area.getArea(area.getLength(), area.getBreadth()));
    }
}
