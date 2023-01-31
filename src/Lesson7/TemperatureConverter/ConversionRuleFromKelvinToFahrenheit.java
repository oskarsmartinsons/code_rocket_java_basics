package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToFahrenheit implements TemperatureConverter{
    private double  CONST1 = 1.8;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='K') && (temperature.getUnitTo()=='F')) {
            double result = CONST1*(temperature.getTemperature()-K) + CONST2;
            System.out.printf("Conversion Result from K->F: %.2f K is %.2f F", temperature.getTemperature(), result );
        }
    }
}
