package Lesson7.TemperatureConverter;

public class ConversionRuleFromFahrenheitToCelsius implements TemperatureConverter{
    private final double CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='F') && (temperature.getUnitTo()=='C')) {
            double result = (temperature.getTemperature()-CONST2) * CONST1;
            System.out.printf("Conversion Result from F->C: %.2f F is %.2f C", temperature.getTemperature(), result );

        }
    }
}
