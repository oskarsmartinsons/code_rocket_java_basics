package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureServiceDemo {
    public static void main(String[] args) {
        // get array list of all conversion rules (converters)
        AllConversionRules allConversionRules = new AllConversionRules();
        ArrayList<TemperatureConverter> converters = allConversionRules.getConverters();

        // get user inputs and pass to Temperature object
        UserInput userInput = new UserInput();
        Temperature temperature = userInput.input();

        // iterate through converters and execute void to the one that matches with user input
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(converters);
        temperatureConversionService.convert(temperature);
    }
}
