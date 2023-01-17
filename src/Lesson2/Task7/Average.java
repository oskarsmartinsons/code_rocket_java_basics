package Lesson2.Task7;

class Average {
    private final double first, second, third;
    public Average(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    void calculateAverage() {
        System.out.println("Calculate average of thee numbers:");
        double result = (first+second+third)/3;
        System.out.println("Average of three numbers is:  " + result);
    }
}