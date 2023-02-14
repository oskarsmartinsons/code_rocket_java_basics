package Lesson9.ShapeProgramTests;

import Lesson9.ShapeProgram.Shapes.Circle;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.math.BigDecimal;

public class ShapeProgramTestsDemo {
    public static void main(String[] args) {

        // shape repository tests
        ShapeRepositoryTests shapeRepositoryTests = new ShapeRepositoryTests();
        shapeRepositoryTests.testSaveShape(new Circle(BigDecimal.valueOf(3)));
        shapeRepositoryTests.testIdIncrementationAfterSave();
        shapeRepositoryTests.testFindShapesById(0);
        shapeRepositoryTests.testFindShapesByType(ShapeType.CIRCLE);

        // shape repository tests
        ShapeRepositoryServiceTests shapeRepositoryServiceTests = new ShapeRepositoryServiceTests();
        shapeRepositoryServiceTests.testStoreShapeInRepo(ShapeType.SQUARE);
        shapeRepositoryServiceTests.testRetrieveShapesByTypeFromRepo(ShapeType.CIRCLE);
        shapeRepositoryServiceTests.testSumShapePerimeterByType(ShapeType.SQUARE);
        shapeRepositoryServiceTests.testSumShapePerimeterByType(ShapeType.CIRCLE);
        shapeRepositoryServiceTests.testSumShapePerimeterByType(ShapeType.TRIANGLE);
        shapeRepositoryServiceTests.testSumShapeAreaByType(ShapeType.SQUARE);
        shapeRepositoryServiceTests.testSumShapeAreaByType(ShapeType.CIRCLE);
        shapeRepositoryServiceTests.testSumShapeAreaByType(ShapeType.TRIANGLE);
    }
}
