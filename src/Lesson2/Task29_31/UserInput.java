package Lesson2.Task29_31;

import java.util.Scanner;

class UserInput {
    static String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the string: ");
        return input.nextLine();
    }
}