package Lesson3.Task3;

import java.util.ArrayList;
import java.util.Collections;

class GetGreatestDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        ArrayList<Integer> numbers = userInput.input();
        GetGreatest getGreatest = new GetGreatest(numbers);
        getGreatest.getLargest();
    }
}