package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.ActionMenu;
import Lesson9.ShapeProgram.Services.DisplayShapeService;
import Lesson9.ShapeProgram.Services.SumAreaService;
import Lesson9.ShapeProgram.Services.SumPerimeterService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import static Lesson9.ShapeProgram.Lists.listOfShapes;


import java.util.List;

public class ShapeProgramDemo {
    public static void main(String[] args) {
        Lists allLists = new Lists();

        List<ShapeMenu> shapeMenu = allLists.getShapes();

        DisplayShapeService displayShapeService = new DisplayShapeService(listOfShapes);
        SumAreaService sumAreaService = new SumAreaService(listOfShapes);
        SumPerimeterService sumPerimeterService = new SumPerimeterService(listOfShapes);

        List<ActionMenu> actionMenu = allLists.getActions(
                displayShapeService,
                sumPerimeterService,
                sumAreaService
        );

        UserInput userInput = new UserInput();
        UserMenu userMenu = new UserMenu(userInput, actionMenu, shapeMenu);
        // start program
        userMenu.start();
    }
}
