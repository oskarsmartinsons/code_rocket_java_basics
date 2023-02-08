package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Services.SumAreaService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class SumArea implements ActionMenu{
    private final SumAreaService sumAreaService;

    public SumArea(SumAreaService sumAreaService) {
        this.sumAreaService = sumAreaService;
    }

    @Override
    public String getAction() {
        return "Sum areas of stored shape";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal allAreas = sumAreaService.sumArea(type);
        System.out.println("Sum of all " + type + " areas is: " + allAreas);
    }
}
