package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Shapes.ShapeType;

public class Store implements ActionMenu {
    private final ShapeRepositoryService shapeRepositoryService;
    public Store(ShapeRepositoryService shapeRepositoryService) {
        this.shapeRepositoryService = shapeRepositoryService;
    }
    @Override
    public String getAction() {
        return "Store shape in REPO";
    }
    @Override
    public void executeAction(ShapeType type) {
        shapeRepositoryService.storeShapeInRepo(type);
        System.out.println(type + " is saved in REPO!");

    }
}
