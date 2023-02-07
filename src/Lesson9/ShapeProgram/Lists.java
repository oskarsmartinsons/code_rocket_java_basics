package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.*;
import Lesson9.ShapeProgram.Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static ArrayList<Shape> listOfShapes = new ArrayList<>();
    List<ActionMenu> getActions () {
        return List.of(
                new Exit(),
                new StoreSquare(),
                new SumSquaresPerimeter(),
                new SumSquaresArea(),
                new DisplayShapes()
        );
    }
}
