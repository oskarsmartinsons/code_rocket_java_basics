package Lesson10.libraryapp;

public class ExitMenuAction implements MenuAction{
    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
