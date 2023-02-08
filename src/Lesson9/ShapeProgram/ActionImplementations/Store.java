package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Services.StoreShapeService;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.UserInput;

public class Store implements ActionMenu {
    private final StoreShapeService storeShapeService;

    public Store(StoreShapeService storeShapeService) {
        this.storeShapeService = storeShapeService;
    }

    @Override
    public String getAction() {
        return "Store shape";
    }

    @Override
    public void executeAction(ShapeType type) {
        storeShapeService.storeShape(type);
        System.out.println(type + " is saved!");
    }
}
