package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

import static java.lang.Math.sqrt;

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
        return side1.add(side2).add(side3);
    }

    @Override
    public BigDecimal area() {
        MathContext mc = new MathContext(2);
        BigDecimal semiPerimeter =  perimeter().divide(BigDecimal.valueOf(2),mc);
        return (semiPerimeter
                .multiply(semiPerimeter.subtract(side1))
                .multiply(semiPerimeter.subtract(side2))
                .multiply(semiPerimeter.subtract(side3)))
                .sqrt(mc);
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