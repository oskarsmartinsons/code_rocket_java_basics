package Lesson9.ShapeProgram.Services;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.math.BigDecimal;
import java.util.List;

public class CalculationService {
    private final List<ShapeMenu> shapeMenu;
    public CalculationService(List<ShapeMenu> shapeMenu) {
        this.shapeMenu = shapeMenu;
    }

    public BigDecimal calculatePerimeter(ShapeType type){
        BigDecimal perimeter= new BigDecimal("0.00");
        for (ShapeMenu s: shapeMenu) {
            if(s.getType().equals(type)){
               perimeter =  s.getShape().perimeter();
            }
        }
        return perimeter;
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
