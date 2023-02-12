package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Exceptions.UserInputException;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ValidationService {

    // validation logic for menus
    public void isInputInMenuRange(Integer input, List optionList) {
        if (input<0 || input >= optionList.size()) {
            throw new ArrayIndexOutOfBoundsException("You provided number which is not in the menu!");
        }
    }

    // validation logic for shape parameters
    public void isInputPositiveBigDecimal(BigDecimal input) {
        if (input.compareTo(BigDecimal.ZERO) <= 0) {
            throw new UserInputException("Number must be larger than zero");
        }
    }
}
