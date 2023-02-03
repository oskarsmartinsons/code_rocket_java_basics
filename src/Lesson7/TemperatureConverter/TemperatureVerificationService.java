package Lesson7.TemperatureConverter;

public class TemperatureVerificationService {
    private TemperatureConversionService temperatureConversionService;
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
        System.out.println("Incorrect conversion result, should be " + expectedResult + verificationDetails.getTemperatureTo()+"\n");
    }
    }


}
