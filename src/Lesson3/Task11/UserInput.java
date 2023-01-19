package Lesson3.Task11;

import java.util.Scanner;

class UserInput {
 int inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        return input.nextInt();
    }
}
