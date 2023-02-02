package Lesson7.TemperatureConverter;

public class ConversionRuleFromFahrenheitToCelsius implements TemperatureConverter{
    private final double CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
        return (double) Math.round(((temperatureRequest.getTemperature()-CONST2) * CONST1)*100)/100;
    }
    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'F') && (temperatureRequest.getUnitTo() == 'C');
    }
}
