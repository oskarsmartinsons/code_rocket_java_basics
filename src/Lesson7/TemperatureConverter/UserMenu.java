package Lesson7.TemperatureConverter;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {
    private UserInput userInput;
    private ArrayList<ActionMenu> actionsList;
    public UserMenu(UserInput userInput, ArrayList<ActionMenu> actionsList) {
        this.userInput = userInput;
        this.actionsList = actionsList;
    }
    public void startMenu() {
        printOutActions();
        int actionNr = userInput.inputActionNumber();
        if(actionNr>=0 && actionNr < actionsList.size()) {
            actionsList.get(actionNr).executeAction();
        } else {
            System.out.println("Sorry, please enter correct action number!");
        }
    }
    public void printOutActions() {
        for (int i = 0; i < actionsList.size(); i++) {
            System.out.println(i+"."+actionsList.get(i).getAction());
        }
    }
}
