package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToCelsius implements TemperatureConverter{
    private final double K = 273.15;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='K') && (temperature.getUnitTo()=='C')) {
            double result = temperature.getTemperature() - K;
            System.out.printf("Conversion Result from K->C: %.2f K is %.2f C", temperature.getTemperature(), result );

        }
    }
}
