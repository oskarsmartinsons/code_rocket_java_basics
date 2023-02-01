package Lesson7.TemperatureConverter;

public class ConversionRuleFromCelsiusToKelvin implements TemperatureConverter{
    private final double K = 273.15;
    @Override
    public double convert(Temperature temperature) {
        return (double) Math.round((temperature.getTemperature() + K)*100)/100;
    }

    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='C') && (temperature.getUnitTo()=='K')) {return true;}
        return false;
    }
}
