package Lesson9.ShapeProgram.Services;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SumAreaService {
    private final List<Shape> list;
    public SumAreaService(List<Shape> list) {
        this.list = list;
    }
    public BigDecimal sumArea(ShapeType type) {
        BigDecimal allAreas = new BigDecimal("0.00");
        for (Shape s:list) {
            if (s.getType().equals(type)){
                allAreas = allAreas.add(s.area());
            }
        }
        return allAreas;
    }
}
