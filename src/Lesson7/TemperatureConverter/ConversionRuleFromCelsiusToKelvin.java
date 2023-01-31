package Lesson7.TemperatureConverter;

public class ConversionRuleFromCelsiusToKelvin implements TemperatureConverter{
    private final int K = 273;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='C') && (temperature.getUnitTo()=='K')) {
            double result = temperature.getTemperature() + K;
          //  System.out.println("Conversion Result C->K from " + temperature.getTemperature() + "C is " + result + "F");
            System.out.printf("Conversion Result from C->K: %.2f C is %.2f K", temperature.getTemperature(), result );

        }
    }
}
