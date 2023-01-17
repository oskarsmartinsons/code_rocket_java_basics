package Lesson2.Task16;
import java.util.Scanner;

class UserInput {
    // input method
    public String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        return input.nextLine();
    }
}