package Lesson7.TemperatureConverterTests;

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
        // tests for conversion K->F
        ConversionRuleFromKelvinToFahrenheitTest.testKelvinToFahrenheitConversion(0,-459.67);
        ConversionRuleFromKelvinToFahrenheitTest.testKelvinToFahrenheitConversion(1,-457.87);
        ConversionRuleFromKelvinToFahrenheitTest.testKelvinToFahrenheitIsProperConverterTrue('K','F');
        ConversionRuleFromKelvinToFahrenheitTest.testKelvinToFahrenheitIsProperConverterFalse('C','K');
        // tests for conversion F->C
        ConversionRuleFromFahrenheitToCelsiusTest.testFahrenheitToCelsiusConversion(32,0);
        ConversionRuleFromFahrenheitToCelsiusTest.testFahrenheitToCelsiusConversion(0,-17.78);
        ConversionRuleFromFahrenheitToCelsiusTest.testFahrenheitToCelsiusIsProperConverterTrue('F', 'C');
        ConversionRuleFromFahrenheitToCelsiusTest.testFahrenheitToCelsiusIsProperConverterFalse('K', 'C');
        // test for conversion F->K
        ConversionRuleFromFahrenheitToKelvinTest.testFahrenheitToKelvinConversion(0,255.37);
        ConversionRuleFromFahrenheitToKelvinTest.testFahrenheitToKelvinConversion(-459.67,0);
        ConversionRuleFromFahrenheitToKelvinTest.testFahrenheitToCelsiusIsProperConverterTrue('F','K');
        ConversionRuleFromFahrenheitToKelvinTest.testFahrenheitToCelsiusIsProperConverterFalse('C','K');
    }
}
