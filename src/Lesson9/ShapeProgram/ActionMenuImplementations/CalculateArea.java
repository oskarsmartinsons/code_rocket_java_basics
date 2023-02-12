package Lesson9.ShapeProgram.ActionMenuImplementations;

//import Lesson9.ShapeProgram.Services.CalculateAreaService;
import Lesson9.ShapeProgram.Services.CalculationService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class CalculateArea implements ActionMenu{
    private final CalculationService calculationService;

    public CalculateArea(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Override
    public String getAction() {
        return "Calculate Area for New Shape";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal area = calculationService.calculateArea(type);
        System.out.println("Area of the " + type + " is: " + area);
    }
}
