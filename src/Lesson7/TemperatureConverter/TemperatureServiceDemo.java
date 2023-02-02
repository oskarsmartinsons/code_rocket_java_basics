package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureServiceDemo {
    public static void main(String[] args) {
        // get array list of all conversion rules (converters) implementations
        AllConversionRules allConversionRules = new AllConversionRules();
        ArrayList<TemperatureConverter> converters = allConversionRules.getConverters();

        // pass converters to service class
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(converters);

        // instance of UserInput needed as parameter for ActionConvert and UserMenu
        UserInput userInput = new UserInput();

        // get array list of all action implementations, and pass arguments where needed
        ArrayList<ActionMenu> actionsList = new ArrayList<>();
        actionsList.add(new ActionConvert(userInput, temperatureConversionService));
        actionsList.add(new ActionExit());

        // start the program
        UserMenu userMenu = new UserMenu(userInput, actionsList);
        userMenu.startMenu();
    }
}
