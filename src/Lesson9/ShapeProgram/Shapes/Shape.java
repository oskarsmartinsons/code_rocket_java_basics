package Lesson9.ShapeProgram.Shapes;

import java.math.BigDecimal;

public abstract class Shape {
    private Integer id;
    private ShapeType type;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ShapeType getType() {
        return type;
    }
    public void setType(ShapeType type) {
        this.type = type;
    }

    public abstract BigDecimal perimeter();
    public abstract BigDecimal area();
}
