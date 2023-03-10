package Lesson9.ShapeProgram;
import Lesson9.ShapeProgram.ActionMenuImplementations.*;
import Lesson9.ShapeProgram.Services.*;
import Lesson9.ShapeProgram.Services.CalculationService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.CircleType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.SquareType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.TriangleType;
import java.util.List;

public class ListsOfMenus {
    List<ActionMenu> getActionMenu(
                                   ShapeRepositoryService shapeRepositoryService,
                                   CalculationService calculationService
                                   )
    {
        return List.of(
                new Store(shapeRepositoryService),
                new DisplayShapes(shapeRepositoryService),
                new SumPerimeter(shapeRepositoryService),
                new SumArea(shapeRepositoryService),
                new CalculatePerimeterForRepoShape(shapeRepositoryService),
                new CalculateAreaForRepoShape(shapeRepositoryService),
                new CalculatePerimeter(calculationService),
                new CalculateArea(calculationService),
                new Exit()
        );
    }

    List<ShapeMenu> getShapeMenu(ValidationService validationService){
        return List.of(
                new SquareType(validationService),
                new TriangleType(validationService),
                new CircleType(validationService)
        );
    }
}
