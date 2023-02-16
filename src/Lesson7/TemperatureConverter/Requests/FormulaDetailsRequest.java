package Lesson7.TemperatureConverter.Requests;

import java.util.Objects;

public class FormulaDetailsRequest {
    private final char unitFrom;
    private final char unitTo;
    public FormulaDetailsRequest(char unitFrom, char unitTo) {
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
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
        FormulaDetailsRequest that = (FormulaDetailsRequest) o;
        return unitFrom == that.unitFrom && unitTo == that.unitTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitFrom, unitTo);
    }

    @Override
    public String toString() {
        return "FormulaDetails{" +
                "unitFrom=" + unitFrom +
                ", unitTo=" + unitTo +
                '}';
    }
}
