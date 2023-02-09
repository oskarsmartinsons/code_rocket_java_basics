package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class SumPerimeter implements ActionMenu {
    private final ShapeRepositoryService shapeRepositoryService;
    public SumPerimeter(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }
    @Override
    public String getAction() {
        return "Sum perimeters of shapes in REPO";
    }
    @Override
    public void executeAction(ShapeType type) {
        BigDecimal allPerimetersInRepo = shapeRepositoryService.sumShapePerimeterByType(type);
        System.out.println("Sum of all " + type + " perimeters in REPO is: " + allPerimetersInRepo);
    }
}
