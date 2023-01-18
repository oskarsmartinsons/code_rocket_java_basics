package Lesson2.Task39;

import java.util.Scanner;

class UserInput {
    static int inputSideCount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of sides: ");
        return input.nextInt();
    }
    static int inputSideLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the side: ");
        return input.nextInt();
    }
}
