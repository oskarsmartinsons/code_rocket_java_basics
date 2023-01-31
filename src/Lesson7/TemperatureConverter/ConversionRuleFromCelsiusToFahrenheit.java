package Lesson7.TemperatureConverter;

public class ConversionRuleFromCelsiusToFahrenheit implements TemperatureConverter{
    private double CONST1 = 1.8;
    private final int CONST2 = 32;
    @Override
    public void covert(Temperature temperature) {
        if((temperature.getUnitFrom()=='C') && (temperature.getUnitTo()=='F')) {
            double result = (temperature.getTemperature()*CONST1 + CONST2);
          //  System.out.println("Conversion Result from C->F: " + temperature.getTemperature() + "C is " + result + "F");
            System.out.printf("Conversion Result from C->F: %.2f C is %.2f F", temperature.getTemperature(), result );

        }
    }
}
