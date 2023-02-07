package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;

public abstract class Shape {
    private ShapeType type;
/*    public Shape(ShapeType type) {
        this.type = type;
    }*/

    public ShapeType getType() {
        return type;
    }
    public void setType(ShapeType type) {
        this.type = type;
    }

    public abstract BigDecimal perimeter();
    public abstract BigDecimal area();

}
