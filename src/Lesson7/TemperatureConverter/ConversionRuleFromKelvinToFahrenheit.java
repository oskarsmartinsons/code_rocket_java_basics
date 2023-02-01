package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToFahrenheit implements TemperatureConverter{
    private double  CONST1 = 1.8;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public double convert(Temperature temperature) {
        return (double) Math.round(100*(CONST1*(temperature.getTemperature()-K) + CONST2))/100;
    }

    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='K') && (temperature.getUnitTo()=='F')) {return true;}
        return false;
    }
}
