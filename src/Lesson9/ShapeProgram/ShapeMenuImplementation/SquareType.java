package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

import java.math.BigDecimal;

public class SquareType implements ShapeMenu{
    private ValidationService validationService;

    public SquareType(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.SQUARE;
    }

    @Override
    public Integer getShapeId() {
        UserInput userInput = new UserInput(validationService);
        return userInput.inputId();
    }

    @Override
    public Shape getShape() {
        UserInput userInput = new UserInput(validationService);
        return userInput.inputSquare();
    }
}
