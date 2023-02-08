package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.DisplayShapeService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

public class DisplayShapes implements ActionMenu {
    private final DisplayShapeService displayShapeService;
    public DisplayShapes(DisplayShapeService displayShapeService) {
        this.displayShapeService = displayShapeService;
    }
    @Override
    public String getAction() {
        return "Display all stored shapes of this type";
    }
    @Override
    public void executeAction(ShapeType type) {
        System.out.println("All stored " + type + "s:");
        displayShapeService.displayShapes(type);
    }
}
