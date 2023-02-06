package Lesson9.ShapeProgram;

import java.util.List;

public interface ShapeMenu {
    public static List<Shape> storedShapes = null;
    void store(Shape shape);

    boolean filterShape(String figure);
}
