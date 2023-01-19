package Lesson3.Task1;

import java.util.Scanner;

class SignChecker {
    void isPositive() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive (inc.Zero)");
        }
    }
}