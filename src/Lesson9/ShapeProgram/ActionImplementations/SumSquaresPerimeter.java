package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Services.StoreShapeService;
import Lesson9.ShapeProgram.Services.SumPerimeterService;
import static Lesson9.ShapeProgram.Lists.listOfShapes;

import java.math.BigDecimal;

public class SumSquaresPerimeter implements ActionMenu {

    @Override
    public String getAction() {
        return "Sum perimeter of squares";
    }

    @Override
    public void executeAction() {
        SumPerimeterService sumPerimeterService = new SumPerimeterService();
        BigDecimal allPerimeters = sumPerimeterService.sumPerimeter(listOfShapes);
        System.out.println("Sum of all squares perimeter is: " + allPerimeters);
    }
}
