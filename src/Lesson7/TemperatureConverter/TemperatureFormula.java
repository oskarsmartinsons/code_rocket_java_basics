package Lesson7.TemperatureConverter;

public interface TemperatureFormula {
    boolean isProperFormula(FormulaDetails formulaDetails);

    String display(FormulaDetails formulaDetails);
}
