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
            System.out.println("ShapeRepository: Shape is Saved in REPO: PASSED (expected = " +expectedResult+ ", actual = " + actualResult);
        } else  {
            System.err.println("ShapeRepository: Shape is Saved in REPO: FAILED (expected = " +expectedResult+ ", actual = " + actualResult);
        }
    }

    public void testIdIncrementationAfterSave() {
        Shape firstShape = shapeRepository.save(new Circle(BigDecimal.valueOf(6)));
        Shape secondShape = shapeRepository.save(new Square(BigDecimal.valueOf(2)));
        int expectedIncrement = 1;
        int actualIncrement = secondShape.getId() - firstShape.getId();
        if(expectedIncrement == actualIncrement) {
            System.out.println("ShapeRepository: After Save Id is incremented by 1 : PASSED (expected = " + expectedIncrement + ", actual = " + actualIncrement + ")");
        } else System.err.println("ShapeRepository: After Save Id is incremented by 1: FAILED (expected = " + expectedIncrement + ", actual = " + actualIncrement + ")");
    }

    public void testFindShapesById(Integer id) {
        shapeRepository.shapeRepo.clear();
        Shape expectedShape = new Circle(BigDecimal.valueOf(6));
        shapeRepository.shapeRepo.put(id,expectedShape);

        Shape actualShapeFromRepo = shapeRepository.findShapesById(id).get();

        if (expectedShape.equals(actualShapeFromRepo)) {
            System.out.println("ShapeRepository: Find shape by Id: PASSED " +
                    "(expected = " + expectedShape + ", actual = " + actualShapeFromRepo + ")");
        } else {
            System.err.println("ShapeRepository: Find shape by Id: FAILED " +
                    "(expected = " + expectedShape + ", actual = " + actualShapeFromRepo + ")");
        }
    }

    public void testFindShapesByType(ShapeType type) {
        shapeRepository.shapeRepo.clear();
        shapeRepository.shapeRepo.put(0,new Circle(BigDecimal.valueOf(5)));

        int actualCount = (int) shapeRepository.shapeRepo.entrySet().stream()
                .filter(s->s.getValue().getType().equals(type))
                .count();

        ArrayList<Shape> shapesInRepo = shapeRepository.findShapesByType(type).get();
        int expectedCount = (int) shapesInRepo.stream().count();

        if (actualCount == expectedCount) {
            System.out.println("ShapeRepository: Find shape by Type: PASSED " +
                    "(expected = " + expectedCount + ", actual = " + actualCount + ")");
        } else {
            System.err.println("ShapeRepository: Find shape by Type: FAILED " +
                    "(expected = " + expectedCount + ", actual = " + actualCount + ")");
        }
    }
}
