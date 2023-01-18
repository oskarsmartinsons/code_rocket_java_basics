package Lesson2.Task35;

class LeapYear {
    boolean isLeapYear(int year) {
        boolean dividesBy4 = (year % 4) == 0;
        boolean notDividesBy100 = (year % 100) != 0;
        boolean dividesBy100and400 = ((year % 100 == 0) && (year % 400 == 0));
        return dividesBy4 && (notDividesBy100 || dividesBy100and400);
    }
}
