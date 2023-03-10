package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.ActionImplementations.ActionMenu;

import java.util.ArrayList;

public class UserMenu {
    private final UserInput userInput;
    private final ArrayList<ActionMenu> actionsList;
    public UserMenu(UserInput userInput, ArrayList<ActionMenu> actionsList) {
        this.userInput = userInput;
        this.actionsList = actionsList;
    }
    public void startMenu() {
        while (true) {
            printOutActions();
            int actionNr = userInput.inputActionNumber();
            if (actionNr >= 0 && actionNr < actionsList.size()) {
                actionsList.get(actionNr).executeAction();
            } else {
                System.out.println("Sorry, please enter correct action number!");
            }
        }
    }
    public void printOutActions() {
        for (int i = 0; i < actionsList.size(); i++) {
            System.out.println(i+"."+actionsList.get(i).getAction());
        }
    }
}
