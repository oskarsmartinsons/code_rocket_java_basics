package Lesson7.TemperatureConverter;

public class ConversionRuleFromFahrenheitToKelvin implements TemperatureConverter{
    private double  CONST1 = (double) 5/9;
    private final int CONST2 = 32;
    private final double K = 273.15;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='F') && (temperature.getUnitTo()=='K')) {
            double result = (temperature.getTemperature()-CONST2)*CONST1 + K;
          //  System.out.println("Conversion Result from F->K: " + temperature.getTemperature() + "F is " + result + "K");
            System.out.printf("Conversion Result from F->F: %.2f F is %.2f K", temperature.getTemperature(), result );

        }
    }
}
