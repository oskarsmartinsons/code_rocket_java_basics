package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape{
    private final BigDecimal PI = new BigDecimal("3.14");
    private BigDecimal radius;
    public Circle(BigDecimal radius) {
        this.setId(0);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(PI, circle.PI) && Objects.equals(radius, circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PI, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Id:" + getId()+
                ", radius=" + radius +
                '}';
    }
}
