package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromFahrenheitToKelvin implements TemperatureConverter, TemperatureFormula{
    private double  CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
        return (double) Math.round(((temperatureRequest.getTemperature()-CONST2)*CONST1 + K)*100)/100;
    }
    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'F') && (temperatureRequest.getUnitTo() == 'K');
    }

    @Override
    public boolean isProperFormula(FormulaDetailsRequest formulaDetails) {
        return (formulaDetails.getUnitFrom() == 'F') && (formulaDetails.getUnitTo() == 'K');
    }

    @Override
    public String display(FormulaDetailsRequest formulaDetails) {
        return "Formula to F->K: tK = (tF - 32) * 5/9 + 273.15";
    }
}
