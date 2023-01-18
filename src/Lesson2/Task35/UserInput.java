package Lesson2.Task35;

import java.util.Scanner;

class UserInput {
    static int inputYear() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        return input.nextInt();
    }
}
