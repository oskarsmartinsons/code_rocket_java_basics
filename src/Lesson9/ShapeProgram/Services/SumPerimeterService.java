package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SumPerimeterService {
    private final ArrayList<Shape> shapeList;
    public SumPerimeterService(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }
    public BigDecimal sumPerimeter(ShapeType type) {
        BigDecimal allPerimeters = new BigDecimal("0.00");
        for (Shape s:shapeList) {
            if (s.getType().equals(type)){
                allPerimeters = allPerimeters.add(s.perimeter());
            }
        }
        return allPerimeters;
    }
}
