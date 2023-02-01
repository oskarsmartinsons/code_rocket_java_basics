package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToCelsius implements TemperatureConverter{
    private final double K = 273.15;
    @Override
    public double convert(Temperature temperature) {
        return (double) Math.round((temperature.getTemperature() - K)*100)/100;
    }

    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='K') && (temperature.getUnitTo()=='C')) {return true;}
        return false;
    }
}
