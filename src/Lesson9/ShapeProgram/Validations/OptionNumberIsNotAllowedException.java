package Lesson9.ShapeProgram.Validations;

public class OptionNumberIsNotAllowedException extends RuntimeException {
    public OptionNumberIsNotAllowedException(String message) {
        super(message);
    }
}
