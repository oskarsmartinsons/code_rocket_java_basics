package Lesson2.Task19;

import java.util.Scanner;

class UserInput {
    // input method
    static public String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to analyze:");
        return input.nextLine();
    }
}