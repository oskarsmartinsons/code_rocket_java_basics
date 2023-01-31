package Lesson7.TemperatureConverter;

public class ConversionRuleFromCelsiusToFahrenheit implements TemperatureConverter{
    private final double CONST1 = 1.8;
    private final int CONST2 = 32;
    @Override
    public double convert(Temperature temperature) {
      return temperature.getTemperature()*CONST1 + CONST2;
    }

    @Override
    public boolean isProperConverter(Temperature temperature) {
        if((temperature.getUnitFrom()=='C') && (temperature.getUnitTo()=='F')) {return true;}
        return false;
    }
}
