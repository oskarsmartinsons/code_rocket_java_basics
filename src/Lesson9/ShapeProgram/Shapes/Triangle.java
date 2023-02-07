package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;

public class Triangle extends Shape{
    private final BigDecimal side1;
    private final BigDecimal side2;
    private final BigDecimal side3;

    public Triangle(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
     //   super(type);
        this.setType(ShapeType.TRIANGLE);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public BigDecimal perimeter() {
        return null;
    }

    @Override
    public BigDecimal area() {
        return null;
    }
}
