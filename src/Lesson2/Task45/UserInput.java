package Lesson2.Task45;

import java.util.Scanner;

class UserInput {
    static int inputInteger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer(positive/negative): ");
        return input.nextInt();
    }
}
