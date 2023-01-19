package Lesson3.Task4;

import java.util.Scanner;

class UserInput {
    float inputFloat () {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        return input.nextFloat();
    }
}