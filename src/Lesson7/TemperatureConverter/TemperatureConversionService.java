package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureConversionService {
    private ArrayList<TemperatureConverter> listOfConverters;

    public TemperatureConversionService(ArrayList<TemperatureConverter> listOfConverters) {
        this.listOfConverters = listOfConverters;
    }

    // logic - iterate through the list of converters and execute if matches with user input from/to unit
    public double convert (Temperature temperature) {
        double result=1000; //if incorrect inputs will return 1000 and wont be

        for (TemperatureConverter converter : listOfConverters) {
            if (converter.isProperConverter(temperature)) {
                result = converter.convert(temperature);
            }
        }
        return result;
    }
}
