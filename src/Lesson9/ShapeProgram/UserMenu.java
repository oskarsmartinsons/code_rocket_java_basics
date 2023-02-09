package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionMenuImplementations.ActionMenu;
import Lesson9.ShapeProgram.ShapeMenuImplementation.ShapeMenu;
import Lesson9.ShapeProgram.Shapes.ShapeType;

import java.util.List;

public class UserMenu {
    private final UserInput userInput;
    private final List<ActionMenu> actionsList;
    private final List<ShapeMenu> shapeList;

    public UserMenu(UserInput userInput, List<ActionMenu> actionsList, List<ShapeMenu> shapeList) {
        this.userInput = userInput;
        this.actionsList = actionsList;
        this.shapeList = shapeList;
    }

    public void start() {
        while(true) {
            // display shapes
            printTypeMenu(shapeList);
            // collect shape number from user
            Integer typeNr = userInput.inputOptionNumber();
            // get shape type from user
            ShapeType type = shapeList.get(typeNr).getType();

            // display all options/actions in menu
            printActionMenu(actionsList, type);
            // collect action number form user
            Integer actionNr = userInput.inputOptionNumber();
            // start specified action and type
            startAction(actionNr,type);
        }
    }
    public void startAction(Integer number, ShapeType type) {
        actionsList.get(number).executeAction(type);
    }

    void printActionMenu(List<ActionMenu> list, ShapeType type) {
        System.out.println("---------------------------------------------");
        System.out.println("Choose action for " + type +" by number: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"."+list.get(i).getAction());
        }
        System.out.println("---------------------------------------------");
    }

    void printTypeMenu(List<ShapeMenu> list) {
        System.out.println("---------------------------------------------");
        System.out.println("Choose shape by number: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"."+list.get(i).getType());
        }
        System.out.println("---------------------------------------------");
    }
}
