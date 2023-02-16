package Lesson7.TemperatureConverter.ActionImplementations;

import Lesson7.TemperatureConverter.Requests.ConversionHistoryRequest;
import Lesson7.TemperatureConverter.Services.TemperatureConversionService;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;
import Lesson7.TemperatureConverter.UserInput;

import java.util.ArrayList;
import java.util.Date;

public class ActionConvert implements ActionMenu{
    private final UserInput userInput;
    private final TemperatureConversionService temperatureConversionService;
    public static ArrayList<ConversionHistoryRequest> allHistory = new ArrayList<>();

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
        System.out.println("\nConvert Temperature:");
        TemperatureRequest temperatureRequest = userInput.inputRequest();
        // get result
        double result = temperatureConversionService.convertTemperature(temperatureRequest);
        // print out result
        System.out.printf("Conversion Result from %s->%s: %.2f %s is %.2f %s%n%n",
                temperatureRequest.getUnitFrom(),
                temperatureRequest.getUnitTo(),
                temperatureRequest.getTemperature(),
                temperatureRequest.getUnitFrom(),
                result,
                temperatureRequest.getUnitTo()
        );

        ConversionHistoryRequest conversionHistory = new ConversionHistoryRequest(
                temperatureRequest.getUnitFrom(),
                temperatureRequest.getTemperature(),
                temperatureRequest.getUnitTo(),
                result,
                new Date()
        );

        allHistory.add(conversionHistory);
    }
}
