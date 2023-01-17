package Lesson2.Task8;

import java.util.Scanner;

class UserInput {
    // inputs methods
    static int inputRealPart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of real part: ");
        return input.nextInt();
    }
    static int inputImgPart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of imaginary part: ");
        return input.nextInt();
    }
}