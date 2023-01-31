package Lesson7.TemperatureConverter;

public interface TemperatureConverter {
    double convert(Temperature temperature);

    boolean isProperConverter(Temperature temperature);
}
