package Lesson3.Task7;

import java.time.Month;
import java.time.YearMonth;

class Converter {
    private final int month;
    private final int year;
    public Converter(int month, int year) {
        this.month = month;
        this.year = year;
    }
    void returnDays() {
        YearMonth yearMonth = YearMonth.of(year,month);
        int days=yearMonth.lengthOfMonth();
        Month monthName = Month.of(month);
        System.out.println(monthName + " " + year + " has " + days);
    }
}
