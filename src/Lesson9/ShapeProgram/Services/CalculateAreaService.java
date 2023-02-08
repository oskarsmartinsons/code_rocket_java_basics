package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.math.BigDecimal;
import java.util.List;

public class CalculateAreaService {
    private final List<ShapeMenu> shapeMenu;
    public CalculateAreaService(List<ShapeMenu> shapeMenu) {
        this.shapeMenu = shapeMenu;
    }
    public BigDecimal calculateArea(ShapeType type) {
        BigDecimal area= new BigDecimal("0.00");
        for (ShapeMenu s: shapeMenu) {
            if(s.getType().equals(type)){
                area =  s.getShape().area();
            }
        }
        return area;
    }
}
