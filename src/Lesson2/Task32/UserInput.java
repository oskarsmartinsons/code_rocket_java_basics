package Lesson2.Task32;

import java.util.Scanner;
class UserInput {
    static int inputInteger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        return input.nextInt();
    }
}