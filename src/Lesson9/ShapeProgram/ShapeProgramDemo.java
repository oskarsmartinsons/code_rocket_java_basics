package Lesson9.ShapeProgram;
import Lesson9.ShapeProgram.ActionMenuImplementations.ActionMenu;
import Lesson9.ShapeProgram.Services.*;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import java.util.List;

public class ShapeProgramDemo {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();

        ListsOfMenus allMenus = new ListsOfMenus();
        List<ShapeMenu> shapeMenu = allMenus.getShapeMenu(validationService);

        ShapeRepository shapeRepository = new ShapeRepository();

        ShapeRepositoryService shapeRepositoryService = new ShapeRepositoryService(shapeMenu, shapeRepository);
        CalculationService calculationService = new CalculationService(shapeMenu);

        List<ActionMenu> actionMenu = allMenus.getActionMenu(shapeRepositoryService, calculationService);

        UserInput userInput = new UserInput(validationService);

        UserMenu userMenu = new UserMenu(userInput, actionMenu, shapeMenu);
        // start program
        userMenu.start();
    }
}
