package Lesson9.ShapeProgram.ActionImplementations;

public class Exit implements ActionMenu {
    @Override
    public String getAction() {
        return "Exit";
    }

    @Override
    public void executeAction() {
        System.out.println("Good bye!");
        System.exit(0);
    }
}
