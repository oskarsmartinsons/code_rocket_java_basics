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
        shapeRepositoryTests.testFindShapesById();
        shapeRepositoryTests.testFindShapesByType(ShapeType.CIRCLE);
    }
}
