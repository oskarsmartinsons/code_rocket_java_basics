package Lesson3.Task30_31;

import java.util.Scanner;

class UserInput {
    int [] inputInteger() {
        int [] array = new int[3];
        for (int i = 0; i < 3 ; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input integer nr. " + (i+1) + ":");
            array[i] = input.nextInt();
        } return array;
    }
}