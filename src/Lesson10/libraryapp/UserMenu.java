package Lesson10.libraryapp;

import java.util.List;
import java.util.Scanner;

public class UserMenu {
    private List<MenuAction> menuActionList;

    public UserMenu(List<MenuAction> menuActionList) {
        this.menuActionList = menuActionList;
    }

    public void start() {
        while(true) {
            printActionMenu();
            Integer actionNumber = inputActionNr();
            executeAction(actionNumber);
        }
    }

    public void printActionMenu() {
        System.out.println("\nSelect Action by number:");
        for (int i = 0; i < menuActionList.size(); i++) {
            System.out.println(i + "." + menuActionList.get(i).getName());
        }
    }
    public Integer inputActionNr() {
        Scanner input = new Scanner(System.in);
        Integer actionNr = input.nextInt();
        return actionNr;
    }
    public void executeAction(Integer actionNumber) {
        menuActionList.get(actionNumber).execute();
    }
}
