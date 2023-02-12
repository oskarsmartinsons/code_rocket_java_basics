package Lesson9.ShapeProgram.ActionMenuImplementations;
import Lesson9.ShapeProgram.Services.CalculationService;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.math.BigDecimal;

public class CalculatePerimeter implements ActionMenu {
    private final CalculationService calculationService;

    public CalculatePerimeter(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Override
    public String getAction() {
        return "Calculate Perimeter for New Shape";
    }
    @Override
    public void executeAction(ShapeType type) {
        BigDecimal perimeter = calculationService.calculatePerimeter(type);
        System.out.println("Perimeter of the " + type + " is: " + perimeter );
    }
}
