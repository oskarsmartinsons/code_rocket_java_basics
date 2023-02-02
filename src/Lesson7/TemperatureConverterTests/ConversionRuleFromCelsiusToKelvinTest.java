package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromCelsiusToKelvin;
import Lesson7.TemperatureConverter.TemperatureRequest;

public class ConversionRuleFromCelsiusToKelvinTest{

    public static void testCelsiusToKelvinConversion(double tempInCelsius, double expectedResult){
        ConversionRuleFromCelsiusToKelvin conversion = new ConversionRuleFromCelsiusToKelvin();
        double result = conversion.convert(new TemperatureRequest(tempInCelsius, 'C', 'K'));
        if (expectedResult==result) {
            System.out.println("C->K: for " + tempInCelsius + " C Return " + expectedResult + " K: PASSED");
        } else System.err.println("C->K: for " + tempInCelsius + " C Return " + expectedResult + " K: FAILED, " +
                "expected " + expectedResult + " but is " + result);
    }

    public static void testCelsiusToKelvinIsProperConverterTrue (char unitFrom, char unitTo) {
        ConversionRuleFromCelsiusToKelvin conversion = new ConversionRuleFromCelsiusToKelvin();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (isProper) {
            System.out.println("C->K: for C and K return TRUE: PASSED");
        } else System.err.println("C->K: for C and K return TRUE: FAILED, expected TRUE but is FALSE");
    }
    public static void testCelsiusToKelvinIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromCelsiusToKelvin conversion = new ConversionRuleFromCelsiusToKelvin();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("C->K: for other than C and K return FALSE: PASSED");
        } else System.err.println("C->K: for other than C and K return FALSE: FAILED, expected FALSE but is TRUE");
    }
}
