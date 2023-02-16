package Lesson7.TemperatureConverter;

import Lesson7.TemperatureConverter.Requests.TemperatureRequest;

public interface TemperatureConverter {
    double convert(TemperatureRequest temperatureRequest);
    boolean isProperConverter(TemperatureRequest temperatureRequest);
}
