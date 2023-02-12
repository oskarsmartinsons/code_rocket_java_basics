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
            try {
            // display all shapes in menu > collect shape number > get shape type
            printTypeMenu(shapeList);
            Integer typeNr = userInput.inputOptionNumber(shapeList);
            ShapeType type = shapeList.get(typeNr).getType();

            // display all actions in menu > collect action number > start action
            printActionMenu(actionsList, type);
            Integer actionNr = userInput.inputOptionNumber(actionsList);

            // start specified action for selected type
            startAction(actionNr,type);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void startAction(Integer actionNumber, ShapeType type) {
        actionsList.get(actionNumber).executeAction(type);
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
