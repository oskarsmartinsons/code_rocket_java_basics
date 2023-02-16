package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromKelvinToCelsius;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromKelvinToCelsiusTest {

    public static void testKelvinToCelsiusConversion(double tempInKelvin, double expectedResult){
        ConversionRuleFromKelvinToCelsius conversion = new ConversionRuleFromKelvinToCelsius();
        double result = conversion.convert(new TemperatureRequest(tempInKelvin, 'K', 'C'));
        if (expectedResult==result) {
            System.out.println("K->C: for " + tempInKelvin + " K Return " + expectedResult + " C: PASSED");
        } else System.err.println("K->C: for " + tempInKelvin + " K Return " + expectedResult + " C: FAILED, " +
                "expected " + expectedResult + " but is " + result);
    }

    public static void testKelvinToCelsiusIsProperConverterTrue (char unitFrom, char unitTo) {
        ConversionRuleFromKelvinToCelsius conversion = new ConversionRuleFromKelvinToCelsius();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (isProper) {
            System.out.println("K->C: for K and C return TRUE: PASSED");
        } else System.err.println("K->C: for K and C return TRUE: FAILED, expected TRUE but is FALSE");
    }
    public static void testKelvinToCelsiusIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromKelvinToCelsius conversion = new ConversionRuleFromKelvinToCelsius();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("K->C: for other than K and C return FALSE: PASSED");
        } else System.err.println("K->C: for other than K and C return FALSE: FAILED, expected FALSE but is TRUE");
    }
}
