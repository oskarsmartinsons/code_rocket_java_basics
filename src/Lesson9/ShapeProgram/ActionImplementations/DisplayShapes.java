package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Services.DisplayShapeService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import static Lesson9.ShapeProgram.Lists.listOfShapes;

public class DisplayShapes implements ActionMenu {
    private final DisplayShapeService displayShapeService;
    public DisplayShapes(DisplayShapeService displayShapeService) {
        this.displayShapeService = displayShapeService;
    }
    @Override
    public String getAction() {
        return "Display all shapes";
    }

    @Override
    public void executeAction(ShapeType type) {
        System.out.println("All stored shapes:");
        displayShapeService.displayShapes(type);
    }
}
