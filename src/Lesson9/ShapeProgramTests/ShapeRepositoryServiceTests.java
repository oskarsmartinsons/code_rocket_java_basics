package Lesson9.ShapeProgramTests;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.CircleType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.SquareType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.TriangleType;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.util.List;

public class ShapeRepositoryServiceTests {
    ValidationService validationService = new ValidationService();
    List<ShapeMenu> shapeMenu = List.of(
                    new SquareType(validationService),
                    new TriangleType(validationService),
                    new CircleType(validationService)
    );
    public ShapeRepository shapeRepository = new ShapeRepository();
    ShapeRepositoryService shapeRepositoryService = new ShapeRepositoryService(shapeMenu, shapeRepository);

    public void testStoreShapeInRepo(ShapeType type){
        shapeRepositoryService.storeShapeInRepo(type);


/*        double result = conversion.convert(new TemperatureRequest(tempInCelsius, 'C', 'F'));
        if (expectedResult==result) {
            System.out.println("C->F: for " + tempInCelsius + " C Return " + expectedResult + " F: PASSED");
        } else System.err.println("C->F: for " + tempInCelsius + " C Return " + expectedResult + " F: FAILED, " +
                "expected " + expectedResult + " but is " + result);*/
    }
}
