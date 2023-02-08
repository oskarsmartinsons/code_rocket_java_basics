package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;
import java.math.BigDecimal;
import java.util.List;

import static Lesson9.ShapeProgram.Shapes.ShapeType.*;

public class CalculatePerimeterService {
    private final List<ShapeMenu> shapeMenu;

    public CalculatePerimeterService(List<ShapeMenu> shapeMenu) {
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
}
