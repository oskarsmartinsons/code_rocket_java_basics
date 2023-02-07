package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(side1, triangle.side1) && Objects.equals(side2, triangle.side2) && Objects.equals(side3, triangle.side3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
