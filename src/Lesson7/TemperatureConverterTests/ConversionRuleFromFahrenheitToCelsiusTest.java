package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromFahrenheitToCelsius;
import Lesson7.TemperatureConverter.TemperatureRequest;

public class ConversionRuleFromFahrenheitToCelsiusTest {
    public static void testFahrenheitToCelsiusConversion(double tempInFahrenheit, double expectedResult){
        ConversionRuleFromFahrenheitToCelsius conversion = new ConversionRuleFromFahrenheitToCelsius();
        double result = conversion.convert(new TemperatureRequest(tempInFahrenheit, 'F', 'C'));
        if (expectedResult==result) {
            System.out.println("F->C: for " + tempInFahrenheit + " F Return " + expectedResult + " C: PASSED");
        } else System.err.println("F->C: for " + tempInFahrenheit + " F Return " + expectedResult + " C: FAILED, " +
                "expected " + expectedResult + " but is " + result);
    }

    public static void testFahrenheitToCelsiusIsProperConverterTrue (char unitFrom, char unitTo) {
        ConversionRuleFromFahrenheitToCelsius conversion = new ConversionRuleFromFahrenheitToCelsius();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (isProper) {
            System.out.println("F->C: for F and C return TRUE: PASSED");
        } else System.err.println("F->C: for F and C return TRUE: FAILED, expected TRUE but is FALSE");
    }
    public static void testFahrenheitToCelsiusIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromFahrenheitToCelsius conversion = new ConversionRuleFromFahrenheitToCelsius();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("F->C: for other than F and C return FALSE: PASSED");
        } else System.err.println("F->C: for other than F and C return FALSE: FAILED, expected FALSE but is TRUE");
    }
}
