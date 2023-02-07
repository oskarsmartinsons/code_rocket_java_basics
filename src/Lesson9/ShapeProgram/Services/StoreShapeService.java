package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;

import java.util.ArrayList;

import static Lesson9.ShapeProgram.Lists.listOfShapes;

public class StoreShapeService {
    public void storeShape (Shape shape) {
        listOfShapes.add(shape);
    }
}
