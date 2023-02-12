package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.Services.ValidationService;
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
        Integer inputNr = inputValidInteger();
        validationService.isInputInMenuRange(inputNr, optionList);
        return inputNr;
    }

    public Square inputSquare() {
        System.out.println("Input side of the SQUARE");
        // get valid input
        BigDecimal side = inputValidBigDecimal();
        validationService.isInputPositiveBigDecimal(side);
        return new Square(side);
    }

    public Triangle inputTriangle() {
        BigDecimal[] sides = new BigDecimal[3];
        for (int i = 0; i < 3; i++) {
            int s = i + 1;
            System.out.println("Input TRIANGLE side " + s);
            // get valid input
            sides[i] = inputValidBigDecimal();
            validationService.isInputPositiveBigDecimal(sides[i]);
        }
        return new Triangle(sides[0], sides[1], sides[2]);
    }

    public Circle inputCircle() {
        System.out.println("Input radius of the CIRCLE");
        // get valid input
        BigDecimal radius = inputValidBigDecimal();
        validationService.isInputPositiveBigDecimal(radius);
        return new Circle(radius);
    }

    public BigDecimal inputValidBigDecimal() {
        BigDecimal parameter;
        try {
            Scanner inputAction = new Scanner(System.in);
            parameter = inputAction.nextBigDecimal();
        } catch (InputMismatchException inputMismatchException) {
            throw new InputMismatchException("You entered not a number.");
        }
        return parameter;
    }

    public Integer inputValidInteger() {
        Integer parameter;
        try {
            Scanner inputAction = new Scanner(System.in);
            parameter = inputAction.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            throw new InputMismatchException("You entered not an integer number.");
        }
        return parameter;
    }
}
