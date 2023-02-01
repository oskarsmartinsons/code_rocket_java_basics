package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromKelvinToCelsius;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        // tests for conversion C->F
        ConversionRuleFromCelsiusToFahrenheitTest.testCelsiusToFahrenheitConversion(0, 32);
        ConversionRuleFromCelsiusToFahrenheitTest.testCelsiusToFahrenheitConversion(1, 33.8);
        ConversionRuleFromCelsiusToFahrenheitTest.testCelsiusToFahrenheitIsProperConverterTrue('C','F');
        ConversionRuleFromCelsiusToFahrenheitTest.testCelsiusToFahrenheitIsProperConverterFalse('C','K');
        // tests for conversion C->K
        ConversionRuleFromCelsiusToKelvinTest.testCelsiusToKelvinConversion(0,273.15);
        ConversionRuleFromCelsiusToKelvinTest.testCelsiusToKelvinConversion(-273.15,0);
        ConversionRuleFromCelsiusToKelvinTest.testCelsiusToKelvinIsProperConverterTrue('C', 'K');
        ConversionRuleFromCelsiusToKelvinTest.testCelsiusToKelvinIsProperConverterFalse('F', 'K');
        // tests for conversion K->C
        ConversionRuleFromKelvinToCelsiusTest.testKelvinToCelsiusConversion(0, -273.15);
        ConversionRuleFromKelvinToCelsiusTest.testKelvinToCelsiusConversion(273.15, 0);
        ConversionRuleFromKelvinToCelsiusTest.testKelvinToCelsiusIsProperConverterTrue('K', 'C');
        ConversionRuleFromKelvinToCelsiusTest.testKelvinToCelsiusIsProperConverterFalse('F', 'C');
    }

}
