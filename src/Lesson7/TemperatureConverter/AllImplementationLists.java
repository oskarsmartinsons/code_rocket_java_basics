package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class AllImplementationLists {
    // put all conversion rules (converters) in array list (implementations of TemperatureConverters)
    ArrayList<TemperatureConverter> getConverters () {
        ArrayList<TemperatureConverter> converters = new ArrayList<>();
        converters.add(new ConversionRuleFromCelsiusToKelvin());
        converters.add(new ConversionRuleFromKelvinToCelsius());
        converters.add((new ConversionRuleFromCelsiusToFahrenheit()));
        converters.add((new ConversionRuleFromFahrenheitToCelsius()));
        converters.add((new ConversionRuleFromKelvinToFahrenheit()));
        converters.add((new ConversionRuleFromFahrenheitToKelvin()));
        return converters;
    }

    // put all conversion implementations of TemperatureFormulas in array list
    ArrayList<TemperatureFormula> getFormulas() {
        ArrayList<TemperatureFormula> formulas = new ArrayList<>();
        formulas.add(new ConversionRuleFromFahrenheitToCelsius());
        formulas.add(new ConversionRuleFromKelvinToCelsius());
        formulas.add(new ConversionRuleFromFahrenheitToKelvin());
        formulas.add(new ConversionRuleFromKelvinToFahrenheit());
        formulas.add(new ConversionRuleFromCelsiusToKelvin());
        formulas.add(new ConversionRuleFromCelsiusToFahrenheit());
        return formulas;
    }

    // put all action implementations of ActionMenu in array list
    ArrayList<ActionMenu> getActions(UserInput userInput,
                                     TemperatureConversionService temperatureConversionService,
                                     TemperatureFormulaService temperatureFormulaService,
                                     TemperatureVerificationService temperatureVerificationService) {
        ArrayList<ActionMenu> actions = new ArrayList<>();
        actions.add(new ActionConvert(userInput, temperatureConversionService));
        actions.add(new ActionShowFormula(userInput, temperatureFormulaService));
        actions.add(new ActionVerify(userInput, temperatureVerificationService));
        actions.add(new ActionExit());
        return actions;
    }
}
