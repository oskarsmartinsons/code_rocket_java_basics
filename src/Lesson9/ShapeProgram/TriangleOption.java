package Lesson9.ShapeProgram;

public class TriangleOption implements ShapeMenu {

    @Override
    public void store(Shape shape) {
        storedShapes.add(shape);
    }

    @Override
    public boolean filterShape(int input) {
        input= 1;
        if(input ==1) return true;
        return false;
    }
}
