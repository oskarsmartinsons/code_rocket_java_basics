package Lesson9.ShapeProgram.ActionImplementations;

public class Start implements ActionMenu {
    @Override
    public String getAction() {
        return "Start";
    }

    @Override
    public void executeAction() {
        System.out.println("Stated!");
    }
}
