package Lesson3.Task7;

import java.util.Scanner;

class UserInput {
    int inputMonth () {
        Scanner input = new Scanner(System.in);
        System.out.println("Input month: ");
        return input.nextInt();
    }
    int inputYear() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input year: ");
        return input.nextInt();
    }
}
