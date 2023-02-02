package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromKelvinToFahrenheit;
import Lesson7.TemperatureConverter.TemperatureRequest;

public class ConversionRuleFromKelvinToFahrenheitTest {

    public static void testKelvinToFahrenheitConversion(double tempInKelvin, double expectedResult){
        ConversionRuleFromKelvinToFahrenheit conversion = new ConversionRuleFromKelvinToFahrenheit();
        double result = conversion.convert(new TemperatureRequest(tempInKelvin, 'K', 'F'));
        if (expectedResult==result) {
            System.out.println("K->F: for " + tempInKelvin + " K Return " + expectedResult + " F: PASSED");
        } else System.err.println("K->F: for " + tempInKelvin + " K Return " + expectedResult + " F: FAILED, " +
                "expected " + expectedResult + " but is " + result);
    }

    public static void testKelvinToFahrenheitIsProperConverterTrue (char unitFrom, char unitTo) {
        ConversionRuleFromKelvinToFahrenheit conversion = new ConversionRuleFromKelvinToFahrenheit();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (isProper) {
            System.out.println("K->F: for K and F return TRUE: PASSED");
        } else System.err.println("K->F: for K and F return TRUE: FAILED, expected TRUE but is FALSE");
    }
    public static void testKelvinToFahrenheitIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromKelvinToFahrenheit conversion = new ConversionRuleFromKelvinToFahrenheit();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("K->F: for other than K and F return FALSE: PASSED");
        } else System.err.println("K->F: for other than K and F return FALSE: FAILED, expected FALSE but is TRUE");
    }
}
