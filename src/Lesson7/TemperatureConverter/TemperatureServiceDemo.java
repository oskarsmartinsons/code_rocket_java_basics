package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureServiceDemo {
    public static void main(String[] args) {
        // get array list of all conversion rules (converters) implementations and Formula implementations
        AllImplementationLists allImplementationLists = new AllImplementationLists();
        ArrayList<TemperatureConverter> converters = allImplementationLists.getConverters();
        ArrayList<TemperatureFormula> formulas = allImplementationLists.getFormulas();

        // pass converters to service class
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(converters);

        // pass formulas to service class
        TemperatureFormulaService temperatureFormulaService = new TemperatureFormulaService(formulas);

        // instance of UserInput needed as parameter for ActionConvert and UserMenu
        UserInput userInput = new UserInput();

        // get array list of all action implementations, and pass arguments where needed
        ArrayList<ActionMenu> actionsList = new ArrayList<>();
        actionsList.add(new ActionConvert(userInput, temperatureConversionService));
        actionsList.add(new ActionShowFormula(userInput, temperatureFormulaService));
        actionsList.add(new ActionExit());

        // start the program
        UserMenu userMenu = new UserMenu(userInput, actionsList);
        userMenu.startMenu();
    }
}
