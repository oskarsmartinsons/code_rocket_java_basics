package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionMenuImplementations.*;
import Lesson9.ShapeProgram.Services.*;
import Lesson9.ShapeProgram.ShapeMenuImplementation.CircleType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.SquareType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.TriangleType;
import Lesson9.ShapeProgram.Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static ArrayList<Shape> storedShapes = new ArrayList<>();
    List<ActionMenu> getActionMenu(DisplayShapeService displayShapesService,
                                   StoreShapeService storeShapeService,
                                   SumPerimeterService sumPerimeterService,
                                   SumAreaService sumAreaService,
                                   CalculatePerimeterService calculatePerimeterService,
                                   CalculateAreaService calculateAreaService) {
        return List.of(
                new Store(storeShapeService),
                new SumPerimeter(sumPerimeterService),
                new SumArea(sumAreaService),
                new CalculatePerimeter(calculatePerimeterService),
                new CalculateArea(calculateAreaService),
                new DisplayShapes(displayShapesService),
                new Exit()
        );
    }

    List<ShapeMenu> getShapeMenu(){
        return List.of(
                new SquareType(),
                new TriangleType(),
                new CircleType()
        );
    }
}
