package Lesson7.TemperatureConverter;

public interface TemperatureConverter {
    double convert(TemperatureRequest temperatureRequest);
    boolean isProperConverter(TemperatureRequest temperatureRequest);
}
