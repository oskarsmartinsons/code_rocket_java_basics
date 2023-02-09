package Lesson9.ShapeProgram.Services;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.ShapeRepository;
import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.Validations.ArgumentIsNullException;

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

        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");

        for (ShapeMenu s:shapeMenu) {
            if(s.getType().equals(type)){
                Shape shape = s.getShape();
                shapeRepository.save(shape);
            }
        }
    }

    /*    public Shape storeShape2(ShapeType type) {
        return shapeMenu.stream()
                .filter(s->s.getType().equals(type))
                .map(ShapeMenu::getShape)
                .map(ShapeRepository::save);
    }*/


    public ArrayList<Shape> retrieveByTypeFromRepo(ShapeType type) {
        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");
        return shapeRepository.findShapesByType(type);
    }

    public void printShapeList (ArrayList<Shape> shapesToPrint) {
/*        if(shapesToPrint==null) {

            System.out.println("Empty REPO");
        } else {
            System.out.println(shapesToPrint);
        }*/
        if(shapesToPrint==null) throw new ArgumentIsNullException("Argument ArrayList<Shape> is null!");

        shapesToPrint.forEach(i -> {
            Optional.ofNullable(i)
                   // .filter( shape -> shape.getType()!=null )
                    .ifPresentOrElse(shape -> System.out.println(shape), ()->System.out.println("Empty REPO"));
        });
        shapeRepository.getRepo();
    }

    public BigDecimal sumShapePerimeterByType(ShapeType type) {

        if(type==null) throw new ArgumentIsNullException("Argument ShapeType is null!");

        BigDecimal allPerimeters = new BigDecimal("0.00");
        ArrayList<Shape> shapesInRepo = shapeRepository.findShapesByType(type);


        //BigDecimal all = new BigDecimal("0.00");
       // shapesInRepo.forEach(s-> all.add(s.perimeter()));

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
        ArrayList<Shape> shapesInRepo = shapeRepository.findShapesByType(type);

        if (!(shapesInRepo==null)) {
        for (Shape shape : shapesInRepo) {
            allArea = allArea.add(shape.area());
        }
        } else allArea = BigDecimal.valueOf(0);

        return allArea;
    }

}
