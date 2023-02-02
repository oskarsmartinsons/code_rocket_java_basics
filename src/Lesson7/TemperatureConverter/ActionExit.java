package Lesson7.TemperatureConverter;

public class ActionExit implements ActionMenu{
    @Override
    public String getAction() {
        return "Exit";
    }

    @Override
    public void executeAction() {
        System.exit(0);
    }
}
