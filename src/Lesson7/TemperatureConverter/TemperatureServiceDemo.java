package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureServiceDemo {
    public static void main(String[] args) {
        // get array list of all conversion rules (converters) implementations and Formula implementations
        AllImplementationLists allImplementationLists = new AllImplementationLists();
        ArrayList<TemperatureConverter> converters = allImplementationLists.getConverters();
        ArrayList<TemperatureFormula> formulas = allImplementationLists.getFormulas();

        // pass converters to service class, that is needed as argument for ActionConvert
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(converters);

        // pass formulas to service class, that is needed as argument for ActionShowFormula
        TemperatureFormulaService temperatureFormulaService = new TemperatureFormulaService(formulas);

        // pass instance of TemperatureService class to verification service, which is needed as argument for ActionVerify
        TemperatureVerificationService temperatureVerificationService = new TemperatureVerificationService(temperatureConversionService);

        // instance of TemperatureHistoryService class, which is needed for ActionShowHistory
        TemperatureHistoryService temperatureHistoryService = new TemperatureHistoryService();

        // instance of UserInput needed as parameter for ActionMenu and UserMenu
        UserInput userInput = new UserInput();

        // get array list of all action implementations, and pass arguments
        ArrayList<ActionMenu> actionsList = allImplementationLists.getActions (
                userInput,
                temperatureConversionService,
                temperatureFormulaService,
                temperatureVerificationService,
                temperatureHistoryService);

        // start the program
        UserMenu userMenu = new UserMenu(userInput, actionsList);
        userMenu.startMenu();
    }
}
