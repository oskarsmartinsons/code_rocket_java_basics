package Lesson9.ShapeProgram.ActionImplementations;

import static Lesson9.ShapeProgram.Lists.listOfShapes;
import Lesson9.ShapeProgram.Services.SumAreaService;

import java.math.BigDecimal;

public class SumSquaresArea implements ActionMenu{

    @Override
    public String getAction() {
        return "Sum area of squares";
    }

    @Override
    public void executeAction() {
        SumAreaService sumAreaService = new SumAreaService();
        BigDecimal allAreas = sumAreaService.sumArea(listOfShapes);
        System.out.println("Sum of all squares areas is :" + allAreas);
    }
}
