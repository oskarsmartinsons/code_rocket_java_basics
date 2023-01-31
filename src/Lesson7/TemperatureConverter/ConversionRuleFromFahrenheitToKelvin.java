package Lesson7.TemperatureConverter;

public class ConversionRuleFromFahrenheitToKelvin implements TemperatureConverter{
    private double  CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public double convert(Temperature temperature) {
        double result = (temperature.getTemperature()-CONST2)*CONST1 + K;
        return result;
    }
    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='F') && (temperature.getUnitTo()=='K')) {return true;}
        return false;
    }
}
