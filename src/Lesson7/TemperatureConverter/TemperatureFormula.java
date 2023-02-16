package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;

public interface TemperatureFormula {
    boolean isProperFormula(FormulaDetailsRequest formulaDetails);

    String display(FormulaDetailsRequest formulaDetails);
}
