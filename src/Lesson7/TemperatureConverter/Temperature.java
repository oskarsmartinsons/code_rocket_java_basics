package Lesson7.TemperatureConverter;

import java.util.Objects;

public class Temperature {
    private final double temperature;
    private final char unitFrom;
    private final char unitTo;

    public Temperature(double temperature, char unitFrom, char unitTo) {
        this.temperature = temperature;
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
    }

    public double getTemperature() {
        return temperature;
    }

    public char getUnitFrom() {
        return unitFrom;
    }

    public char getUnitTo() {
        return unitTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temperature, temperature) == 0 && unitFrom == that.unitFrom && unitTo == that.unitTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, unitFrom, unitTo);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                ", unitFrom=" + unitFrom +
                ", unitTo=" + unitTo +
                '}';
    }
}
