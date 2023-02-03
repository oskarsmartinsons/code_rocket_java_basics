package Lesson7.TemperatureConverter;

import java.util.Objects;

public class VerificationDetails {
    private char unitFrom;
    private double temperatureFrom;
    private char unitTo;
    private double temperatureTo;

    public VerificationDetails(char unitFrom, double temperatureFrom, char unitTo, double temperatureTo) {
        this.unitFrom = unitFrom;
        this.temperatureFrom = temperatureFrom;
        this.unitTo = unitTo;
        this.temperatureTo = temperatureTo;
    }

    public char getUnitFrom() {
        return unitFrom;
    }

    public double getTemperatureFrom() {
        return temperatureFrom;
    }

    public char getUnitTo() {
        return unitTo;
    }

    public double getTemperatureTo() {
        return temperatureTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerificationDetails that = (VerificationDetails) o;
        return unitFrom == that.unitFrom && Double.compare(that.temperatureFrom, temperatureFrom) == 0 && unitTo == that.unitTo && Double.compare(that.temperatureTo, temperatureTo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitFrom, temperatureFrom, unitTo, temperatureTo);
    }

    @Override
    public String toString() {
        return "VerificationDetails{" +
                "unitFrom=" + unitFrom +
                ", temperatureFrom=" + temperatureFrom +
                ", unitTo=" + unitTo +
                ", temperatureTo=" + temperatureTo +
                '}';
    }
}
