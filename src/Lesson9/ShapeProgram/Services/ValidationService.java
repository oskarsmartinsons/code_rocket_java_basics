package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.ActionMenuImplementations.ActionMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.UserInput;
import Lesson9.ShapeProgram.Validations.UserInputException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ValidationService {

    public void isInputInMenuRange(Integer input, List optionList) {
        if (input<0 || input >= optionList.size()) {
            throw new ArrayIndexOutOfBoundsException("You provided number which is not in the menu!");
        }
    }


    public void isInputPositiveBigDecimal(BigDecimal input) {
        if (input.compareTo(BigDecimal.ZERO) <= -1) {
            throw new UserInputException("Length must be positive");
        }
    }

    public BigDecimal inputValidBigDecimal() {
        BigDecimal parameter = new BigDecimal("0.00");
        try {
            Scanner inputAction = new Scanner(System.in);
            parameter = inputAction.nextBigDecimal();
            isInputPositiveBigDecimal(parameter);
        } catch (InputMismatchException inputMismatchException) {
            throw new InputMismatchException("Please enter digit");
        }
        return parameter;
    }

}
