package Lesson9.ShapeProgramTests;

import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.*;

import java.math.BigDecimal;
import java.util.*;

public class ShapeRepositoryTests {
    ShapeRepository shapeRepository = new ShapeRepository();
    TreeMap<Integer, Shape> testRepo = new TreeMap<>();

    public void testSaveShape(Shape shape) {
        testRepo.putAll(shapeRepository.shapeRepo);
        Integer nextId;
        if(testRepo.isEmpty()) {
            nextId = 0;
        } else {
            nextId = testRepo.lastKey()+1;
        }

        HashMap<Integer,Shape> expectedResult = (HashMap<Integer, Shape>) shapeRepository.shapeRepo.clone();
        expectedResult.put(nextId, shape);

        HashMap<Integer,Shape> actualResult = shapeRepository.shapeRepo;
        shapeRepository.save(shape);

        if(expectedResult.equals(actualResult)) {
            System.out.println("Shape is Saved in REPO: PASSED (expected = " +expectedResult+ ", actual = " + actualResult);
        } else  {
            System.err.println("Shape is Saved in REPO: FAILED (expected = " +expectedResult+ ", actual = " + actualResult);
        }
    }

    public void testIdIncrementationAfterSave() {
        Shape firstShape = shapeRepository.save(new Circle(BigDecimal.valueOf(6)));
        Shape secondShape = shapeRepository.save(new Square(BigDecimal.valueOf(2)));
        int expectedIncrement = 1;
        int actualIncrement = secondShape.getId() - firstShape.getId();
        if(expectedIncrement == actualIncrement) {
            System.out.println("After Save Id is incremented by 1 : PASSED (expected = " + expectedIncrement + ", actual = " + actualIncrement + ")");
        } else System.err.println("After Save Id is incremented by 1: FAILED (expected = " + expectedIncrement + ", actual = " + actualIncrement + ")");
    }

    public void testFindShapesById() {
        Shape expectedShape = shapeRepository.save(new Circle(BigDecimal.valueOf(6)));
        Integer savedId = expectedShape.getId();
        Shape actualShapeFromRepo = shapeRepository.shapeRepo.get(savedId);
        if (expectedShape.equals(actualShapeFromRepo)) {
            System.out.println("Find shape by Id is working: PASSED " +
                    "(expected = " + expectedShape + ", actual = " + actualShapeFromRepo + ")");
        } else {
            System.err.println("Find shape by Id is working: FAILED " +
                    "(expected = " + expectedShape + ", actual = " + actualShapeFromRepo + ")");
        }
    }

    public void testFindShapesByType(ShapeType type) {
        int actualCount = (int) shapeRepository.shapeRepo.entrySet().stream().filter(s->s.getClass().equals(type)).count();
        Optional<ArrayList<Shape>> shapesInRepo = shapeRepository.findShapesByType(type);

        int expectedCount = (int) shapesInRepo.stream().count();

        if (actualCount == expectedCount) {
            System.out.println("Find shape by Type is working: PASSED " +
                    "(expected = " + expectedCount + ", actual = " + actualCount + ")");
        } else {
            System.err.println("Find shape by Type is working: FAILED " +
                    "(expected = " + expectedCount + ", actual = " + actualCount + ")");
        }
    }
}
