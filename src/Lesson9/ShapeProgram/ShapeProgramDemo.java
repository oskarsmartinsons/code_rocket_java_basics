package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionMenuImplementations.ActionMenu;
import Lesson9.ShapeProgram.Services.*;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import static Lesson9.ShapeProgram.Lists.storedShapes;


import java.util.List;

public class ShapeProgramDemo {
    public static void main(String[] args) {
        Lists allLists = new Lists();
        List<ShapeMenu> shapeMenu = allLists.getShapeMenu();

        DisplayShapeService displayShapeService = new DisplayShapeService(storedShapes);
        StoreShapeService storeShapeService = new StoreShapeService();
        SumAreaService sumAreaService = new SumAreaService(storedShapes);
        SumPerimeterService sumPerimeterService = new SumPerimeterService(storedShapes);
        CalculatePerimeterService calculatePerimeterService = new CalculatePerimeterService(shapeMenu);
        CalculateAreaService calculateAreaService = new CalculateAreaService(shapeMenu);

        List<ActionMenu> actionMenu = allLists.getActionMenu(
                displayShapeService,
                storeShapeService,
                sumPerimeterService,
                sumAreaService,
                calculatePerimeterService,
                calculateAreaService
        );

        UserInput userInput = new UserInput();
        UserMenu userMenu = new UserMenu(userInput, actionMenu, shapeMenu);
        // start program
        userMenu.start();
    }
}
