package Lesson2.Task7;
import java.util.Scanner;
class UserInput {
    static double input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        return input.nextDouble();
    }
}