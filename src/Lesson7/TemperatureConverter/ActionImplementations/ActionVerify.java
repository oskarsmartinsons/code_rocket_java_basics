package Lesson7.TemperatureConverter.ActionImplementations;

import Lesson7.TemperatureConverter.Services.TemperatureVerificationService;
import Lesson7.TemperatureConverter.UserInput;
import Lesson7.TemperatureConverter.VerificationDetails;

public class ActionVerify implements ActionMenu{
    private final UserInput userInput;
    private final TemperatureVerificationService temperatureVerificationService;

    public ActionVerify(UserInput userInput, TemperatureVerificationService temperatureVerificationService) {
        this.userInput = userInput;
        this.temperatureVerificationService = temperatureVerificationService;
    }

    @Override
    public String getAction() {
        return "Verify conversion results";
    }

    @Override
    public void executeAction() {
        System.out.println("\nVerify conversion results:");
        VerificationDetails verificationDetails = userInput.inputVerificationDetails();
        temperatureVerificationService.verifyConversion(verificationDetails);
    }
}
