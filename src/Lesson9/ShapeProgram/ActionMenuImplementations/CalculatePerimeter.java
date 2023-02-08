package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.CalculatePerimeterService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class CalculatePerimeter implements ActionMenu {
    private final CalculatePerimeterService calculatePerimeterService;
    public CalculatePerimeter(CalculatePerimeterService calculatePerimeterService) {
        this.calculatePerimeterService = calculatePerimeterService;
    }
    @Override
    public String getAction() {
        return "Calculate Perimeter";
    }
    @Override
    public void executeAction(ShapeType type) {
        BigDecimal perimeter = calculatePerimeterService.calculatePerimeter(type);
        System.out.println("Perimeter of " + type + " is: " + perimeter );
    }
}
