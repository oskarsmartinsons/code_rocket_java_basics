package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class CalculateAreaForRepoShape implements ActionMenu{
    private ShapeRepositoryService shapeRepositoryService;

    public CalculateAreaForRepoShape(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }

    @Override
    public String getAction() {
        return "Calculate Area for Shape from REPO";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal area = shapeRepositoryService.calculateAreaForShapeId(type);
        System.out.println("Area of the " + type + " with Id"  + " is: " + area );

    }
}
