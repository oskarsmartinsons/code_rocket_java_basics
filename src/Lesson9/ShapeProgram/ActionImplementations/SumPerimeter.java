package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Services.SumPerimeterService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class SumPerimeter implements ActionMenu {
    private final SumPerimeterService sumPerimeterService;

    public SumPerimeter(SumPerimeterService sumPerimeterService) {
        this.sumPerimeterService = sumPerimeterService;
    }

    @Override
    public String getAction() {
        return "Sum perimeters of stored shapes";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal allPerimeters = sumPerimeterService.sumPerimeter(type);
        System.out.println("Sum of all " + type + " perimeters is: " + allPerimeters);

    }
}
