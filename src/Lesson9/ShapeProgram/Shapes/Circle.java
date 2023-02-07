package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;

public class Circle extends Shape{
    private final BigDecimal PI = new BigDecimal("3.14");
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.setType(ShapeType.CIRCLE);
        this.radius = radius;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    @Override
    public BigDecimal perimeter() {
        return radius.multiply(PI).multiply(BigDecimal.valueOf(2));
    }

    @Override
    public BigDecimal area() {
        return radius.pow(2).multiply(PI);
    }
}
