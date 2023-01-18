package Lesson2.Task44;

import java.util.Scanner;

class UserInput {
    static int[] inputIntegers() {
        int[] myIntegers = new int[3];
        for (int i = 1; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input number"+(i)+":");
            myIntegers[i-1]=input.nextInt();
        }
        return myIntegers;
    }
}
