package Lesson7.TemperatureConverter;

import java.util.Date;
import java.util.Objects;

public class ConversionHistory {
    private char unitFrom;
    private double tempFrom;
    private char unitTo;
    private double tempTo;
    private Date time;

    public ConversionHistory(char unitFrom, double tempFrom, char unitTo, double tempTo, Date time) {
        this.unitFrom = unitFrom;
        this.tempFrom = tempFrom;
        this.unitTo = unitTo;
        this.tempTo = tempTo;
        this.time = time;
    }

    public char getUnitFrom() {
        return unitFrom;
    }

    public double getTempFrom() {
        return tempFrom;
    }

    public char getUnitTo() {
        return unitTo;
    }

    public double getTempTo() {
        return tempTo;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversionHistory that = (ConversionHistory) o;
        return unitFrom == that.unitFrom && Double.compare(that.tempFrom, tempFrom) == 0 && unitTo == that.unitTo && Double.compare(that.tempTo, tempTo) == 0 && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitFrom, tempFrom, unitTo, tempTo, time);
    }

    @Override
    public String toString() {
        return "ConversionHistory{" +
                "unitFrom=" + unitFrom +
                ", tempFrom=" + tempFrom +
                ", unitTo=" + unitTo +
                ", tempTo=" + tempTo +
                ", time=" + time +
                '}';
    }
}
