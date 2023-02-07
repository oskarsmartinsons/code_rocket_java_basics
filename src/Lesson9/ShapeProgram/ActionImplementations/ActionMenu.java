package Lesson9.ShapeProgram.ActionImplementations;

import Lesson9.ShapeProgram.Shapes.ShapeType;

public interface ActionMenu {
    String getAction();

    void executeAction(ShapeType type);
}
