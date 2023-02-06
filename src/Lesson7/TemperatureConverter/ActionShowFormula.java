package Lesson7.TemperatureConverter;

public class ActionShowFormula implements ActionMenu{
    private final UserInput userInput;
    private final TemperatureFormulaService temperatureFormulaService;
    public ActionShowFormula(UserInput userInput, TemperatureFormulaService temperatureFormulaService) {
        this.userInput = userInput;
        this.temperatureFormulaService = temperatureFormulaService;
    }

    @Override
    public String getAction() {
        return "Show conversion formula";
    }

    @Override
    public void executeAction() {
        System.out.println("\nShow conversion formula:");
        FormulaDetails formulaDetails =  userInput.inputFormulaDetails();
        temperatureFormulaService.displayFormula(formulaDetails);
    }
}