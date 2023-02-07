package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

import java.util.ArrayList;

import static Lesson9.ShapeProgram.Lists.listOfShapes;

public class StoreShapeService {
    public void storeShape (ShapeType type) {
        UserInput userInput = new UserInput();
        switch (type){
            case SQUARE -> listOfShapes.add(userInput.inputSquare());
            case TRIANGLE -> listOfShapes.add(userInput.inputTriangle());
            case CIRCLE -> listOfShapes.add(userInput.inputCircle());
        }
    }
}
