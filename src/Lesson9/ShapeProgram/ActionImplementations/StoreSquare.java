package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Services.StoreShapeService;
import Lesson9.ShapeProgram.UserInput;

public class StoreSquare implements ActionMenu {
    @Override
    public String getAction() {
        return "Store square";
    }

    @Override
    public void executeAction() {
        System.out.println("Store shape is running (choose shape):");
        UserInput userInput = new UserInput();
        Shape square = userInput.inputSquare();
        StoreShapeService storeShapeService = new StoreShapeService();
        storeShapeService.storeShape(square);
        // display new menu
        System.out.println("Square is saved!");
    }
}
