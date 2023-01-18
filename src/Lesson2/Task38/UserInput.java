package Lesson2.Task38;

import java.util.Scanner;

class UserInput {
    static double[] inputSides() {
        double[] sides = new double[3];
        for (int i = 1; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input side-"+i);
            sides[i-1]=input.nextDouble();
        }
        return sides;
    }
}
