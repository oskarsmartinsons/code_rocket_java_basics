package Lesson7.TemperatureConverterTests;

import Lesson7.TemperatureConverter.ConversionRuleFromCelsiusToFahrenheit;
import Lesson7.TemperatureConverter.TemperatureRequest;

public class ConversionRuleFromCelsiusToFahrenheitTest {
  public static void testCelsiusToFahrenheitConversion(double tempInCelsius,double expectedResult){
        ConversionRuleFromCelsiusToFahrenheit conversion = new ConversionRuleFromCelsiusToFahrenheit();
        double result = conversion.convert(new TemperatureRequest(tempInCelsius, 'C', 'F'));
        if (expectedResult==result) {
            System.out.println("C->F: for " + tempInCelsius + " C Return " + expectedResult + " F: PASSED");
        } else System.err.println("C->F: for " + tempInCelsius + " C Return " + expectedResult + " F: FAILED, " +
                "expected " + expectedResult + " but is " + result);
  }
  public static void testCelsiusToFahrenheitIsProperConverterTrue (char unitFrom, char unitTo) {
      ConversionRuleFromCelsiusToFahrenheit conversion = new ConversionRuleFromCelsiusToFahrenheit();
      boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
      if (isProper) {
          System.out.println("C->F: for C and F return TRUE: PASSED");
      } else System.err.println("C->F: for C and F return TRUE: FAILED, expected TRUE but is FALSE");
  }
  public static void testCelsiusToFahrenheitIsProperConverterFalse (char unitFrom, char unitTo) {
        ConversionRuleFromCelsiusToFahrenheit conversion = new ConversionRuleFromCelsiusToFahrenheit();
        boolean isProper = conversion.isProperConverter( new TemperatureRequest(0, unitFrom, unitTo));
        if (!isProper) {
            System.out.println("C->F: for other than C and F return FALSE: PASSED");
        } else System.err.println("C->F: for other than C and F return FALSE: FAILED, expected FALSE but is TRUE");
    }
}

