package Lesson3.Task8;

import java.util.Scanner;

class UserInput {
    String inputChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        return input.nextLine();
    }
    boolean isInputValid( String input) {
        char myChar = input.charAt(0);
        if (input.length() > 1 || !Character.isAlphabetic(myChar)) {
            System.out.println("This is not a single letter, please enter single letter");
            return false;
        }
        return true;
    }
}
