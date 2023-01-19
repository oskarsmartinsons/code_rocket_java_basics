package Lesson3.Task8;

import java.util.Scanner;

class UserInput {
    String inputChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String myLetter = input.nextLine();
        char myChar = myLetter.charAt(0);
        if (myLetter.length() > 1 || !Character.isAlphabetic(myChar)) {
            return "This is not a single letter, please enter single letter";
        }
        if (!Character.isAlphabetic(myChar)) {
            return "This is not a single letter, please enter single letter";
        }
        return myLetter;
    }
}
