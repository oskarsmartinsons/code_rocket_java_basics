package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.ActionMenu;
import Lesson9.ShapeProgram.ActionImplementations.Exit;
import Lesson9.ShapeProgram.ActionImplementations.Start;
import Lesson9.ShapeProgram.ActionImplementations.Store;

import java.util.List;

public class Lists {

    List<ActionMenu> getActions () {
        return List.of(
                new Exit(),
                new Start(),
                new Store()
        );
    }

    List<ShapeMenu> getShapes () {
        return List.of(
                new TriangleOption()
        );
    }

}
