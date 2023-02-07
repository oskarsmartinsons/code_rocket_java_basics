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
        return "Sum perimeters of shape";
    }

    @Override
    public void executeAction(ShapeType type) {
 /*     UserInput userInput = new UserInput();
        ShapeType type = userInput.inputType();
        UserMenu userMenu = new UserMenu( );*/

     //   ShapeType type = ShapeType.SQUARE;
     //   SumPerimeterService sumPerimeterService = new SumPerimeterService();
        BigDecimal allPerimeters = sumPerimeterService.sumPerimeter(type);
        System.out.println("Sum of all " + type + " perimeters is: " + allPerimeters);

    }
}
