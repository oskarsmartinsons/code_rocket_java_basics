package Lesson9.ShapeProgram.Services;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.Validations.ArgumentIsNullException;
import Lesson9.ShapeProgram.Validations.ShapeNotFoundException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShapeRepositoryService {
    private final List<ShapeMenu> shapeMenu;
    private final ShapeRepository shapeRepository;

    public ShapeRepositoryService(List<ShapeMenu> shapeMenu, ShapeRepository shapeRepository) {
        this.shapeMenu = shapeMenu;
        this.shapeRepository = shapeRepository;
    }

    public void storeShapeInRepo(ShapeType type) {
        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");

        for (ShapeMenu s:shapeMenu) {
            if(s.getType().equals(type)){
                Shape shape = s.getShape();
                shapeRepository.save(shape);
            }
        }
    }

    public ArrayList<Shape> retrieveByTypeFromRepo(ShapeType type) {
        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");
        return
                shapeRepository.findShapesByType(type)
                                .orElseThrow(()-> new ShapeNotFoundException("There is not shapes in REPO"));
    }

    public void printShapeList (ArrayList<Shape> shapesToPrint) {
        if(shapesToPrint==null) throw new ArgumentIsNullException("Argument ArrayList<Shape> is null!");
        if (shapesToPrint.size()==0) {
            System.out.println("There is no such shapes in REPO");
        } else System.out.println(shapesToPrint);
    }

    public BigDecimal sumShapePerimeterByType(ShapeType type) {
        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");

        BigDecimal allPerimeters = new BigDecimal("0.00");
        ArrayList<Shape> shapesInRepo = shapeRepository.findShapesByType(type)
                                                        .orElseThrow(()-> new ShapeNotFoundException("There is no " + type + " in REPO"));

        if (!(shapesInRepo.isEmpty())) {
            for (Shape shape : shapesInRepo) {
                allPerimeters = allPerimeters.add(shape.perimeter());
            }
        }else {
            allPerimeters = BigDecimal.valueOf(0);
        }
        return allPerimeters ;
    }

    public BigDecimal sumShapeAreaByType(ShapeType type) {
        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");

        BigDecimal allArea = new BigDecimal("0.00");
        ArrayList<Shape> shapesInRepo = shapeRepository.findShapesByType(type)
                .orElseThrow(()-> new ShapeNotFoundException("There is no " + type + " in REPO"));

        if (!(shapesInRepo==null)) {
        for (Shape shape : shapesInRepo) {
            allArea = allArea.add(shape.area());
        }
        } else allArea = BigDecimal.valueOf(0);

        return allArea;
    }

}
