package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

public class TriangleType implements  ShapeMenu{
    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput();
        return userInput.inputTriangle();
    }
}
