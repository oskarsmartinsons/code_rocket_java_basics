package Lesson2.Task7;
public class Average {
    private double first;
    private double second;
    private double third;

    public Average(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public double getFirst() {return first;}
    public double getSecond() {return second;}
    public double getThird() {return third;}

    public void calculateAverage (Average average){
        double result = (average.getFirst()+average.getSecond()+average.getThird())/3;
        System.out.println(result);
    }
}
