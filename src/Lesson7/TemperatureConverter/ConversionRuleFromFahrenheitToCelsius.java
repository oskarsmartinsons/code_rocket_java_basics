package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromFahrenheitToCelsius implements TemperatureConverter, TemperatureFormula{
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

    @Override
    public boolean isProperFormula(FormulaDetailsRequest formulaDetails) {
        return  (formulaDetails.getUnitFrom() == 'F') && (formulaDetails.getUnitTo() == 'C');
    }

    @Override
    public String display(FormulaDetailsRequest formulaDetails) {
        return "Formula to F->C: tC = (tF - 32) * 5/9";
    }
}
