package Lesson7.TemperatureConverter;

public class ActionConvert implements ActionMenu{
    private final UserInput userInput;
    private final TemperatureConversionService temperatureConversionService;

    public ActionConvert(UserInput userInput, TemperatureConversionService temperatureConversionService) {
        this.userInput = userInput;
        this.temperatureConversionService = temperatureConversionService;
    }
    @Override
    public String getAction() {
        return "Convert temperature";
    }

    @Override
    public void executeAction() {
        TemperatureRequest temperatureRequest = userInput.inputRequest();
        // get result
        double result = temperatureConversionService.convertTemperature(temperatureRequest);
        // print out result
        System.out.printf("Conversion Result from %s->%s: %.2f %s is %.2f %s%n",
                temperatureRequest.getUnitFrom(),
                temperatureRequest.getUnitTo(),
                temperatureRequest.getTemperature(),
                temperatureRequest.getUnitFrom(),
                result,
                temperatureRequest.getUnitTo()
        );
    }
}
