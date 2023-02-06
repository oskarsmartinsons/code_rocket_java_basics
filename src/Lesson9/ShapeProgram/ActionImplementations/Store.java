package Lesson9.ShapeProgram.ActionImplementations;

public class Store implements ActionMenu {
    @Override
    public String getAction() {
        return "Store shape";
    }

    @Override
    public void executeAction() {
        System.out.println("Store shape is running (choose shape):");
        // display new menu
    }
}
