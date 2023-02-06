package Lesson9.ShapeProgram;

public class TriangleOption implements ShapeMenu {

    @Override
    public void store(Shape shape) {
        storedShapes.add(shape);
    }

    @Override
    public boolean filterShape(String input) {
        return input.equals("triangle");
    }
}
