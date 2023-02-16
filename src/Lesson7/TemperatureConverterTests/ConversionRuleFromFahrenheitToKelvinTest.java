package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromFahrenheitToKelvin;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromFahrenheitToKelvinTest {
    public static void testFahrenheitToKelvinConversion(double tempInFahrenheit, double expectedResult){
        ConversionRuleFromFahrenheitToKelvin conversion = new ConversionRuleFromFahrenheitToKelvin();
        double result = conversion.convert(new TemperatureRequest(tempInFahrenheit, 'F', 'K'));
        if (expectedResult==result) {
            System.out.println("F->K: for " + tempInFahrenheit + " F Return " + expectedResult + " K: PASSED");
        } else System.err.println("F->K: for " + tempInFahrenheit + " F Return " + expectedResult + " K: FAILED, " +
                "expected " + expectedResult + " but is " + result);
    }

    public static void testFahrenheitToCelsiusIsProperConverterTrue (char unitFrom, char unitTo) {
        ConversionRuleFromFahrenheitToKelvin conversion = new ConversionRuleFromFahrenheitToKelvin();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (isProper) {
            System.out.println("F->K: for F and K return TRUE: PASSED");
        } else System.err.println("F->K: for F and K return TRUE: FAILED, expected TRUE but is FALSE");
    }
    public static void testFahrenheitToCelsiusIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromFahrenheitToKelvin conversion = new ConversionRuleFromFahrenheitToKelvin();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("F->K: for other than F and K return FALSE: PASSED");
        } else System.err.println("F->K: for other than F and K return FALSE: FAILED, expected FALSE but is TRUE");
    }
}
