package Lesson9.ShapeProgram.Validations;

public class ShapeNotFoundException extends RuntimeException {
    public ShapeNotFoundException(String message) {
        super(message);
    }
}
