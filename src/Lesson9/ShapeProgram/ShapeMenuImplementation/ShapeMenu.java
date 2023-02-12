package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

public interface ShapeMenu {
    ShapeType getShapeType();
    Integer getShapeId();
    Shape getShape();
}
