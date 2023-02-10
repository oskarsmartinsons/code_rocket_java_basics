package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.Shapes.Shape;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShapeRepository {
    private static Integer shapeIdSequence = 0;
    public HashMap<Integer, Shape> shapeRepo = new HashMap<>();

    public Shape save(Shape shape) {
        shapeRepo.put(shapeIdSequence,shape);
        shapeIdSequence++;
        return shape;
    }

    public Optional<ArrayList<Shape>> findShapesByType(ShapeType type) {
        return Optional.of((ArrayList<Shape>) shapeRepo.values().stream()
                .filter(shape->shape.getType().equals(type))
                .collect(Collectors.toList()));
    }

    public void getRepo() {
        System.out.println(shapeRepo);
    }

}