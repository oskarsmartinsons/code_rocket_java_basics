package Lesson7.TemperatureConverter;

import java.util.Objects;

public class FormulaDetails {
    private final char unitFrom;
    private final char unitTo;
    public FormulaDetails(char unitFrom, char unitTo) {
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
        FormulaDetails that = (FormulaDetails) o;
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
