package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.util.List;

public class DisplayShapeService {
    private List<Shape> list;

    public DisplayShapeService(List<Shape> list) {
        this.list = list;
    }

    public void displayShapes(ShapeType type) {
        for (Shape s : list) {
            if (s.getType().equals(type)) System.out.println(s);
        }
    }
}
