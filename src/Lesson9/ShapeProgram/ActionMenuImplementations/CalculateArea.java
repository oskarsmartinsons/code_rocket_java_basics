package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.CalculateAreaService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class CalculateArea implements ActionMenu{
    private final CalculateAreaService calculateAreaService;

    public CalculateArea(CalculateAreaService calculateAreaService) {
        this.calculateAreaService = calculateAreaService;
    }

    @Override
    public String getAction() {
        return "Calculate Area";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal area = new BigDecimal("0.00");
        area = calculateAreaService.calculateArea(type);
        System.out.println("Area of " + type + " is: " + area);
    }
}
