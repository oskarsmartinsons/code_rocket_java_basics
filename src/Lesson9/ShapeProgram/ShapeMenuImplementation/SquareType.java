package Lesson9.ShapeProgram.ShapeMenuImplementation;

import Lesson9.ShapeProgram.Shapes.ShapeType;

public class SquareType implements ShapeMenu{
    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }
}
