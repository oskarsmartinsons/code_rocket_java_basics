package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

public class TriangleType implements  ShapeMenu{
    private ValidationService validationService;

    public TriangleType(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput(validationService);
        return userInput.inputTriangle();
    }
}
