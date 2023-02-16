package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public class ConversionRuleFromCelsiusToKelvin implements TemperatureConverter, TemperatureFormula{
    private final double K = 273.15;
    @Override
    public double convert(TemperatureRequest temperatureRequest) {
        return (double) Math.round((temperatureRequest.getTemperature() + K)*100)/100;
    }

    @Override
    public boolean isProperConverter(TemperatureRequest temperatureRequest) {
        return (temperatureRequest.getUnitFrom() == 'C') && (temperatureRequest.getUnitTo() == 'K');
    }

    @Override
    public boolean isProperFormula(FormulaDetailsRequest formulaDetails) {
        return (formulaDetails.getUnitFrom() == 'C') && (formulaDetails.getUnitTo() == 'K');
    }

    @Override
    public String display(FormulaDetailsRequest formulaDetails) {
        return "Formula to C->K: tK = tC + 273.15";
    }
}
