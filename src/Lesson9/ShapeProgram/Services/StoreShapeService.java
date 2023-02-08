package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;
import static Lesson9.ShapeProgram.Lists.storedShapes;

public class StoreShapeService {
    public void storeShape (ShapeType type) {
        UserInput userInput = new UserInput();
        switch (type){
            case SQUARE -> storedShapes.add(userInput.inputSquare());
            case TRIANGLE -> storedShapes.add(userInput.inputTriangle());
            case CIRCLE -> storedShapes.add(userInput.inputCircle());
        }
    }
}
