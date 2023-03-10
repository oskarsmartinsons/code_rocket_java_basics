package Lesson7.TemperatureConverter.Services;

import Lesson7.TemperatureConverter.Requests.TemperatureRequest;
import Lesson7.TemperatureConverter.VerificationDetails;

public class TemperatureVerificationService {
    private final TemperatureConversionService temperatureConversionService;
    public TemperatureVerificationService(TemperatureConversionService temperatureConversionService) {
        this.temperatureConversionService = temperatureConversionService;
    }

    public void verifyConversion(VerificationDetails verificationDetails) {
        double expectedResult = temperatureConversionService.convertTemperature(
                new TemperatureRequest(verificationDetails.getTemperatureFrom(),
                                       verificationDetails.getUnitFrom(), verificationDetails.getUnitTo()));
        if(verificationDetails.getTemperatureTo()==expectedResult) {
            System.out.println("Correct conversion result\n");
        } else {
        System.out.println("Incorrect conversion result, should be " + expectedResult + verificationDetails.getUnitTo()+"\n");
    }
    }


}
