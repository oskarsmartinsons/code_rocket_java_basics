package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class SumArea implements ActionMenu{
    private final ShapeRepositoryService shapeRepositoryService;

    public SumArea(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }
    @Override
    public String getAction() {
        return "Sum areas of shapes in REPO";
    }
    @Override
    public void executeAction(ShapeType type) {
        BigDecimal allArea = shapeRepositoryService.sumShapeAreaByType(type);
        System.out.println("Sum of all " + type + " areas in REPO is: " + allArea);
    }
}
