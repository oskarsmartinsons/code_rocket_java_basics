package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.ActionImplementations.ActionMenu;

import java.util.List;

public class ShapeProgramDemo {
    public static void main(String[] args) {
        Lists allLists = new Lists();
        List<ActionMenu> actionList = allLists.getActions();
        // display actions:
        UserMenu userMenu = new UserMenu(actionList);
        // start program
        userMenu.start();
    }
}
