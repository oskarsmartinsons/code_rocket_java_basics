package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

public class CircleType implements ShapeMenu {
    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }
    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput();
        return userInput.inputCircle();
    }
}
