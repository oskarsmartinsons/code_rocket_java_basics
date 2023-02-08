package Lesson9.ShapeProgram.ActionMenuImplementations;

import Lesson9.ShapeProgram.Shapes.ShapeType;

public class Exit implements ActionMenu {
    @Override
    public String getAction() {
        return "Exit";
    }
    @Override
    public void executeAction(ShapeType type) {
        System.out.println("Good bye!");
        System.exit(0);
    }
}
