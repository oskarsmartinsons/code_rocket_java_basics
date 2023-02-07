package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Services.DisplayShapeService;
import static Lesson9.ShapeProgram.Lists.listOfShapes;


public class DisplayShapes implements ActionMenu {
    @Override
    public String getAction() {
        return "Display all shapes";
    }

    @Override
    public void executeAction() {
        System.out.println("All stored shapes:");
        DisplayShapeService displayShapeService = new DisplayShapeService();
        displayShapeService.displayShapes(listOfShapes);
    }
}
