package Lesson3.Task9;

class LeapYearDemo {
    public static void main(String[] args) {
        int test = UserInput.inputYear();
        LeapYear leapYear = new LeapYear();

        // print out
        System.out.printf("Is year %d a leap year? Answer: %b", test, leapYear.isLeapYear(test));
    }
}
