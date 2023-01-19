package Lesson3.Task3;

import java.util.ArrayList;
import java.util.Collections;


class GetGreatest {
    private final ArrayList<Integer> numbers;
    public GetGreatest(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
    void getLargest () {
        int maxVal = Collections.max(numbers);
        //  System.out.println(maxVal);
        System.out.println("Using Collection - largest: " + maxVal);
    }
}