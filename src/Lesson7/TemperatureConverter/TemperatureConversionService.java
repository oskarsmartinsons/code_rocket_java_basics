package Lesson7.TemperatureConverter;

import java.util.ArrayList;

public class TemperatureConversionService {
    private ArrayList<TemperatureConverter> listOfConverters;

    public TemperatureConversionService(ArrayList<TemperatureConverter> listOfConverters) {
        this.listOfConverters = listOfConverters;
    }

    // logic - iterate through the list of converters and execute if matches with user input from/to unit
    public void convert (Temperature temperature) {
        listOfConverters.forEach(temperatureConverter-> temperatureConverter.covert(temperature));
    }
}
