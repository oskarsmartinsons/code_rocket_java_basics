package Lesson7.TemperatureConverter.Services;

import Lesson7.TemperatureConverter.Requests.FormulaDetailsRequest;
import Lesson7.TemperatureConverter.TemperatureFormula;

import java.util.ArrayList;

public class TemperatureFormulaService {
    private ArrayList<TemperatureFormula> formulas;
    public TemperatureFormulaService(ArrayList<TemperatureFormula> formulas) {
        this.formulas = formulas;
    }
    public void displayFormula(FormulaDetailsRequest formulaDetails) {
        for (TemperatureFormula formula : formulas) {
            if(formula.isProperFormula(formulaDetails)) {
                String result = formula.display(formulaDetails);
                System.out.println(result+"\n");
            }
        }
/*        formulas.stream()
                .filter(formula -> formula.isProperFormula(formulaDetails))
                .findFirst()
                .map(formula -> formula.display(formulaDetails));*/
    }
}
