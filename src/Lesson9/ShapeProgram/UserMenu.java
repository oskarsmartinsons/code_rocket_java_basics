package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.ActionMenu;

import java.util.List;

public class UserMenu {
    private List<ActionMenu> actionsList;
    public UserMenu(List<ActionMenu> actionsList) {
        this.actionsList = actionsList;
    }
    public void start() {
        while(true) {
            // display all options/actions in menu
            printActions(actionsList);
            // collect action number form user
            UserInput userInput = new UserInput();
            Integer actionNr = userInput.inputAction();
            // start action
            startAction(actionNr);
        }
    }
    public void startAction(Integer number) {
        actionsList.get(number).executeAction();
    }
    void printActions(List<ActionMenu> list) {
        System.out.println("---------------------------------------------");
        System.out.println("Choose action by number: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"."+list.get(i).getAction());
        }
        System.out.println("---------------------------------------------");
    }
}
