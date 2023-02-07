package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SumAreaService {
    public BigDecimal sumArea(ArrayList<Shape> shapeList) {
        BigDecimal allAreas = new BigDecimal("0.00");
        for (Shape s:shapeList) {
            if (s.getType().equals(ShapeType.SQUARE)){
                allAreas = allAreas.add(s.area());
            }
        }
        return allAreas;
    }
}
