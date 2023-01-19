package Lesson3.Task16_26;

import java.util.Scanner;

class UserInput {
    int inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows:  ");
        return input.nextInt();
    }
}
