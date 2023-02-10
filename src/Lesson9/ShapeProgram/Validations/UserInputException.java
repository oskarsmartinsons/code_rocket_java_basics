package Lesson9.ShapeProgram.Validations;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class UserInputException extends RuntimeException{

    public UserInputException(String message) {
        super(message);
    }
}
