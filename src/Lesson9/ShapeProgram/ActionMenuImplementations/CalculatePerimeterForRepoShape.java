package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

import java.math.BigDecimal;

public class CalculatePerimeterForRepoShape implements ActionMenu{
    private ShapeRepositoryService shapeRepositoryService;

    public CalculatePerimeterForRepoShape(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }

    @Override
    public String getAction() {
        return "Calculate Perimeter for Shape from REPO";
    }

    @Override
    public void executeAction(ShapeType type) {
        BigDecimal perimeter = shapeRepositoryService.calculatePerimeterForShapeId(type);
        System.out.println("Perimeter of the " + type + " with Id" + " is: " + perimeter );

    }
}
