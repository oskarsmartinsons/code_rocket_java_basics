package Lesson3.Task12;

import java.util.Scanner;

class UserInput {
    int[] inputNumber() {
        int[] arr = new int[5];
        System.out.println("Input 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        } return arr;
    }
}
