package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

public class TriangleType implements  ShapeMenu{
    private final ValidationService validationService;

    public TriangleType(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.TRIANGLE;
    }

    @Override
    public Integer getShapeId() {
        UserInput userInput = new UserInput(validationService);
        return userInput.inputId();
    }

    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput(validationService);
        return userInput.inputTriangle();
    }
}
