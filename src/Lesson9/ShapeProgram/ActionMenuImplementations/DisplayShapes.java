package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.util.ArrayList;

public class DisplayShapes implements ActionMenu {
    private final ShapeRepositoryService shapeRepositoryService;
    public DisplayShapes(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }
    @Override
    public String getAction() {
        return "Display all stored shapes of this type";
    }
    @Override
    public void executeAction(ShapeType type) {
        System.out.println("All stored " + type + "s in REPO:");
        ArrayList<Shape> shapesOfOneType = shapeRepositoryService.retrieveByTypeFromRepo(type);
        shapeRepositoryService.printShapeList(shapesOfOneType);
    }
}
