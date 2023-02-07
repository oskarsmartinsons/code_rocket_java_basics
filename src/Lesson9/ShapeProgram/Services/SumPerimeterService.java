package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SumPerimeterService {
    public BigDecimal sumPerimeter(ArrayList<Shape> shapeList) {
        BigDecimal allPerimeters = new BigDecimal("0.00");
        for (Shape s:shapeList) {
            if (s.getType().equals(ShapeType.SQUARE)){
                allPerimeters = allPerimeters.add(s.perimeter());
            }
        }
        return allPerimeters;
    }
}
