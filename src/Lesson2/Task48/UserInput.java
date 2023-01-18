package Lesson2.Task48;

import java.util.Scanner;

class UserInput {
    static String inputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a String: ");
        return input.nextLine();
    }
}
