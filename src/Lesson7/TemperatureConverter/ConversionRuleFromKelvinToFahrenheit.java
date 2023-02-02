package Lesson7.TemperatureConverter;

public class ConversionRuleFromKelvinToFahrenheit implements TemperatureConverter, TemperatureFormula{
    private double  CONST1 = 1.8;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
        return (double) Math.round(100*(CONST1*(temperatureRequest.getTemperature()-K) + CONST2))/100;
    }

    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'K') && (temperatureRequest.getUnitTo() == 'F');
    }

    @Override
    public boolean isProperFormula(FormulaDetails formulaDetails) {
        return  (formulaDetails.getUnitFrom() == 'K') && (formulaDetails.getUnitTo() == 'F');
    }

    @Override
    public String display(FormulaDetails formulaDetails) {
        return "Formula to K->F: tF = (tK - 273.15)*1.8 + 32";
    }
}
