package Lesson2.Task6v2;

import java.util.Scanner;

class UserInput {
    static double input() {
        Scanner inputDimension = new Scanner(System.in);
        System.out.println("Enter rectangular dimension: ");
        return inputDimension.nextDouble();
    }
}