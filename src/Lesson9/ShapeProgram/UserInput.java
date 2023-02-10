package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionMenuImplementations.ActionMenu;
import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.Shapes.Circle;
import Lesson9.ShapeProgram.Shapes.Square;
import Lesson9.ShapeProgram.Shapes.Triangle;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private final ValidationService validationService;

    public UserInput(ValidationService validationService) {
        this.validationService = validationService;
    }

    public Integer inputOptionNumber(List optionList) {
        // get valid input
        Integer inputNr = validationService.inputValidInteger();
        validationService.isInputInMenuRange(inputNr, optionList);
        return inputNr;
    }

    public Square inputSquare() {
        System.out.println("Input side of the SQUARE");
        // get valid input
        BigDecimal side = validationService.inputValidBigDecimal();
        return new Square(side);
    }

    public Triangle inputTriangle() {
        BigDecimal sides[] = new BigDecimal[3];
        for (int i = 0; i < 3; i++) {
            int s = i + 1;
            System.out.println("Input TRIANGLE side " + s);
            // get valid input
            sides[i] = validationService.inputValidBigDecimal();
        }
        return new Triangle(sides[0], sides[1], sides[2]);
    }

    public Circle inputCircle() {
        System.out.println("Input radius of the CIRCLE");
        // get valid input
        BigDecimal radius = validationService.inputValidBigDecimal();
        return new Circle(radius);
    }
}
