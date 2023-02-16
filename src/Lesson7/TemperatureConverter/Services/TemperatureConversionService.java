package Lesson7.TemperatureConverter.Services;

import Lesson7.TemperatureConverter.TemperatureConverter;
import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

import java.util.ArrayList;

public class TemperatureConversionService {
    private ArrayList<TemperatureConverter> listOfConverters;

    public TemperatureConversionService(ArrayList<TemperatureConverter> listOfConverters) {
        this.listOfConverters = listOfConverters;
    }

    // logic - iterate through the list of converters and execute if matches with user input from/to unit
    public double convertTemperature (TemperatureRequest temperatureRequest) {
        for (TemperatureConverter converter : listOfConverters) {
            if (converter.isProperConverter(temperatureRequest)) {
                return converter.convert(temperatureRequest);
            }
        }
        return 0;
    }
}
