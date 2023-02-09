package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class ShapeRepository {
    public HashMap<ShapeType, ArrayList<Shape>> shapeRepository = new HashMap<>();

    public void storeShape(Shape shape) {
        ArrayList<Shape> repoList = new ArrayList<>();

        if (!shapeRepository.containsKey(shape.getType())) {
            repoList.add(shape);
            shapeRepository.put(shape.getType(), repoList);
        } else {
            repoList = shapeRepository.get(shape.getType());
            repoList.add(shape);
        }
        // shapeRepository.entrySet()
    }


    /*    public Optional<ArrayList<Shape>> getShapesByType(ShapeType type) {
            return Optional.ofNullable(shapeRepository.get(type));
        }*/
    public ArrayList<Shape> getShapesByType(ShapeType type) {
        return shapeRepository.get(type);
    }

    public void getRepo() {
        System.out.println(shapeRepository);
    }

}