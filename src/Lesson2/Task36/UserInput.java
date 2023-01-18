package Lesson2.Task36;

import java.util.Scanner;

public class UserInput {
    static String inputPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
        return input.nextLine();
    }
}
