package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape {
    BigDecimal side;

    public Square(BigDecimal side) {
        this.setId(0);
        this.setType(ShapeType.SQUARE);
        this.side = side;
        }
    public BigDecimal getSide() {
        return side;
    }

    @Override
    public BigDecimal perimeter() {
        return side.multiply(BigDecimal.valueOf(4));
    }
    @Override
    public BigDecimal area() {
        return side.multiply(side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(side, square.side);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Id:" + getId()+
                ", side=" + side +
                '}';
    }
}
