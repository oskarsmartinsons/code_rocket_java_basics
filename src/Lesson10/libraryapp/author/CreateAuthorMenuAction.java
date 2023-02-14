package Lesson10.libraryapp.author;

import Lesson10.libraryapp.MenuAction;

import java.util.Scanner;

public class CreateAuthorMenuAction implements MenuAction {
    @Override
    public String getName() {
        return "Create author.";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        //...
    }
}