package Lesson7.TemperatureConverter;

public class ConversionRuleFromFahrenheitToCelsius implements TemperatureConverter{
    private final double CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    @Override
    public double convert(Temperature temperature) {
        return (temperature.getTemperature()-CONST2) * CONST1;
    }
    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='F') && (temperature.getUnitTo()=='C')) {return true;}
        return false;
    }
}
