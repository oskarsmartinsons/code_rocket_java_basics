package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

import java.math.BigDecimal;

public class SquareType implements ShapeMenu{
    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }

    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput();
        return userInput.inputSquare();
    }
}
