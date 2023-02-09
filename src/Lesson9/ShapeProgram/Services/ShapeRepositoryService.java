package Lesson9.ShapeProgram.Services;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShapeRepositoryService {
    private final List<ShapeMenu> shapeMenu;
    private final ShapeRepository shapeRepository;

    public ShapeRepositoryService(List<ShapeMenu> shapeMenu, ShapeRepository shapeRepository) {
        this.shapeMenu = shapeMenu;
        this.shapeRepository = shapeRepository;
    }

    public void storeShapeInRepo(ShapeType type) {
        for (ShapeMenu s:shapeMenu) {
            if(s.getType().equals(type)){
                Shape shape = s.getShape();
                shapeRepository.storeShape(shape);
            }
        }
/*
        shapeMenu.forEach();

        shapeMenu.stream()
                 .filter(s->s.getType().equals(type))
                 .map(ShapeMenu::getShape)
                .
                 .map(ShapeRepository::storeShape);*/
    }

    public ArrayList<Shape> retrieveShapesByType(ShapeType type) {
        return shapeRepository.getShapesByType(type);
    }

    public void printShapeList (ArrayList<Shape> shapesToPrint) {
/*        if(shapesToPrint==null) {

            System.out.println("Empty REPO");
        } else {
            System.out.println(shapesToPrint);
        }*/

        shapesToPrint.forEach(i -> {
            Optional.ofNullable(i)
                 //   .filter( shape -> shape.getType()!=null )
                    .ifPresentOrElse(shape -> System.out.println(shape), ()->System.out.println("Empty REPO"));
            //       .ifPresentOrElse(item -> System.out.println("Empty REPO"), () -> System.out.println(""));
        });

    }

    public BigDecimal sumShapePerimeterByType(ShapeType type) {
        BigDecimal allPerimeters = new BigDecimal("0.00");
        ArrayList<Shape> shapesInRepo = shapeRepository.getShapesByType(type);

        //shapesInRepo.forEach(s-> allPerimeters=allPerimeters.add(s.perimeter()));

        if (!(shapesInRepo==null)) {
            for (Shape shape : shapesInRepo) {
                allPerimeters = allPerimeters.add(shape.perimeter());
            }
        }else {
            allPerimeters = BigDecimal.valueOf(0);
        }
        return allPerimeters;
    }

    public BigDecimal sumShapeAreaByType(ShapeType type) {
        BigDecimal allArea = new BigDecimal("0.00");
        ArrayList<Shape> shapesInRepo = shapeRepository.getShapesByType(type);
        if (!(shapesInRepo==null)) {
        for (Shape shape : shapesInRepo) {
            allArea = allArea.add(shape.area());
        }
        } else allArea = BigDecimal.valueOf(0);

        return allArea;
    }

}
