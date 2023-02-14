package Lesson9.ShapeProgramTests;

import Lesson9.ShapeProgram.Services.ShapeRepositoryService;
import Lesson9.ShapeProgram.Services.ValidationService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.CircleType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.SquareType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.TriangleType;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
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
        shapeRepository.shapeRepo.clear();
        Shape expectedSavedShape = shapeRepositoryService.storeShapeInRepo(type);
        Integer expectedSavedShapeId = expectedSavedShape.getId();
        Shape actualShape = shapeRepository.shapeRepo.get(expectedSavedShapeId);

        if(expectedSavedShape.equals(actualShape)) {
            System.out.println("ShapeRepositoryService: Shape is stored in REPO: PASSED " +
                    "(expected = " +expectedSavedShape+ ", actual = " + actualShape);
        } else  {
            System.err.println("ShapeRepositoryRepositoryService: Shape is stored in REPO: FAILED " +
                    "(expected = " +expectedSavedShape+ ", actual = " + actualShape);
        }
    }
    public void testRetrieveShapesByTypeFromRepo(ShapeType type) {
        Shape testShape = new Circle (BigDecimal.valueOf(5));

        shapeRepository.shapeRepo.clear();
        shapeRepository.shapeRepo.put(0,testShape);

        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(0, testShape );

        ArrayList<Shape> actualList = shapeRepositoryService.retrieveShapesByTypeFromRepo(type);

        if(expectedList.equals(actualList)) {
            System.out.println("ShapeRepositoryService: Retrieved shapes from REPO by type: PASSED " +
                    "(expected = " +expectedList+ ", actual = " + actualList);
        } else  {
            System.err.println("ShapeRepositoryRepositoryService: Retrieved shapes from REPO by type: FAILED " +
                    "(expected = " +expectedList+ ", actual = " + actualList);
        }
    }

    public void testSumShapePerimeterByType(ShapeType type){
        Shape testShape1 = new Square(BigDecimal.valueOf(1));
        Shape testShape2 = new Square(BigDecimal.valueOf(3));
        Shape testShape3 = new Circle(BigDecimal.valueOf(5));
        Shape testShape4 = new Circle(BigDecimal.valueOf(7));
        Shape testShape5 = new Triangle(BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
        Shape testShape6 = new Triangle(BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7));

        shapeRepository.shapeRepo.clear();
        shapeRepository.shapeRepo.put(0,testShape1);
        shapeRepository.shapeRepo.put(1,testShape2);
        shapeRepository.shapeRepo.put(2,testShape3);
        shapeRepository.shapeRepo.put(3,testShape4);
        shapeRepository.shapeRepo.put(4,testShape5);
        shapeRepository.shapeRepo.put(5,testShape6);

        BigDecimal expectedSumSquares = new BigDecimal("16.00");
        BigDecimal expectedSumCircles = new BigDecimal("75.40");
        BigDecimal expectedSumTriangles = new BigDecimal("27.00");

        BigDecimal actualSumSquares = shapeRepositoryService.sumShapePerimeterByType(type).setScale(2, RoundingMode.CEILING);
        BigDecimal actualSumCircles = shapeRepositoryService.sumShapePerimeterByType(type).setScale(2, RoundingMode.CEILING);
        BigDecimal actualSumTriangles = shapeRepositoryService.sumShapePerimeterByType(type).setScale(2, RoundingMode.CEILING);
        // square type
        if(type.equals(ShapeType.SQUARE) && expectedSumSquares.equals(actualSumSquares)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                    "(expected = " +expectedSumSquares+ ", actual = " + actualSumSquares +")");
        } else if (type.equals(ShapeType.SQUARE)) {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                    "(expected = " +expectedSumSquares+ ", actual = " + actualSumSquares+")");
        }
        // circle type
        if(type.equals(ShapeType.CIRCLE) && expectedSumCircles.equals(actualSumCircles)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                "(expected = " +expectedSumCircles+ ", actual = " + actualSumCircles+")");
        } else if (type.equals(ShapeType.CIRCLE))  {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                "(expected = " +expectedSumCircles+ ", actual = " + actualSumCircles+")");
        }
        // triangle type
        if(type.equals(ShapeType.TRIANGLE) && expectedSumTriangles.equals(actualSumTriangles)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                    "(expected = " +expectedSumTriangles+ ", actual = " + actualSumTriangles+")");
        } else if (type.equals(ShapeType.TRIANGLE))  {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                    "(expected = " +expectedSumTriangles+ ", actual = " + actualSumTriangles+")");
        }
    }

    public void testSumShapeAreaByType(ShapeType type){
        Shape testShape1 = new Square(BigDecimal.valueOf(1));
        Shape testShape2 = new Square(BigDecimal.valueOf(3));
        Shape testShape3 = new Circle(BigDecimal.valueOf(5));
        Shape testShape4 = new Circle(BigDecimal.valueOf(7));
        Shape testShape5 = new Triangle(BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
        Shape testShape6 = new Triangle(BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7));

        shapeRepository.shapeRepo.clear();
        shapeRepository.shapeRepo.put(0,testShape1);
        shapeRepository.shapeRepo.put(1,testShape2);
        shapeRepository.shapeRepo.put(2,testShape3);
        shapeRepository.shapeRepo.put(3,testShape4);
        shapeRepository.shapeRepo.put(4,testShape5);
        shapeRepository.shapeRepo.put(5,testShape6);

        BigDecimal expectedSumSquares = new BigDecimal("10.00");
        BigDecimal expectedSumCircles = new BigDecimal("232.48");
        BigDecimal expectedSumTriangles = new BigDecimal("17.60");

        BigDecimal actualSumSquares = shapeRepositoryService.sumShapeAreaByType(type).setScale(2, RoundingMode.CEILING);
        BigDecimal actualSumCircles = shapeRepositoryService.sumShapeAreaByType(type).setScale(2, RoundingMode.CEILING);
        BigDecimal actualSumTriangles = shapeRepositoryService.sumShapeAreaByType(type).setScale(2, RoundingMode.CEILING);
        // square type
        if(type.equals(ShapeType.SQUARE) && expectedSumSquares.equals(actualSumSquares)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                    "(expected = " +expectedSumSquares+ ", actual = " + actualSumSquares +")");
        } else if (type.equals(ShapeType.SQUARE)) {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                    "(expected = " +expectedSumSquares+ ", actual = " + actualSumSquares+")");
        }
        // circle type
        if(type.equals(ShapeType.CIRCLE) && expectedSumCircles.equals(actualSumCircles)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                    "(expected = " +expectedSumCircles+ ", actual = " + actualSumCircles+")");
        } else if (type.equals(ShapeType.CIRCLE))  {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                    "(expected = " +expectedSumCircles+ ", actual = " + actualSumCircles+")");
        }
        // triangle type
        if(type.equals(ShapeType.TRIANGLE) && expectedSumTriangles.equals(actualSumTriangles)) {
            System.out.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": PASSED " +
                    "(expected = " +expectedSumTriangles+ ", actual = " + actualSumTriangles+")");
        } else if (type.equals(ShapeType.TRIANGLE))  {
            System.err.println("ShapeRepositoryService: sumShapePerimeterByType " +type+ ": FAILED " +
                    "(expected = " +expectedSumTriangles+ ", actual = " + actualSumTriangles+")");
        }
    }

}
