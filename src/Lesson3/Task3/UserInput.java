package Lesson3.Task3;

import java.util.ArrayList;
import java.util.Scanner;

class UserInput {
    ArrayList<Integer> input() {
        ArrayList<Integer>  numbers = new ArrayList<>();
        for (int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + (i + 1) + " number:");
            numbers.add(input.nextInt());
        }
        return numbers;
    }
}