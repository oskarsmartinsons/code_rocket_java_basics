package Lesson9.ShapeProgram.Exceptions;

public class ShapeNotFoundException extends RuntimeException {
    public ShapeNotFoundException(String message) {
        super(message);
    }
}
