package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.util.List;

public class DisplayShapeService {
    private final List<Shape> list;
    public DisplayShapeService(List<Shape> list) {
        this.list = list;
    }
    public void displayShapes(ShapeType type) {
        boolean isPresent = false;
        for (Shape s : list) {
            if (s.getType().equals(type)) {
                System.out.println(s);
                isPresent = true;
            }
        }
        if (!isPresent) {
            System.out.println("Empty storage");
        }
    }
}
