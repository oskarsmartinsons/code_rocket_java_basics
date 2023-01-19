package Lesson3.Task13;

import java.util.Scanner;

class UserInput {
    int inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :  ");
        return input.nextInt();
    }
}
