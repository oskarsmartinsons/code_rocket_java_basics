package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class AllConversionRules {
    // put all conversion rules (converters) in array list
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
}
