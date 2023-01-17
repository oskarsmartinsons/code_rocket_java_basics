package Lesson2.Task6v1;

class AreaDemo {
    public static void main(String[] args) {
        // without parameters in constructor, get inputs and create object
        Area area = new Area();
        double dimensions[] = area.setDim();
        area.setLength(dimensions[0]);
        area.setBreadth(dimensions[1]);

        // calculate area
        double result = area.getArea(area.getLength(), area.getBreadth());
        // print result
        System.out.println("Area of rectangular: " + result);
    }
}