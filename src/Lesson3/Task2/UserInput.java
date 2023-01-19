package Lesson3.Task2;

import java.util.Scanner;

class UserInput {
    int [] input() {
        int [] array = new int[3];
        char k= 'a';
        for (int i = 0; i < 3 ; i++ , k++ ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + k + ":");
            array[i] = input.nextInt();
        } return array;
    }
}