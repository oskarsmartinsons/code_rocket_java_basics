package Lesson3.Task6;

import java.util.Scanner;

class UserInput {
    float [] input() {
        float [] array = new float[2];
        for (int i = 0; i < 2 ; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input float number " + (i+1) + ":");
            array[i] = input.nextFloat();
        } return array;
    }
}
