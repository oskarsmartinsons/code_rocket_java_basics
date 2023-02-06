package Lesson9.ShapeProgram;

import java.util.List;

public class StoreShapeService {
    int userInputShape;
    List<ShapeMenu> storedShapesList;

    public void storeShape(String userInputShape, Shape figure) {
        Lists allList = new Lists();
        List<ShapeMenu> allShapes =  allList.getShapes();
        for (ShapeMenu shape:allShapes) {
            if(shape.filterShape(userInputShape)) {
                shape.store(figure);
            }
        };
    }
}
