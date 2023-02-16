package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromCelsiusToFahrenheit implements TemperatureConverter, TemperatureFormula{
    private final double CONST1 = 1.8;
    private final int CONST2 = 32;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
      return (double) Math.round((temperatureRequest.getTemperature()*CONST1 + CONST2)*100)/100;
    }

    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'C') && (temperatureRequest.getUnitTo() == 'F');
    }

    @Override
    public boolean isProperFormula(FormulaDetailsRequest formulaDetails) {
        return (formulaDetails.getUnitFrom() == 'C') && (formulaDetails.getUnitTo() == 'F');
    }

    @Override
    public String display(FormulaDetailsRequest formulaDetails) {
        return "Formula to C->F: tF = tC * 1.8 + 32";
    }
}
