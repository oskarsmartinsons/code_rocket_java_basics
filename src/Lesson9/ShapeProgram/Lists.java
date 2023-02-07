package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.*;
import Lesson9.ShapeProgram.Services.DisplayShapeService;
import Lesson9.ShapeProgram.Services.SumAreaService;
import Lesson9.ShapeProgram.Services.SumPerimeterService;
import Lesson9.ShapeProgram.ShapeMenuImplementation.CircleType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.SquareType;
import Lesson9.ShapeProgram.ShapeMenuImplementation.TriangleType;
import Lesson9.ShapeProgram.Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static ArrayList<Shape> listOfShapes = new ArrayList<>();
    List<ActionMenu> getActions (DisplayShapeService displayShapesService,
                                 SumPerimeterService sumPerimeterService,
                                 SumAreaService sumAreaService) {
        return List.of(
                new Exit(),
                new Store(),
                new SumPerimeter(sumPerimeterService),
                new SumArea(sumAreaService),
                new DisplayShapes(displayShapesService)
        );
    }

    List<ShapeMenu> getShapes(){
        return List.of(
                new SquareType(),
                new TriangleType(),
                new CircleType()
        );
    }
}
