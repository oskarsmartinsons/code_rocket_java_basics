package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToCelsius implements TemperatureConverter, TemperatureFormula{
    private final double K = 273.15;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
        return (double) Math.round((temperatureRequest.getTemperature() - K)*100)/100;
    }

    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'K') && (temperatureRequest.getUnitTo() == 'C');
    }

    @Override
    public boolean isProperFormula(FormulaDetails formulaDetails) {
        return (formulaDetails.getUnitFrom() == 'K') && (formulaDetails.getUnitTo() == 'C');
    }

    @Override
    public String display(FormulaDetails formulaDetails) {
        return "Formula to K->C: tC = tK - 273.15";
    }
}
